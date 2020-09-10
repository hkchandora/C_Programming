package cprogramming.example.cprogramming.test;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cprogramming.example.cprogramming.test.Tutorial.T1;
import cprogramming.example.cprogramming.test.Tutorial.T10;
import cprogramming.example.cprogramming.test.Tutorial.T11;
import cprogramming.example.cprogramming.test.Tutorial.T12;
import cprogramming.example.cprogramming.test.Tutorial.T13;
import cprogramming.example.cprogramming.test.Tutorial.T14;
import cprogramming.example.cprogramming.test.Tutorial.T15;
import cprogramming.example.cprogramming.test.Tutorial.T16;
import cprogramming.example.cprogramming.test.Tutorial.T17;
import cprogramming.example.cprogramming.test.Tutorial.T18;
import cprogramming.example.cprogramming.test.Tutorial.T19;
import cprogramming.example.cprogramming.test.Tutorial.T2;
import cprogramming.example.cprogramming.test.Tutorial.T20;
import cprogramming.example.cprogramming.test.Tutorial.T21;
import cprogramming.example.cprogramming.test.Tutorial.T22;
import cprogramming.example.cprogramming.test.Tutorial.T23;
import cprogramming.example.cprogramming.test.Tutorial.T24;
import cprogramming.example.cprogramming.test.Tutorial.T25;
import cprogramming.example.cprogramming.test.Tutorial.T26;
import cprogramming.example.cprogramming.test.Tutorial.T3;
import cprogramming.example.cprogramming.test.Tutorial.T4;
import cprogramming.example.cprogramming.test.Tutorial.T5;
import cprogramming.example.cprogramming.test.Tutorial.T6;
import cprogramming.example.cprogramming.test.Tutorial.T7;
import cprogramming.example.cprogramming.test.Tutorial.T8;
import cprogramming.example.cprogramming.test.Tutorial.T9;

public class Tutorials extends AppCompatActivity {
    ListView lv;

    String[] planets = new String[]{"1. Introduction", "2. Advantages of C", "3. Structure of Program", "4. Variable", "5. Operators",
            "6. Formatted IO-printf & scanf", "7. Chracter IO-getchar & putchar", "8. Conditional Branching-if", "9. Conditional Selection-switch", "10. Loops-while & for",
            "11. Local Jumps goto", "12. Break and Continue", "13. Function Basic", "14. Defination & Declaration(Funtion)", "15. Standard Header Files", "16. Block and Scope", "17. Variable Storage Classes", "18. Definition & Declaration", "19. Initialisation of Variables",
            "20. Array", "21. Pointer", "22. String", "23. Structure", "24. Union",
            "25. File Operations and Functions", "26. C Perprocessor Directives"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        lv = (ListView) findViewById(R.id.listView1);

        @SuppressWarnings("unchecked")
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, planets);

        // Assign adapter to ListView
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), T1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), T2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), T3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), T4.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), T5.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), T6.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), T7.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), T8.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), T9.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), T10.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), T11.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), T12.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), T13.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), T14.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), T15.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), T16.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), T17.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), T18.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), T19.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), T20.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), T21.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), T22.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), T23.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), T24.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), T25.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), T26.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tutorials");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "This is C Programming App.\nHere, We can Easy to Learn C Programming Language.\n" +
                        "Best Proper Tutorials, 100+ Programs with output, And Many Questions-Answers & Exam Questions also.\n" +
                        "Download it :-\n\n" +
                        "https://play.google.com/store/apps/details?id=cprogramming.example.cprogramming.test";
                String shareSub = "C Programming App";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                return true;
            case R.id.reference:
                Intent i = new Intent(Tutorials.this,Reference.class);
                startActivity(i);
                return true;
            case R.id.about:
                Intent i2 = new Intent(Tutorials.this,About.class);
                startActivity(i2);
                return true;
            case R.id.rate:
                Uri uri = Uri.parse("market://details?id=cprogramming.example.cprogramming.test" + getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=cprogramming.example.cprogramming.test" + getPackageName())));
                }
                return true;
            default:
                return  super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return true;
    }

}
