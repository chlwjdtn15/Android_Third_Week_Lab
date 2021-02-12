package com.example.lab3;

import android.content.Context;
import android.media.Rating;
import android.provider.ContactsContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class My_adaptor extends RecyclerView.Adapter<My_adaptor.ViewHolder> {



    List<Dishes> dishes;


    My_adaptor( List<Dishes> dishes) {

        this.dishes = dishes;

    }

    @NonNull
    @Override
    public My_adaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.recycler_view_lab3, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.image.setImageResource(dishes.get(position).getImage());
        holder.name.setText(dishes.get(position).getName());



    }

    @Override
    public int getItemCount() {
        return dishes.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView image;
        TextView name;
        RatingBar rating;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            image = itemView.findViewById(R.id.dish_image);

            name = itemView.findViewById(R.id.dish_name);

            rating = itemView.findViewById(R.id.ratingBar);



            image.setOnClickListener(this);




        }


        @Override
        public void onClick(View v) {

            String d_Name = name.getText().toString();
            float d_Rate = rating.getRating();
            Toast.makeText(v.getContext(), d_Name + " :" + d_Rate, Toast.LENGTH_SHORT).show();
        }
    }




}
