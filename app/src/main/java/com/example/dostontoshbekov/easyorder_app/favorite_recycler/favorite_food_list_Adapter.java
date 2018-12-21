package com.example.dostontoshbekov.easyorder_app.favorite_recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.dostontoshbekov.easyorder_app.R;

import java.util.ArrayList;

public class favorite_food_list_Adapter extends RecyclerView.Adapter<favorite_food_list_Adapter.ViewHolder> {

    private ArrayList<favorite_food_list> favorite_foods_ ;

    private ItemClicked activity;
    private CartClicked cartClickedActivity;

    public interface ItemClicked{
        void onItemclicked(int index);
    }
    public interface CartClicked{
        void onCartClicked(int index);
    }



    public favorite_food_list_Adapter(CartClicked cartClickedActivity, ItemClicked clicked, ArrayList<favorite_food_list> list ) {
        favorite_foods_ = list;
        activity = clicked;
        this.cartClickedActivity = cartClickedActivity;
    }




    @NonNull
    @Override
    public favorite_food_list_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_favorites, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull favorite_food_list_Adapter.ViewHolder viewHolder, int i) {
            viewHolder.setData(favorite_foods_.get(i));
//
//            if(favorite_foods_.get(i).getPreference().equals("bus"))
//            {
//                viewHolder.iv_pref.setImageResource(R.drawable.bus);
//            }
//            else
//            {
//                viewHolder.iv_pref.setImageResource(R.drawable.plane);
//            }
    }


    class ViewHolder extends RecyclerView.ViewHolder
    {
        private  TextView food_name;
        private  TextView food_Description;
        private  TextView category;
        private  TextView price;
        private RatingBar rating;
        private ImageView food_image;

        private ImageButton btn_add_to_cart_listen;


        ViewHolder(@NonNull final View itemView) {
            super(itemView);

            food_name = itemView.findViewById(R.id.tv_foodName);

           // food_Description = itemView.findViewById(R.id.tv_foodDescription);
            category = itemView.findViewById(R.id.tv_category);
            price = itemView.findViewById(R.id.tv__price);
            rating = itemView.findViewById(R.id.ratingBar);
            food_image = itemView.findViewById(R.id.iv_food);
            btn_add_to_cart_listen = itemView.findViewById(R.id.add_to_cart);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemclicked(getAdapterPosition()/*favorite_foods_.indexOf((favorite_food_list) v.getTag())*/); //getAdapterPosition()
                }
            });

            btn_add_to_cart_listen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    cartClickedActivity.onCartClicked(getAdapterPosition());
                }
            });

        }

        void setData(favorite_food_list food) {
            food_name.setText(food.getFood_name());
           // food_Description.setText(food.getFood_Description());
            category.setText(food.getCategory());
            price.setText(String.valueOf(food.getPrice()));
            food_image.setImageResource(food.getFood_image());
            rating.setRating(food.getRating());
        }
    }


    @Override
    public int getItemCount() {
        return favorite_foods_.size();
//        return favorite_foods_.size();
    }
}
