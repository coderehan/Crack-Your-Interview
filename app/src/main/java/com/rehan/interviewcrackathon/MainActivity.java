package com.rehan.interviewcrackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
Toolbar toolbar;
ActionBarDrawerToggle actionBarDrawerToggle;
NavigationView navigationView;
CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10, cardView11, cardView12, cardView13, cardView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this, C.class);
                startActivity(intent1);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this, CPP.class);
                startActivity(intent2);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this, Java.class);
                startActivity(intent3);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this, JS.class);
                startActivity(intent4);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this, Python.class);
                startActivity(intent5);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(MainActivity.this, SQL.class);
                startActivity(intent6);
            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(MainActivity.this, CN.class);
                startActivity(intent7);
            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(MainActivity.this, DBMS.class);
                startActivity(intent8);
            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(MainActivity.this, DS.class);
                startActivity(intent9);
            }
        });

        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(MainActivity.this, OOPS.class);
                startActivity(intent10);
            }
        });

        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11=new Intent(MainActivity.this, OS.class);
                startActivity(intent11);
            }
        });

        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12=new Intent(MainActivity.this, ST.class);
                startActivity(intent12);
            }
        });

        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(MainActivity.this, HR.class);
                startActivity(intent13);
            }
        });

        cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14=new Intent(MainActivity.this, InterviewTips.class);
                startActivity(intent14);
            }
        });

        drawerLayout=findViewById(R.id.drawerLayout);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Crack Your Interview");
        actionBarDrawerToggle=new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView=findViewById(R.id.navigationView);
        navigationView.bringToFront();
        navigationView.setCheckedItem(R.id.nav_home);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_home:
                        Toast.makeText(MainActivity.this, "This is the Home Page of this app.", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_c:
                        Intent intent15=new Intent(MainActivity.this, C.class);
                        startActivity(intent15);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_cpp:
                        Intent intent16=new Intent(MainActivity.this, CPP.class);
                        startActivity(intent16);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_java:
                        Intent intent17=new Intent(MainActivity.this, Java.class);
                        startActivity(intent17);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_js:
                        Intent intent18=new Intent(MainActivity.this, JS.class);
                        startActivity(intent18);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_python:
                        Intent intent19=new Intent(MainActivity.this, Python.class);
                        startActivity(intent19);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_sql:
                        Intent intent20=new Intent(MainActivity.this, SQL.class);
                        startActivity(intent20);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_cn:
                        Intent intent21=new Intent(MainActivity.this, CN.class);
                        startActivity(intent21);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_dbms:
                        Intent intent22=new Intent(MainActivity.this, DBMS.class);
                        startActivity(intent22);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_ds:
                        Intent intent23=new Intent(MainActivity.this, DS.class);
                        startActivity(intent23);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_oops:
                        Intent intent24=new Intent(MainActivity.this, OOPS.class);
                        startActivity(intent24);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_os:
                        Intent intent25=new Intent(MainActivity.this, OS.class);
                        startActivity(intent25);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_st:
                        Intent intent26=new Intent(MainActivity.this, ST.class);
                        startActivity(intent26);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_hr:
                        Intent intent27=new Intent(MainActivity.this, HR.class);
                        startActivity(intent27);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_interview_tips:
                        Intent intent28=new Intent(MainActivity.this, InterviewTips.class);
                        startActivity(intent28);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_about_developer:
                        Intent intent29=new Intent(MainActivity.this, AboutDeveloper.class);
                        startActivity(intent29);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_rate_app:
                        String app_link="https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName();
                        Uri uri= Uri.parse(app_link);
                        Intent rate=new Intent(Intent.ACTION_VIEW, uri);
                        try {
                            startActivity(rate);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "Unable to open", Toast.LENGTH_LONG).show();
                        }
                        break;

                    case R.id.nav_share_app:
                        try {
                            Intent share=new Intent(Intent.ACTION_SEND);
                            share.setType("text/plain");
                            share.putExtra(Intent.EXTRA_SUBJECT, "Interview Crackathon App" + "\n");
                            share.putExtra(Intent.EXTRA_TEXT, "Download this app from Google PlayStore by clicking this below link. Please do share this app info with your friends and tell them to give feedback about this app. Your feedback is mostly appreciated and delighted to hear." + "\n\n" + "https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName() + "\n\n" + "Best of Luck for your Interview!!!");
                            startActivity(Intent.createChooser(share, "Share App Info With :"));
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "Unable to share", Toast.LENGTH_LONG).show();
                        }
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder obj=new AlertDialog.Builder(MainActivity.this);

        obj.setTitle("This Application Says:");
        obj.setMessage("Do you really want to close this app?");
        obj.setCancelable(true);

        obj.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        obj.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog=obj.create();
        alertDialog.show();
    }
}
