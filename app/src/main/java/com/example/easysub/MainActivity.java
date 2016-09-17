package com.example.easysub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_login = (Button)findViewById(R.id.login_button);
        Button btn_signup = (Button)findViewById(R.id.signup_button);

        btn_login.setOnClickListener(this);
        btn_signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getID()){
            case R.id.login_button:
                startActivity(new Intent(MainActivity.this, LogInActivity.class));
                break;
            case R.id.signup_button:
                startActivity(new Intent(MainActivity.this, SignInActivity.class));
                break;
        }
    }
}
