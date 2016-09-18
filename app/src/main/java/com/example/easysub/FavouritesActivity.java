package com.example.easysub;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class FavouritesActivity extends Activity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        Button btn_ezra = (Button) findViewById(R.id.ezra_button);
        btn_ezra.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(FavouritesActivity.this, PostingActivity.class));}
            });
        }

    }
