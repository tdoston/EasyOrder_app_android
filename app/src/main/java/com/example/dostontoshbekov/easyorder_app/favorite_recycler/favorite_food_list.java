package com.example.dostontoshbekov.easyorder_app.favorite_recycler;

import android.widget.ImageView;

import com.example.dostontoshbekov.easyorder_app.R;

public class favorite_food_list
{
    private  String food_name;
    private  String food_Description;
    private  String category;
    private  double price;
    private  float rating;
    private int food_image;

    public favorite_food_list(String food_name, String food_Description, String category, float price, float rating, int food_image) {
        this.food_name = food_name;
        this.food_Description = food_Description;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.food_image = food_image;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_Description() {
        return food_Description;
    }

    public void setFood_Description(String food_Description) {
        this.food_Description = food_Description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getFood_image() {
        return food_image;
    }

    public void setFood_image(int food_image) {
        this.food_image = food_image;
    }
}
