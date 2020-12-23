package com.example.sachin.dharm_fab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    EditText username, password;

    // Creating string to hold values.
    String EmailHolder, PasswordHolder;

    // Creating buttons.
    Button Login;

    TextView btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.editText_email);
        password = (EditText) findViewById(R.id.editText_password);
        Login=(Button)findViewById(R.id.button_login);
                // Getting value form Email's EditText and fill into EmailHolder string variable.


        // Getting value form Password's EditText and fill into PasswordHolder string variable.
        PasswordHolder = password.getText().toString().trim();

        // Adding click listener to login button.
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Getting value form Email's EditText and fill into EmailHolder string variable.
                EmailHolder = username.getText().toString().trim();

                if (EmailHolder.equals("8521")) {

                    Intent i = new Intent(getApplicationContext(), AdminPanel.class);
                    startActivity(i);
                }


            }
        });
    }
}
