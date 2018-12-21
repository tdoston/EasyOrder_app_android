package com.example.dostontoshbekov.easyorder_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_1 = (Button) findViewById(R.id.btn_tab);
        btn_2 = (Button) findViewById(R.id.btn_nav);
        btn_3 = (Button) findViewById(R.id.btn_bottom_navigation);




        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_bottom_navigation.class);
                startActivity(intent);
            }
        });

    }
}
