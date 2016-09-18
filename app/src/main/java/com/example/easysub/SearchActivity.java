package com.example.easysub;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;

import java.util.Map;
import java.util.zip.CheckedInputStream;

/**
 * Created by hsenn on 2016-09-17.
 */
public class SearchActivity extends AppCompatActivity  {

    public static int decidingvar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button btn_search;
        EditText rentPrice;
        EditText numberPeople;
        CheckBox furnished;
        CheckBox utilities;
        CheckBox parking;
        CheckBox laundry;
        RadioButton wlu;
        RadioButton uw;
        RadioButton uptown;

        btn_search = (Button)findViewById(R.id.map_button);
        btn_search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            EditText rentPrice  = (EditText)findViewById(R.id.editText);
            EditText numberPeople = (EditText)findViewById(R.id.editText2);
            decidingvar=1;
            CheckBox furnished = (CheckBox)findViewById(R.id.checkBox);
            if(furnished.isChecked()) {
                decidingvar=1;
            }
            CheckBox utilities = (CheckBox)findViewById(R.id.checkBox2);
            if (utilities.isChecked()){
                decidingvar=2;
            }
            CheckBox parking = (CheckBox)findViewById(R.id.checkBox3);
            if (parking.isChecked()){
                decidingvar=3;
            }
            CheckBox laundry = (CheckBox)findViewById(R.id.checkBox4);
            if (laundry.isChecked()){
                decidingvar=4;
            }
            RadioButton wlu = (RadioButton)findViewById(R.id.radioButton);
            if (wlu.isChecked()){
                decidingvar=4;
            }
            RadioButton uw = (RadioButton)findViewById(R.id.radioButton2);
            if (uw.isChecked()) {
                decidingvar=2;
            }
            RadioButton uptown = (RadioButton)findViewById(R.id.radioButton3);
            if(uptown.isChecked()) {
                decidingvar = 5;
            }
            startActivity(new Intent(SearchActivity.this, MapsActivity.class));
            }
        });

    }
}

