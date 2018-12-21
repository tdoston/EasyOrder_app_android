package com.example.dostontoshbekov.easyorder_app.bar_frag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.dostontoshbekov.easyorder_app.R;

public class activity_bottom_navigation extends AppCompatActivity {

  private TextView mTextMessage;

  private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
          = new BottomNavigationView.OnNavigationItemSelectedListener() {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
      switch (item.getItemId()) {
        case R.id.fragment_favorite:
          mTextMessage.setText("fragment_favorite");
          return true;
        case R.id.fragment_menu:
          mTextMessage.setText("fragment_menu");
          return true;
        case R.id.fragment_cart:
          mTextMessage.setText("fragment_cart");
          return true;
       case R.id.fragment_user:
          mTextMessage.setText("fragment_user");
          return true;
      }
      return false;
    }
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_navigation);

    mTextMessage = (TextView) findViewById(R.id.message);
    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
  }

}
