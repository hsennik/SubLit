package com.example.easysub;

import android.widget.ArrayAdapter;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


/**
 * Created by Lenavo on 2016-09-17.
 */

public class FavouritesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        //An array of favourite sublets (strings)
        String [] favSubletName = {"University of Waterloo","203 Lester Street","16 Ezra Avenue","17 Young Street East","111 Keats Place"};
        Boolean [] favSubletBool = {true, false, false, true, true}; //CHANGE TO ACQUIRE DATA INPUT ON SEARCH ACTIVITY

        //CONVERT INTO LIST FORMAT
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.id.favList, favSubletName);
        getListView().setAdapter(adapter);

    }



}

