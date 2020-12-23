package com.example.sachin.dharm_fab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        Button newitem=(Button)findViewById(R.id.addnewitem);
        Button enquiry=(Button)findViewById(R.id.report);

        enquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Getting value form Email's EditText and fill into EmailHolder string variable.

            Intent i=new Intent(getApplicationContext(),EnquiryListActivity.class);
            startActivity(i);


            }
        });


        newitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Getting value form Email's EditText and fill into EmailHolder string variable.



                    Intent i = new Intent(getApplicationContext(), UploadItem.class);
                    startActivity(i);



            }
        });

    }
}
