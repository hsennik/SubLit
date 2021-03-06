package com.example.easysub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //DECLARING  BUTTONS
        Button btn_search = (Button)findViewById(R.id.search_button);
        Button btn_favourites = (Button)findViewById(R.id.favourites_button);
        Button btn_mypostings = (Button)findViewById(R.id.mypostings_button);
        Button btn_settings = (Button)findViewById(R.id.settings_button);

        //CLICK LISTENER FOR ALL BUTTONS
        btn_search.setOnClickListener(this);
        btn_favourites.setOnClickListener(this);
        btn_mypostings.setOnClickListener(this);
        btn_settings.setOnClickListener(this);
    }

    @Override
    //DETERMINE WHICH BUTTON WAS CLICKED AND ROUTE TO THE ACCORDING ACTIVITY PAGE
    public void onClick(View v){
        switch(v.getId()){
            case R.id.search_button:
                startActivity(new Intent(HomeActivity.this, SearchActivity.class));
                break;
            case R.id.favourites_button:
                startActivity(new Intent(HomeActivity.this, FavouritesActivity.class));
                break;
            case R.id.mypostings_button:
                startActivity(new Intent(HomeActivity.this, MyPostingsActivity.class));
                break;
            case R.id.settings_button:
                startActivity(new Intent(HomeActivity.this, SettingsActivity.class));
                break;
        }
    }
}