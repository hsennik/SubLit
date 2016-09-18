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
            Global.decidingvar=1;
            CheckBox furnished = (CheckBox)findViewById(R.id.checkBox);
            if(furnished.isChecked()) {
                Global.decidingvar=1;
            }else{
            Global.decidingvar=6;}
            CheckBox utilities = (CheckBox)findViewById(R.id.checkBox2);
            if (utilities.isChecked()){
                Global.decidingvar=2;
            }else{
                Global.decidingvar=6;
            }
            CheckBox parking = (CheckBox)findViewById(R.id.checkBox3);
            if (parking.isChecked()){
                Global.decidingvar=3;
            }else{
                Global.decidingvar=6;
            }
            CheckBox laundry = (CheckBox)findViewById(R.id.checkBox4);
            if (laundry.isChecked()){
                Global.decidingvar=4;
            }else {
                Global.decidingvar = 6;
            }
            RadioButton uw = (RadioButton)findViewById(R.id.radioButton2);
            if (uw.isChecked()) {
                Global.decidingvar=2;
            }else{
                Global.decidingvar=6;
            }
            RadioButton uptown = (RadioButton)findViewById(R.id.radioButton3);
            if(uptown.isChecked()) {
                Global.decidingvar = 5;
            }else{
                Global.decidingvar=6;
            }
            RadioButton wlu = (RadioButton)findViewById(R.id.radioButton);
            if (wlu.isChecked()){
                Global.decidingvar=4;
            }else{
                Global.decidingvar=6;
            }
            startActivity(new Intent(SearchActivity.this, MapsActivity.class));
            }
        });

    }
}

