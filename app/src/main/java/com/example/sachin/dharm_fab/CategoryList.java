package com.example.sachin.dharm_fab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CategoryList  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.categorylist);


        Button fancylace =(Button)findViewById(R.id.fancylace);
        Button jaquardlace =(Button)findViewById(R.id.jaquardlace);
        Button designerlace =(Button)findViewById(R.id.designerlace);
        Button embosed=(Button)findViewById(R.id.embosed);
        Button bubble =(Button)findViewById(R.id.bubble);
        Button doublecloth =(Button)findViewById(R.id.doublecloth);
        Button fancylehenga =(Button)findViewById(R.id.fancylehenga);
        Button designerlehenga =(Button)findViewById(R.id.designerlehenga);
        Button fancyblouse =(Button)findViewById(R.id.fancyblouse);
        Button jaquardblouse=(Button)findViewById(R.id.jaquardblouse);
        Button designerblouse =(Button)findViewById(R.id.designerblouse);
        Button choli =(Button)findViewById(R.id.choli);
        Button fancydupatta =(Button)findViewById(R.id.fancydupatta);
        Button banarasidupatta =(Button)findViewById(R.id.banarasidupatta);
        Button designerdupatta =(Button)findViewById(R.id.designerdupatta);
        Button taffeta =(Button)findViewById(R.id.taffeta);
        Button digitalprint =(Button)findViewById(R.id.digitalprint);
        Button ikkat =(Button)findViewById(R.id.ikkat);
        Button brocade =(Button)findViewById(R.id.brocade);
        Button brocadeallover =(Button)findViewById(R.id.brocadeallover);
        Button brocadegarment =(Button)findViewById(R.id.brocadegarment);
        Button chinafancy =(Button)findViewById(R.id.chinafancy);
        Button sherwani =(Button)findViewById(R.id.sherwani);

        Button kachhi =(Button)findViewById(R.id.kachhi);
        Button gamthi =(Button)findViewById(R.id.gamthi);


        fancylace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "FANCY LACE FABRICS");
                startActivity(i);


            }
        });

        jaquardlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "JAQUARD LACE FABRICS");
                startActivity(i);


            }
        });

        designerlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "DESIGNER LACE FABRICS");
                startActivity(i);


            }
        });

        embosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "EMBOSED FABRICS");
                startActivity(i);


            }
        });


        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "BUBBLE FABRICS");
                startActivity(i);


            }
        });
        jaquardlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "JAQUARD LACE FABRICS");
                startActivity(i);


            }
        });
        doublecloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "DOUBLE CLOTH FABRICS");
                startActivity(i);


            }
        });
        fancylehenga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "FANCY LEHENGA FABRICS");
                startActivity(i);


            }
        });

        designerlehenga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "DESIGNERS LEHENGA FABRICS");
                startActivity(i);


            }
        });

        fancyblouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "FANCY BLOUSE FABRICS");
                startActivity(i);


            }
        });
        jaquardblouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "JAQUARD BLOUSE FABRICS");
                startActivity(i);


            }
        });

        designerblouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "DESIGNERS BLOUSE FABRICS");
                startActivity(i);

            }
        });


        choli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "CHOLI FABRICS");
                startActivity(i);


            }
        });

        fancydupatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "FANCY DUPATTA");
                startActivity(i);


            }
        });

        banarasidupatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "BANARASI DUPATTA");
                startActivity(i);


            }
        });

        designerdupatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "DESIGNERS DUPTTA");
                startActivity(i);

            }
        });


        taffeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "TAFFETA JAQUARD FABRICS");
                startActivity(i);
            }
        });


        digitalprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "DIGITAL PRINT JAQUARD FABRICS");
                startActivity(i);
            }
        });


        ikkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "IKKAT FABRICS");
                startActivity(i);


            }
        });

        brocade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "BROCADE FABRICS");
                startActivity(i);
            }
        });

        brocadeallover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "BROCADE ALL OVER FABRICS");
                startActivity(i);


            }
        });


        brocadegarment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "BROCADE GARMENT FABRICS");
                startActivity(i);


            }
        });

        chinafancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "CHINA FANCY JAQUARD FABRICS");
                startActivity(i);


            }
        });

        sherwani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "SHERWANI FABRICS");
                startActivity(i);


            }
        });

        kachhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "KACHHI WORK FABRICS");
                startActivity(i);


            }
        });


        gamthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(getApplicationContext(),SingleCategory.class);
                i.putExtra("send", "GAMTHI FABRICS");
                startActivity(i);


            }
        });




    }
}