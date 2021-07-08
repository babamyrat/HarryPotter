package com.example.harrypotter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.MyViewHolder> {

    private final Context mContext;
    private final List<ExampleItem> mExampleItem;
    private final RecyclerViewClickListener listener;

    public ExampleAdapter(Context mContext, List<ExampleItem> mExampleItem, RecyclerViewClickListener listener) {
        this.mContext = mContext;
        this.mExampleItem = mExampleItem;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        v = inflater.inflate(R.layout.list_item, parent, false);

        return  new MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull  ExampleAdapter.MyViewHolder holder, int position) {


        holder.name.setText(mExampleItem.get(position).getName());
        holder.species.setText(mExampleItem.get(position).getSpecies());

        // using Glide
        Glide.with(mContext)
                .load(mExampleItem.get(position).getImg())
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return mExampleItem.size();

    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView name;
        TextView species;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_txt);
            species = itemView.findViewById(R.id.id_txt);
            img = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(itemView, getAdapterPosition());

        }
    }
}