package com.example.easysub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = "MyAppTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_login, btn_signup;

        btn_login = (Button) findViewById(R.id.login_button);
        btn_signup = (Button) findViewById(R.id.signup_button);

        btn_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "btn clicked");
//                startActivity(new Intent(MainActivity.this, HomeActivity.class));
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignInActivity.class));
            }
        });
    }
}
