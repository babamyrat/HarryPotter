package com.example.harrypotter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupActivity extends AppCompatActivity {

    private static String JsonUrl;
    private List<ExampleItem> mExampleList;
    private RecyclerView recyclerView;
    private ExampleAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        // back button
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();

        if (extras != null){
            JsonUrl = extras.getString("key");
        }

        mExampleList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        GetData getData = new GetData();
        getData.execute();


    }

    public class GetData extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {

            String current = "";

            try {
                URL url;
                HttpURLConnection urlConnection = null;
                try {
                    url = new URL(JsonUrl);
                    urlConnection = (HttpURLConnection) url.openConnection();

                    InputStream is = urlConnection.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);

                    int data = isr.read();
                    while (data != -1){

                        current += (char) data;
                        data = isr.read();

                    }
                    return current;

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (urlConnection != null){
                        urlConnection.disconnect();
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return current;
        }

        @Override
        protected void onPostExecute(String s) {

            try {


                JSONArray jsonArray = new JSONArray(s);

                for (int i = 0; i < jsonArray.length(); i++){

                    JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                    ExampleItem model = new ExampleItem();
                    model.setName(jsonObject1.getString("name"));
                    model.setSpecies(jsonObject1.getString("species"));
                    model.setGender(jsonObject1.getString("gender"));
                    model.setHouse(jsonObject1.getString("house"));
                    model.setDateOfBirth(jsonObject1.getString("dateOfBirth"));
                    model.setYearOfBirth(jsonObject1.getString("yearOfBirth"));
                    model.setAncestry(jsonObject1.getString("ancestry"));
                    model.setEyeColour(jsonObject1.getString("eyeColour"));
                    model.setHairColour(jsonObject1.getString("hairColour"));
                    model.setPatronus(jsonObject1.getString("patronus"));
                    model.setHogwartsStudent(jsonObject1.getString("hogwartsStudent"));
                    model.setHogwartsStaff(jsonObject1.getString("hogwartsStaff"));
                    model.setActor(jsonObject1.getString("actor"));
                    model.setAlive(jsonObject1.getString("alive"));
                    model.setImg(jsonObject1.getString("image"));

                    JSONObject want = jsonObject1.getJSONObject("wand");
                    model.setWood(want.getString("wood"));
                    model.setCore(want.getString("core"));
                    model.setLength(want.getString("length"));

                    mExampleList.add(model);
                }



            } catch (JSONException e) {
                e.printStackTrace();
            }

            PutDataIntoRecyclerView(mExampleList);

        }
    }

    private void PutDataIntoRecyclerView(List<ExampleItem> mExampleItem){
        setOnClickListener();
        ExampleAdapter adapter = new ExampleAdapter(this, mExampleItem, listener);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = (v, position) -> {
            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            intent.putExtra("Example Item", mExampleList.get(position));
            startActivity(intent);
        };
    }
}