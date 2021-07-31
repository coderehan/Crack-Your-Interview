package com.rehan.interviewcrackathon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Python extends AppCompatActivity {
    ActionBar actionBar;

    ExpandableListView expandableListView;
    List<String> questions;
    HashMap<String, List<String>> answers;
    ExpandableListAdapter expandableListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        actionBar=getSupportActionBar();
        actionBar.setTitle("Python");

        expandableListView=findViewById(R.id.expandableListView);
        fillData();
        expandableListAdapter=new MyExpandableListAdapter(this,questions,answers);
        expandableListView.setAdapter(expandableListAdapter);

    }

    public void fillData()
    {
        questions=new ArrayList<>();
        answers=new HashMap<>();

        questions.add(getString(R.string.python_q1));
        questions.add(getString(R.string.python_q2));
        questions.add(getString(R.string.python_q3));
        questions.add(getString(R.string.python_q4));
        questions.add(getString(R.string.python_q5));
        questions.add(getString(R.string.python_q6));
        questions.add(getString(R.string.python_q7));
        questions.add(getString(R.string.python_q8));
        questions.add(getString(R.string.python_q9));
        questions.add(getString(R.string.python_q10));
        questions.add(getString(R.string.python_q11));
        questions.add(getString(R.string.python_q12));
        questions.add(getString(R.string.python_q13));
        questions.add(getString(R.string.python_q14));
        questions.add(getString(R.string.python_q15));
        questions.add(getString(R.string.python_q16));
        questions.add(getString(R.string.python_q17));
        questions.add(getString(R.string.python_q18));
        questions.add(getString(R.string.python_q19));
        questions.add(getString(R.string.python_q20));
        questions.add(getString(R.string.python_q21));
        questions.add(getString(R.string.python_q22));
        questions.add(getString(R.string.python_q23));
        questions.add(getString(R.string.python_q24));
        questions.add(getString(R.string.python_q25));
        questions.add(getString(R.string.python_q26));
        questions.add(getString(R.string.python_q27));
        questions.add(getString(R.string.python_q28));
        questions.add(getString(R.string.python_q29));
        questions.add(getString(R.string.python_q30));

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

        answer1.add(getString(R.string.python_a1));
        answer2.add(getString(R.string.python_a2));
        answer3.add(getString(R.string.python_a3));
        answer4.add(getString(R.string.python_a4));
        answer5.add(getString(R.string.python_a5));
        answer6.add(getString(R.string.python_a6));
        answer7.add(getString(R.string.python_a7));
        answer8.add(getString(R.string.python_a8));
        answer9.add(getString(R.string.python_a9));
        answer10.add(getString(R.string.python_a10));
        answer11.add(getString(R.string.python_a11));
        answer12.add(getString(R.string.python_a12));
        answer13.add(getString(R.string.python_a13));
        answer14.add(getString(R.string.python_a14));
        answer15.add(getString(R.string.python_a15));
        answer16.add(getString(R.string.python_a16));
        answer17.add(getString(R.string.python_a17));
        answer18.add(getString(R.string.python_a18));
        answer19.add(getString(R.string.python_a19));
        answer20.add(getString(R.string.python_a20));
        answer21.add(getString(R.string.python_a21));
        answer22.add(getString(R.string.python_a22));
        answer23.add(getString(R.string.python_a23));
        answer24.add(getString(R.string.python_a24));
        answer25.add(getString(R.string.python_a25));
        answer26.add(getString(R.string.python_a26));
        answer27.add(getString(R.string.python_a27));
        answer28.add(getString(R.string.python_a28));
        answer29.add(getString(R.string.python_a29));
        answer30.add(getString(R.string.python_a30));

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

    }
}
