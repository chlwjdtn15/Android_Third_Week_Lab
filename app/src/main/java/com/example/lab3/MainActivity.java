package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.number.NumberRangeFormatter;
import android.media.Rating;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView recyclerView = findViewById(R.id.recycle);


        List<Dishes> dishes = getData();
        My_adaptor adaptor = new My_adaptor(dishes);



        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        recyclerView.setAdapter(adaptor);





    }


    public List<Dishes> getData() {



        List<Dishes> dishes = new ArrayList<>();
        RatingBar ratingBar = findViewById(R.id.ratingBar);


        Dishes d1 = new Dishes("Chicken", R.mipmap.chicken);
        dishes.add(d1);

        Dishes d2 = new Dishes("Fish", R.mipmap.fish);
        dishes.add(d2);


        Dishes d3 = new Dishes("Kimchi Soup", R.mipmap.kimch_soup);
        dishes.add(d3);

        Dishes d4 = new Dishes("Kimch Pancake", R.mipmap.kimchi_pancake);
        dishes.add(d4);

        Dishes d5 = new Dishes("Korean BBQ", R.mipmap.korean_bbq);
        dishes.add(d5);

        Dishes d6 = new Dishes("Miso Soup", R.mipmap.miso_soup);
        dishes.add(d6);

        Dishes d7 = new Dishes("Pizza", R.mipmap.pizza);
        dishes.add(d7);

        Dishes d8 = new Dishes("Stake", R.mipmap.stake);
        dishes.add(d8);





        return dishes;

    }
}