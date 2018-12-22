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

public class ordered_food_list_Adapter extends RecyclerView.Adapter<ordered_food_list_Adapter.ViewHolder> {

    private ArrayList<ordered_food_list> ordered_foods_ ;

    private ItemClicked activity;
    private CartClicked cartClickedActivity;

    public interface ItemClicked{
        void onItemclicked(int index);
    }
    public interface CartClicked{
        void onCartClicked(int index);
    }



    public ordered_food_list_Adapter(CartClicked cartClickedActivity, ItemClicked clicked, ArrayList<ordered_food_list> listo ) {
        ordered_foods_ = listo;
        activity = clicked;
        this.cartClickedActivity = cartClickedActivity;
    }




    @NonNull
    @Override
    public ordered_food_list_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_orders, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ordered_food_list_Adapter.ViewHolder viewHolder, int i) {
        viewHolder.setData(ordered_foods_.get(i));
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

        private TextView food_name;
        private TextView category;
        private TextView price;
        private TextView quantity;
        private ImageButton btn_remove_to_cart_listen;
        private ImageButton btn_remove_quantity_o;
        private ImageButton btn_add_quantity_o;



        ViewHolder(@NonNull final View itemViewo) {
            super(itemViewo);

            food_name = itemViewo.findViewById(R.id.tv_foodName_o);
            category = itemViewo.findViewById(R.id.tv_category_o);
            price = itemViewo.findViewById(R.id.tv__price_o);
            quantity = itemViewo.findViewById(R.id.tv_quantitiy_to);
            btn_remove_to_cart_listen = itemViewo.findViewById(R.id.remove_from_cart_o);
            btn_add_quantity_o = itemViewo.findViewById(R.id.btn_add_quantity_o);
            btn_remove_quantity_o = itemViewo.findViewById(R.id.btn_remove_quantity_o);

            itemViewo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemclicked(getAdapterPosition()/*favorite_foods_.indexOf((favorite_food_list) v.getTag())*/); //getAdapterPosition()
                }
            });

            btn_remove_to_cart_listen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    cartClickedActivity.onCartClicked(getAdapterPosition());
                }
            });

        }

        void setData(ordered_food_list food) {
            food_name.setText(food.getFood_name());
            category.setText(food.getCategory());
            price.setText(String.valueOf(food.getPrice()));
            quantity.setText(String.valueOf(food.getQuantity()));
        }
    }


    @Override
    public int getItemCount() {
        return ordered_foods_.size();
//        return favorite_foods_.size();
    }
}
