package cprogramming.example.cprogramming.test;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(this);

        b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);

        b4=(Button) findViewById(R.id.button4);
        b4.setOnClickListener(this);

        b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(this);

        b6=(Button) findViewById(R.id.button6);
        b6.setOnClickListener(this);
    }


    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
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
                Intent i = new Intent(MainActivity.this,Reference.class);
                startActivity(i);
                return true;
            case R.id.about:
                Intent i2 = new Intent(MainActivity.this,About.class);
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
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        if(b1 == v)
        {
            Intent i = new Intent(MainActivity.this,Tutorials.class);
            startActivity(i);

        }
        if(b2 == v)
        {
            Intent i = new Intent(MainActivity.this,Programs.class);
            startActivity(i);

        }
        if(b3 == v)
        {
            Intent i = new Intent(MainActivity.this,Quiz.class);
            startActivity(i);

        }
        if(b4 == v)
        {
            Intent i = new Intent(MainActivity.this,Questions.class);
            startActivity(i);

        }
        if(b5 == v)
        {
            Intent i = new Intent(MainActivity.this,Setting.class);
            startActivity(i);

        }
        if(b6 == v)
        {
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
        }
    }
}
