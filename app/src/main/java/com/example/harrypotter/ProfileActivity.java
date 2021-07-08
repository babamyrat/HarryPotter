package com.example.harrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;



public class ProfileActivity extends AppCompatActivity {
    TextView txtName, txtSpecies, txtGender, txtHouse, txtDateOfBirth, txtYearOfBirth, txtAncestry;
    TextView txtEyeColour, txtHairColour, txtWood, txtCore, txtLength, txtPatronus, txtHogwartsStudent;
    TextView txtHogwartsStaff, txtActor, txtAlive;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Intent intent = getIntent();
        ExampleItem exampleItem = intent.getParcelableExtra("Example Item");

        String name  = exampleItem.getName();
        String species  = exampleItem.getSpecies();
        String gender  = exampleItem.getGender();
        String house  = exampleItem.getHouse();
        String dateOfBirth  = exampleItem.getDateOfBirth();
        String yearOfBirth  = exampleItem.getYearOfBirth();
        String ancestry  = exampleItem.getAncestry();
        String eyeColour  = exampleItem.getEyeColour();
        String hairColour  = exampleItem.getHairColour();
        String wood  = exampleItem.getWood();
        String core  = exampleItem.getCore();
        String length  = exampleItem.getLength();
        String patronus  = exampleItem.getPatronus();
        String hogwartsStudent  = exampleItem.getHogwartsStudent();
        String hogwartsStaff  = exampleItem.getHogwartsStaff();
        String actor = exampleItem.getActor();
        String alive  = exampleItem.getAlive();







        txtName = findViewById(R.id.txtName);
        txtName.setText(name);

        txtSpecies = findViewById(R.id.txtSpecies);
        txtSpecies.setText(species);

        txtGender = findViewById(R.id.txtGender);
        txtGender.setText(gender);

        txtHouse = findViewById(R.id.txtHouse);
        txtHouse.setText(house);

        txtDateOfBirth = findViewById(R.id.txtDateOfBirth);
        txtDateOfBirth.setText(dateOfBirth);

        txtYearOfBirth = findViewById(R.id.txtYearOfBirth);
        txtYearOfBirth.setText(yearOfBirth);

        txtAncestry = findViewById(R.id.txtAncestry);
        txtAncestry.setText(ancestry);

        txtEyeColour = findViewById(R.id.txtEyeColour);
        txtEyeColour.setText(eyeColour);

        txtHairColour = findViewById(R.id.txtHairColour);
        txtHairColour.setText(hairColour);

        txtWood = findViewById(R.id.txtWood);
        txtWood.setText(wood);

        txtCore = findViewById(R.id.txtCore);
        txtCore.setText(core);

        txtLength = findViewById(R.id.txtLength);
        txtLength.setText(length);

        txtPatronus = findViewById(R.id.txtPatronus);
        txtPatronus.setText(patronus);

        txtHogwartsStudent = findViewById(R.id.txtHogwartsStudent);
        txtHogwartsStudent.setText(hogwartsStudent);

        txtHogwartsStaff = findViewById(R.id.txtHogwartsStaff);
        txtHogwartsStaff.setText(hogwartsStaff);

        txtActor = findViewById(R.id.txtActor);
        txtActor.setText(actor);

        txtAlive = findViewById(R.id.txtAlive);
        txtAlive.setText(alive);


        image = findViewById(R.id.imageHarry);

        // using Glide
        try {
            Glide.with(this)
                    .load(exampleItem.getImg())
                    .into(image);
        } catch (Exception ignore) {

        }


    }
}