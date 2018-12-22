package com.example.dostontoshbekov.easyorder_app.favorite_recycler;

        import android.widget.ImageView;

        import com.example.dostontoshbekov.easyorder_app.R;

public class ordered_food_list {
    private String food_name;
    private String category;
    private double price;
    private int quantity;

    public ordered_food_list(String food_name, String category, double price, int quantity) {
        this.food_name = food_name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}