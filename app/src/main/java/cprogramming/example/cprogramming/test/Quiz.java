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
import android.widget.Button;

public class Quiz extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        b1 = (Button) findViewById(R.id.button7);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.button8);
        b2.setOnClickListener(this);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Questions and Answers");
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
                String shareBody = "This is C Programming App.\nHere, We Easy to Learn C Programming Language.\n" +
                        "Best Proper Tutorials, 100+ Programs with output, And Many Questions-Answers & Exam Questions also.\n" +
                        "Download it :-\n" +
                        "https://play.google.com/store/apps/details?id=cprogramming.example.cprogramming.test";
                String shareSub = "C Programming App";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                return true;
            case R.id.reference:
                Intent i = new Intent(Quiz.this,Reference.class);
                startActivity(i);
                return true;
            case R.id.about:
                Intent i2 = new Intent(Quiz.this,About.class);
                startActivity(i2);
                return true;
            case R.id.rate:
                Uri uri = Uri.parse("market://details?id=" + getPackageName());
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
                            Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
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

    @Override
    public void onClick(View v) {
        if(v == b1){
            Intent i = new Intent(Quiz.this,Optional.class);
            startActivity(i);
        }

        if(v == b2){
            Intent i = new Intent(Quiz.this,Theoretical.class);
            startActivity(i);
        }
    }
}
