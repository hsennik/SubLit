package com.example.easysub;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.easysub.MapsFragment;
import com.example.easysub.R;

public class MapsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Pushing MapView Fragment
        Fragment fragment = Fragment.instantiate(this, MapsFragment.class.getName());
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment);
        ft.commit();

        Button btn_details;
        btn_details = (Button) findViewById(R.id.details);
        btn_details.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(MapsActivity.this, PostingActivity.class));
            }
        });
    }
}
