package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button create = findViewById(R.id.newAccountButton);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You clicked Create an account",Toast.LENGTH_LONG).show();
            }
        });

        TextView forget = findViewById(R.id.forget);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You clicked Forget Password",Toast.LENGTH_LONG).show();
            }
        });

        final EditText username = findViewById(R.id.username_edit);
        final EditText password = findViewById(R.id.password_edit);

        RelativeLayout signin = findViewById(R.id.signinButton);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(username.getText().toString())) {

                    if (!TextUtils.isEmpty(password.getText().toString())) {

                        Toast.makeText(MainActivity.this,"Account is created",Toast.LENGTH_LONG).show();

                    }
                }
                if (TextUtils.isEmpty(username.getText().toString())) {
                    Toast.makeText(MainActivity.this,"Username can't left empty",Toast.LENGTH_LONG).show();
                }

                if (TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(MainActivity.this,"Password can't left empty",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}