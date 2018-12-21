package com.example.dostontoshbekov.easyorder_app.menu_recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dostontoshbekov.easyorder_app.R;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private ArrayList<Food> people ;

    private ItemClicked activity;

    public interface ItemClicked{
        void onItemclicked(int index);
    }



    public FoodAdapter (ItemClicked clicked, ArrayList<Food> list ) {
        people = list;
        activity = clicked;
    }




    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_favorites, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(people.get(i));
        viewHolder.tv_name.setText(people.get(i).getName());
        viewHolder.tv_surname.setText(people.get(i).getSurname());

        if(people.get(i).getPreference().equals("bus"))
        {
            viewHolder.iv_pref.setImageResource(R.drawable.bus);
        }
        else
        {
            viewHolder.iv_pref.setImageResource(R.drawable.plane);
        }
    }


    class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView iv_pref;
        TextView tv_name, tv_surname;

        ViewHolder(@NonNull final View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.tv_name);
            tv_surname = itemView.findViewById(R.id.tv_surname);
            iv_pref = itemView.findViewById(R.id.iv_pref);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemclicked(people.indexOf((Food) v.getTag()));
                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return people.size();
//        return people.size();
    }
}