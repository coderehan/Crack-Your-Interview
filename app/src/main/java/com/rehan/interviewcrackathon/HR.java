package com.rehan.interviewcrackathon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HR extends AppCompatActivity {
    ActionBar actionBar;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10, cardView11, cardView12, cardView13, cardView14, cardView15, cardView16, cardView17, cardView18, cardView19, cardView20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_r);

        actionBar=getSupportActionBar();
        actionBar.setTitle("HR Questions");

        cardView1=findViewById(R.id.cardView1);
        cardView2=findViewById(R.id.cardView2);
        cardView3=findViewById(R.id.cardView3);
        cardView4=findViewById(R.id.cardView4);
        cardView5=findViewById(R.id.cardView5);
        cardView6=findViewById(R.id.cardView6);
        cardView7=findViewById(R.id.cardView7);
        cardView8=findViewById(R.id.cardView8);
        cardView9=findViewById(R.id.cardView9);
        cardView10=findViewById(R.id.cardView10);
        cardView11=findViewById(R.id.cardView11);
        cardView12=findViewById(R.id.cardView12);
        cardView13=findViewById(R.id.cardView13);
        cardView14=findViewById(R.id.cardView14);
        cardView15=findViewById(R.id.cardView15);
        cardView16=findViewById(R.id.cardView16);
        cardView17=findViewById(R.id.cardView17);
        cardView18=findViewById(R.id.cardView18);
        cardView19=findViewById(R.id.cardView19);
        cardView20=findViewById(R.id.cardView20);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(HR.this, HR1.class);
                startActivity(intent1);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(HR.this, HR2.class);
                startActivity(intent2);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(HR.this, HR3.class);
                startActivity(intent3);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(HR.this, HR4.class);
                startActivity(intent4);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(HR.this, HR5.class);
                startActivity(intent5);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(HR.this, HR6.class);
                startActivity(intent6);
            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(HR.this, HR7.class);
                startActivity(intent7);
            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(HR.this, HR8.class);
                startActivity(intent8);
            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(HR.this, HR9.class);
                startActivity(intent9);
            }
        });

        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(HR.this, HR10.class);
                startActivity(intent10);
            }
        });

        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11=new Intent(HR.this, HR11.class);
                startActivity(intent11);
            }
        });

        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12=new Intent(HR.this, HR12.class);
                startActivity(intent12);
            }
        });

        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(HR.this, HR13.class);
                startActivity(intent13);
            }
        });

        cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14=new Intent(HR.this, HR14.class);
                startActivity(intent14);
            }
        });

        cardView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15=new Intent(HR.this, HR15.class);
                startActivity(intent15);
            }
        });

        cardView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16=new Intent(HR.this, HR16.class);
                startActivity(intent16);
            }
        });

        cardView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17=new Intent(HR.this, HR17.class);
                startActivity(intent17);
            }
        });

        cardView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18=new Intent(HR.this, HR18.class);
                startActivity(intent18);
            }
        });

        cardView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent19=new Intent(HR.this, HR19.class);
                startActivity(intent19);
            }
        });

        cardView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent20=new Intent(HR.this, HR20.class);
                startActivity(intent20);
            }
        });

    }

}
