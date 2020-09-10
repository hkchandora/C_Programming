package cprogramming.example.cprogramming.test;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cprogramming.example.cprogramming.test.Question.Q1;
import cprogramming.example.cprogramming.test.Question.Q10;
import cprogramming.example.cprogramming.test.Question.Q11;
import cprogramming.example.cprogramming.test.Question.Q12;
import cprogramming.example.cprogramming.test.Question.Q13;
import cprogramming.example.cprogramming.test.Question.Q14;
import cprogramming.example.cprogramming.test.Question.Q15;
import cprogramming.example.cprogramming.test.Question.Q16;
import cprogramming.example.cprogramming.test.Question.Q17;
import cprogramming.example.cprogramming.test.Question.Q18;
import cprogramming.example.cprogramming.test.Question.Q2;
import cprogramming.example.cprogramming.test.Question.Q3;
import cprogramming.example.cprogramming.test.Question.Q4;
import cprogramming.example.cprogramming.test.Question.Q5;
import cprogramming.example.cprogramming.test.Question.Q6;
import cprogramming.example.cprogramming.test.Question.Q7;
import cprogramming.example.cprogramming.test.Question.Q8;
import cprogramming.example.cprogramming.test.Question.Q9;
import cprogramming.example.cprogramming.test.adapter.QuestionItemAdapter;
import cprogramming.example.cprogramming.test.adapter.TheoryQuestionItemAdapter;


public class Theoretical extends AppCompatActivity {

    private RecyclerView recyclerView;

    String[] text = new String[]{
            "1) Declaration & Initialization",
            "2) Structure and Union",
            "3) Expressions",
            "4) Null Statements",
            "5) Arrays and Pointers",
            "6) Memory Allocation",
            "7) Character and String",
            "8) Variables",
            "9) C Preprocessor",
            "10) ANSI-ISO Standard C",
            "11) Stdio",
            "12) Library Function",
            "13) Floating Lists",
            "14) Argument Lists",
            "15) Lint",
            "16) Style",
            "17) System Dependencies",
            "18) Miscellaneous"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theoretical);

        recyclerView = findViewById(R.id.listView5);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TheoryQuestionItemAdapter(this, text));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Questions");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
