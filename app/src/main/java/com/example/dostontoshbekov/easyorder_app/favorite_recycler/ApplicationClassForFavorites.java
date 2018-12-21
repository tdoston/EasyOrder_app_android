package com.example.dostontoshbekov.easyorder_app.favorite_recycler;

import android.app.Application;

import com.example.dostontoshbekov.easyorder_app.R;

import java.util.ArrayList;

public class ApplicationClassForFavorites extends Application {

    public static ArrayList<favorite_food_list> people;

    @Override
    public void onCreate() {
        super.onCreate();

//        people = new ArrayList<>();
////
//        people.add(new favorite_food_list
//                (
//                        "Plov",
//                        "Pilaf or pilau is a dish, originating from the Indian subcontinent, in which rice is cooked in a seasoned broth. In some cases, the rice may attain its brown or golden color by first being sauteed lightly in oil before the addition of broth. ",
//                        "Category",
//                        0.00f,
//                        5,
//                        R.raw.food_3
//                ));
//        people.add(new favorite_food_list("Jaloliddin", "Shofiyev", "bus"));
//        people.add(new favorite_food_list("Tohir", "Sodiqov", "plane"));

    }
}
