package cprogramming.example.cprogramming.test;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


public class Theoretical extends AppCompatActivity {
    ListView lv;

    String[] planets = new String[] {
            "1)Declaration & Initialization",
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

        lv=(ListView) findViewById(R.id.listView5);

        @SuppressWarnings("unchecked")
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, android.R.id.text1, planets);

        // Assign adapter to ListView
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Q1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Q2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Q3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Q4.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Q5.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), Q6.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), Q7.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), Q8.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), Q9.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), Q10.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), Q11.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), Q12.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), Q13.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), Q14.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), Q15.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), Q16.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), Q17.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), Q18.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Questions");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return  super.onOptionsItemSelected(item);
        }
    }

}
