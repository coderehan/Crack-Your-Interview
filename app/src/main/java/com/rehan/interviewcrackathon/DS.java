package com.rehan.interviewcrackathon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DS extends AppCompatActivity {
    ActionBar actionBar;

    ExpandableListView expandableListView;
    List<String> questions;
    HashMap<String, List<String>> answers;
    ExpandableListAdapter expandableListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_s);

        actionBar=getSupportActionBar();
        actionBar.setTitle("Data Structures");

        expandableListView=findViewById(R.id.expandableListView);
        fillData();
        expandableListAdapter=new MyExpandableListAdapter(this,questions,answers);
        expandableListView.setAdapter(expandableListAdapter);

    }

    public void fillData()
    {
        questions=new ArrayList<>();
        answers=new HashMap<>();

        questions.add(getString(R.string.dsa_q1));
        questions.add(getString(R.string.dsa_q2));
        questions.add(getString(R.string.dsa_q3));
        questions.add(getString(R.string.dsa_q4));
        questions.add(getString(R.string.dsa_q5));
        questions.add(getString(R.string.dsa_q6));
        questions.add(getString(R.string.dsa_q7));
        questions.add(getString(R.string.dsa_q8));
        questions.add(getString(R.string.dsa_q9));
        questions.add(getString(R.string.dsa_q10));
        questions.add(getString(R.string.dsa_q11));
        questions.add(getString(R.string.dsa_q12));
        questions.add(getString(R.string.dsa_q13));
        questions.add(getString(R.string.dsa_q14));
        questions.add(getString(R.string.dsa_q15));
        questions.add(getString(R.string.dsa_q16));
        questions.add(getString(R.string.dsa_q17));
        questions.add(getString(R.string.dsa_q18));
        questions.add(getString(R.string.dsa_q19));
        questions.add(getString(R.string.dsa_q20));
        questions.add(getString(R.string.dsa_q21));
        questions.add(getString(R.string.dsa_q22));
        questions.add(getString(R.string.dsa_q23));
        questions.add(getString(R.string.dsa_q24));
        questions.add(getString(R.string.dsa_q25));
        questions.add(getString(R.string.dsa_q26));
        questions.add(getString(R.string.dsa_q27));
        questions.add(getString(R.string.dsa_q28));
        questions.add(getString(R.string.dsa_q29));
        questions.add(getString(R.string.dsa_q30));
        questions.add(getString(R.string.dsa_q31));
        questions.add(getString(R.string.dsa_q32));
        questions.add(getString(R.string.dsa_q33));
        questions.add(getString(R.string.dsa_q34));
        questions.add(getString(R.string.dsa_q35));
        questions.add(getString(R.string.dsa_q36));
        questions.add(getString(R.string.dsa_q37));
        questions.add(getString(R.string.dsa_q38));
        questions.add(getString(R.string.dsa_q39));
        questions.add(getString(R.string.dsa_q40));
        questions.add(getString(R.string.dsa_q41));
        questions.add(getString(R.string.dsa_q42));
        questions.add(getString(R.string.dsa_q43));
        questions.add(getString(R.string.dsa_q44));
        questions.add(getString(R.string.dsa_q45));
        questions.add(getString(R.string.dsa_q46));
        questions.add(getString(R.string.dsa_q47));
        questions.add(getString(R.string.dsa_q48));

        List<String> answer1=new ArrayList<>();
        List<String> answer2=new ArrayList<>();
        List<String> answer3=new ArrayList<>();
        List<String> answer4=new ArrayList<>();
        List<String> answer5=new ArrayList<>();
        List<String> answer6=new ArrayList<>();
        List<String> answer7=new ArrayList<>();
        List<String> answer8=new ArrayList<>();
        List<String> answer9=new ArrayList<>();
        List<String> answer10=new ArrayList<>();
        List<String> answer11=new ArrayList<>();
        List<String> answer12=new ArrayList<>();
        List<String> answer13=new ArrayList<>();
        List<String> answer14=new ArrayList<>();
        List<String> answer15=new ArrayList<>();
        List<String> answer16=new ArrayList<>();
        List<String> answer17=new ArrayList<>();
        List<String> answer18=new ArrayList<>();
        List<String> answer19=new ArrayList<>();
        List<String> answer20=new ArrayList<>();
        List<String> answer21=new ArrayList<>();
        List<String> answer22=new ArrayList<>();
        List<String> answer23=new ArrayList<>();
        List<String> answer24=new ArrayList<>();
        List<String> answer25=new ArrayList<>();
        List<String> answer26=new ArrayList<>();
        List<String> answer27=new ArrayList<>();
        List<String> answer28=new ArrayList<>();
        List<String> answer29=new ArrayList<>();
        List<String> answer30=new ArrayList<>();
        List<String> answer31=new ArrayList<>();
        List<String> answer32=new ArrayList<>();
        List<String> answer33=new ArrayList<>();
        List<String> answer34=new ArrayList<>();
        List<String> answer35=new ArrayList<>();
        List<String> answer36=new ArrayList<>();
        List<String> answer37=new ArrayList<>();
        List<String> answer38=new ArrayList<>();
        List<String> answer39=new ArrayList<>();
        List<String> answer40=new ArrayList<>();
        List<String> answer41=new ArrayList<>();
        List<String> answer42=new ArrayList<>();
        List<String> answer43=new ArrayList<>();
        List<String> answer44=new ArrayList<>();
        List<String> answer45=new ArrayList<>();
        List<String> answer46=new ArrayList<>();
        List<String> answer47=new ArrayList<>();
        List<String> answer48=new ArrayList<>();

        answer1.add(getString(R.string.dsa_a1));
        answer2.add(getString(R.string.dsa_a2));
        answer3.add(getString(R.string.dsa_a3));
        answer4.add(getString(R.string.dsa_a4));
        answer5.add(getString(R.string.dsa_a5));
        answer6.add(getString(R.string.dsa_a6));
        answer7.add(getString(R.string.dsa_a7));
        answer8.add(getString(R.string.dsa_a8));
        answer9.add(getString(R.string.dsa_a9));
        answer10.add(getString(R.string.dsa_a10));
        answer11.add(getString(R.string.dsa_a11));
        answer12.add(getString(R.string.dsa_a12));
        answer13.add(getString(R.string.dsa_a13));
        answer14.add(getString(R.string.dsa_a14));
        answer15.add(getString(R.string.dsa_a15));
        answer16.add(getString(R.string.dsa_a16));
        answer17.add(getString(R.string.dsa_a17));
        answer18.add(getString(R.string.dsa_a18));
        answer19.add(getString(R.string.dsa_a19));
        answer20.add(getString(R.string.dsa_a20));
        answer21.add(getString(R.string.dsa_a21));
        answer22.add(getString(R.string.dsa_a22));
        answer23.add(getString(R.string.dsa_a23));
        answer24.add(getString(R.string.dsa_a24));
        answer25.add(getString(R.string.dsa_a25));
        answer26.add(getString(R.string.dsa_a26));
        answer27.add(getString(R.string.dsa_a27));
        answer28.add(getString(R.string.dsa_a28));
        answer29.add(getString(R.string.dsa_a29));
        answer30.add(getString(R.string.dsa_a30));
        answer31.add(getString(R.string.dsa_a31));
        answer32.add(getString(R.string.dsa_a32));
        answer33.add(getString(R.string.dsa_a33));
        answer34.add(getString(R.string.dsa_a34));
        answer35.add(getString(R.string.dsa_a35));
        answer36.add(getString(R.string.dsa_a36));
        answer37.add(getString(R.string.dsa_a37));
        answer38.add(getString(R.string.dsa_a38));
        answer39.add(getString(R.string.dsa_a39));
        answer40.add(getString(R.string.dsa_a40));
        answer41.add(getString(R.string.dsa_a41));
        answer42.add(getString(R.string.dsa_a42));
        answer43.add(getString(R.string.dsa_a43));
        answer44.add(getString(R.string.dsa_a44));
        answer45.add(getString(R.string.dsa_a45));
        answer46.add(getString(R.string.dsa_a46));
        answer47.add(getString(R.string.dsa_a47));
        answer48.add(getString(R.string.dsa_a48));
        
        answers.put(questions.get(0), answer1);
        answers.put(questions.get(1), answer2);
        answers.put(questions.get(2), answer3);
        answers.put(questions.get(3), answer4);
        answers.put(questions.get(4), answer5);
        answers.put(questions.get(5), answer6);
        answers.put(questions.get(6), answer7);
        answers.put(questions.get(7), answer8);
        answers.put(questions.get(8), answer9);
        answers.put(questions.get(9), answer10);
        answers.put(questions.get(10), answer11);
        answers.put(questions.get(11), answer12);
        answers.put(questions.get(12), answer13);
        answers.put(questions.get(13), answer14);
        answers.put(questions.get(14), answer15);
        answers.put(questions.get(15), answer16);
        answers.put(questions.get(16), answer17);
        answers.put(questions.get(17), answer18);
        answers.put(questions.get(18), answer19);
        answers.put(questions.get(19), answer20);
        answers.put(questions.get(20), answer21);
        answers.put(questions.get(21), answer22);
        answers.put(questions.get(22), answer23);
        answers.put(questions.get(23), answer24);
        answers.put(questions.get(24), answer25);
        answers.put(questions.get(25), answer26);
        answers.put(questions.get(26), answer27);
        answers.put(questions.get(27), answer28);
        answers.put(questions.get(28), answer29);
        answers.put(questions.get(29), answer30);
        answers.put(questions.get(30), answer31);
        answers.put(questions.get(31), answer32);
        answers.put(questions.get(32), answer33);
        answers.put(questions.get(33), answer34);
        answers.put(questions.get(34), answer35);
        answers.put(questions.get(35), answer36);
        answers.put(questions.get(36), answer37);
        answers.put(questions.get(37), answer38);
        answers.put(questions.get(38), answer39);
        answers.put(questions.get(39), answer40);
        answers.put(questions.get(40), answer41);
        answers.put(questions.get(41), answer42);
        answers.put(questions.get(42), answer43);
        answers.put(questions.get(43), answer44);
        answers.put(questions.get(44), answer45);
        answers.put(questions.get(45), answer46);
        answers.put(questions.get(46), answer47);
        answers.put(questions.get(47), answer48);

    }
}
