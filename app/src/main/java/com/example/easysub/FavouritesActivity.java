package com.example.easysub;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


/**
 * Created by Lenavo on 2016-09-17.
 */

public class FavouritesActivity extends Activity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] sublets = new String[] { "Address","Address","Address","Address","Address"};
        Boolean [] favSublets = new Boolean[]{true,false,false,true,false,};  //HARD CODED FAVOURITES, CHANGE TO MODIFY BASED ON USER INPUT IN SEARCH TAB


        int arrSize = 0;
        for (int i = 0; i < 5; i++){
            //Determine size of array to convert into a list
            if (favSublets[i]){
                arrSize++;
            }
        }
        //Create array of size "arrSize"
        String[] favSubletsName = new String[arrSize];
        for (int i = 0; i < 5; i++){
            if (favSublets[i]){
                //Add addresses marked as favourite, due to corresponding boolean array to fav Sublets array
                favSubletsName[i]=sublets[i];
            }
        }
        arrSize = 0; //set count back to 0 to be valid for re-use

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, favSubletsName);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

}