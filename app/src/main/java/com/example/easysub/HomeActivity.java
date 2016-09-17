package com.example.easysub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenavo on 2016-09-17.
 */
public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button btn_search;

        btn_search = (Button)findViewById(R.id.search_button);
        btn_search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, SearchActivity.class));
            }
        });

    }
}
