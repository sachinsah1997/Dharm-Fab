package com.example.sachin.dharm_fab;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RelativeLayout app_layer = (RelativeLayout) findViewById (R.id.product);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Home.this,CategoryList.class);
                startActivity(i);

                }
        });

        RelativeLayout enquiry = (RelativeLayout) findViewById (R.id.enquirydt);
        enquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Home.this,Enquiry.class);
                startActivity(i);

            }
        });

        RelativeLayout contact = (RelativeLayout) findViewById (R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Home.this,ContactUs.class);
                startActivity(i);

            }
        });


        RelativeLayout details = (RelativeLayout) findViewById (R.id.company_detail);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Home.this,CompanyDetail.class);
                startActivity(i);

            }
        });




    }

}
