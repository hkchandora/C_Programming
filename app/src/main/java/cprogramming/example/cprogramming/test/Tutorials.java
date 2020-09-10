package cprogramming.example.cprogramming.test;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import cprogramming.example.cprogramming.test.adapter.ProgramItemAdapter;
import cprogramming.example.cprogramming.test.adapter.TutorialItemAdapter;

public class Tutorials extends AppCompatActivity {
    private RecyclerView recyclerView;

    String[] title = new String[]{"1. Introduction", "2. Advantages of C", "3. Structure of Program", "4. Variable", "5. Operators",
            "6. Formatted IO-printf & scanf", "7. Chracter IO-getchar & putchar", "8. Conditional Branching-if", "9. Conditional Selection-switch", "10. Loops-while & for",
            "11. Local Jumps goto", "12. Break and Continue", "13. Function Basic", "14. Defination & Declaration(Funtion)", "15. Standard Header Files", "16. Block and Scope", "17. Variable Storage Classes", "18. Definition & Declaration", "19. Initialisation of Variables",
            "20. Array", "21. Pointer", "22. String", "23. Structure", "24. Union",
            "25. File Operations and Functions", "26. C Perprocessor Directives"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        recyclerView = findViewById(R.id.listView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TutorialItemAdapter(this, title));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tutorials");
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
