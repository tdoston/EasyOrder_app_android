package com.example.dostontoshbekov.easyorder_app.bar_frag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.dostontoshbekov.easyorder_app.R;

import java.util.ArrayList;

public class menuFrag extends Fragment{



    public menuFrag() {
//         Required empty public constructor
    }
//
//        RecyclerView recyclerView;
//        RecyclerView.Adapter myAdapter;
//        RecyclerView.LayoutManager layoutManager;
//        ArrayList<Food> food_menu_list;
//        Button btn_activity;


        public void onCreate(@Nullable Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

////        setContentView(R.layout.fragment_favorite);




        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_favorite, container, false);


//
//            btn_activity = rootView.findViewById(R.id.btn_activity);
//            btn_activity.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//                    myAdapter.notifyDataSetChanged();
//                }
//            });


//
//            // Inflate the layout for this fragment
//            recyclerView = (RecyclerView) rootView.findViewById(R.id.list12);
//            recyclerView.setHasFixedSize(true);
//
//            // 2. set layoutManger
////        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//            recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));

//        layoutManager = new LinearLayoutManager(this);
//        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
//        recyclerView.setLayoutManager(layoutManager);
//
//
//            food_menu_list = new ArrayList<>();
//
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "bus"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "bus"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            food_menu_list.add(new Food("Doston", "Toshbekov", "plane"));
//            myAdapter = new FoodAdapter(this, food_menu_list);
//            recyclerView.setAdapter(myAdapter);

//            recyclerView.setItemAnimator(new DefaultItemAnimator());
            return rootView;
        }


//        @Override
//        public void onItemclicked(int index) {
//
//
//
//        }
    }


