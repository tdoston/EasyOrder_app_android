package com.example.dostontoshbekov.easyorder_app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dostontoshbekov.easyorder_app.R;
import com.example.dostontoshbekov.easyorder_app.bar_frag.accountFrag;
import com.example.dostontoshbekov.easyorder_app.bar_frag.cartFrag;
import com.example.dostontoshbekov.easyorder_app.bar_frag.favoriteFrag;
import com.example.dostontoshbekov.easyorder_app.bar_frag.menuFrag;

public class activity_bottom_navigation extends AppCompatActivity {

  private TextView mTextMessage;

  private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
          = new BottomNavigationView.OnNavigationItemSelectedListener() {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//      Toast.makeText(activity_bottom_navigation.this, "Pressed", Toast.LENGTH_SHORT).show();
      switch (item.getItemId()) {
        case R.id.navigation_favorite:
          mTextMessage.setText(R.string.title_favorite);

          getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new favoriteFrag()).commit();
          return true;
        case R.id.navigation_menu:
          getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new menuFrag()).commit();
          mTextMessage.setText(R.string.title_menu);
          return true;
        case R.id.navigation_cart:
          mTextMessage.setText(R.string.title_cart);
          getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new cartFrag()).commit();
          return true;
        case R.id.navigation_account:
          mTextMessage.setText(R.string.title_account);
          getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new accountFrag()).commit();
          return true;
      }
      return false;
    }
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_navigation);

    mTextMessage = findViewById(R.id.message);
    BottomNavigationView navigation = findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
  }

}
