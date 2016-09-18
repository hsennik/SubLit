package com.example.easysub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenavo on 2016-09-17.
 */
public class MyPostingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypostings);

        Button btn_mysublet = (Button) findViewById(R.id.mysublet_button);
        btn_mysublet.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(MyPostingsActivity.this, PostingActivity.class));}
        });
    }
}
