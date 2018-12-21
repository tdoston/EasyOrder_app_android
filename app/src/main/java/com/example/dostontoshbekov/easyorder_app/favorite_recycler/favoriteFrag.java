package com.example.dostontoshbekov.easyorder_app.favorite_recycler;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.example.dostontoshbekov.easyorder_app.R;

import java.util.ArrayList;



public class favoriteFrag extends Fragment implements favorite_food_list_Adapter.ItemClicked {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<favorite_food_list> favorite_foods_m;
    Button btn_activity;
    View my_dialog_view;
    Button btn_detail;
    private Context context;

    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    public favoriteFrag() {
        // Required empty public constructor
    }


    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        final ImageView temp_img = new ImageView(context);
        View rootView = inflater.inflate(R.layout.fragment_favorite, container, false);


//        ImageView temp_img= rootView.findViewById(R.id.iv_food);

        my_dialog_view = inflater.inflate(R.layout.dialog_details, container, false);
        btn_activity = rootView.findViewById(R.id.btn_activity);
        btn_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favorite_foods_m.add(new favorite_food_list("Food name", "Food description", "Category", 0.00f, 5, R.drawable.plane));
                myAdapter.notifyDataSetChanged();
            }
        });




        // Inflate the layout for this fragment
        recyclerView = (RecyclerView) rootView.findViewById(R.id.list12);
        recyclerView.setHasFixedSize(true);

        // 2. set layoutManger
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));



        favorite_foods_m = new ArrayList<>();
        favorite_foods_m.add(new favorite_food_list(
                "Food name",
                "Food description",
                "Category",
                0.00f,
                5,
                R.raw.food_1));
        favorite_foods_m.add(new favorite_food_list
                (
                "Plov",
                "Pilaf or pilau is a dish, originating from the Indian subcontinent, in which rice is cooked in a seasoned broth. In some cases, the rice may attain its brown or golden color by first being sauteed lightly in oil before the addition of broth. ",
                "Category",
                0.00f,
                5,
                        R.raw.food_2
                ));

        favorite_foods_m.add(new favorite_food_list
                (
                "Plov",
                "Pilaf or pilau is a dish, originating from the Indian subcontinent, in which rice is cooked in a seasoned broth. In some cases, the rice may attain its brown or golden color by first being sauteed lightly in oil before the addition of broth. ",
                "Category",
                0.00f,
                5,
                        R.raw.food_3
                ));

       /* favorite_foods_m.add(new favorite_food_list
                (
                "Plov",
                "Pilaf or pilau is a dish, originating from the Indian subcontinent, in which rice is cooked in a seasoned broth. In some cases, the rice may attain its brown or golden color by first being sauteed lightly in oil before the addition of broth. ",
                "Category",
                0.00,
                5,
                        temp_img
                ));        favorite_foods_m.add(new favorite_food_list
                (
                "Plov",
                "Pilaf or pilau is a dish, originating from the Indian subcontinent, in which rice is cooked in a seasoned broth. In some cases, the rice may attain its brown or golden color by first being sauteed lightly in oil before the addition of broth. ",
                "Category",
                0.00,
                5,
                        temp_img
                ));        favorite_foods_m.add(new favorite_food_list
                (
                "Plov",
                "Pilaf or pilau is a dish, originating from the Indian subcontinent, in which rice is cooked in a seasoned broth. In some cases, the rice may attain its brown or golden color by first being sauteed lightly in oil before the addition of broth. ",
                "Category",
                0.00,
                5,
                        temp_img
                ));
*/

        myAdapter = new favorite_food_list_Adapter(this, favorite_foods_m);
        recyclerView.setAdapter(myAdapter);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onItemclicked(int index) {
        String sindex = String.valueOf(index);

//        Toast.makeText(context, sindex, Toast.LENGTH_SHORT).show();

        final AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(favorite_foods_m.get(index).getFood_name());
        if (my_dialog_view == null) {
            my_dialog_view = LayoutInflater.from(context).inflate(R.layout.dialog_details, null, false);
        }
        alertDialog.setView(my_dialog_view);
        // start      NumberPicker
        NumberPicker numberPicker = my_dialog_view.findViewById(R.id.numberPicker);
        if (numberPicker != null) {
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(20);
            numberPicker.setWrapSelectorWheel(true);
            numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
                @Override
                public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                    String text = "Changed from " + oldVal + " to " + newVal;
                    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
                }
            });
        }
        //  end      NumberPicker

        btn_detail = my_dialog_view.findViewById(R.id.button);
        btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Rahmat!", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                if (my_dialog_view != null) {
                    my_dialog_view = null;
                }
            }
        });
        alertDialog.setMessage("Alert message to be shown");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();

    }
}


