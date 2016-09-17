package com.example.easysub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.util.Map;

/**
 * Created by hsenn on 2016-09-17.
 */
public class SearchActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button btn_search;

        btn_search = (Button)findViewById(R.id.search_button);
        btn_search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(SearchActivity.this, MapsActivity.class));
            }
        });

    }
}
