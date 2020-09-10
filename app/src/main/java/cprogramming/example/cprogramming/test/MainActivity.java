package cprogramming.example.cprogramming.test;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        b1 = (CardView) findViewById(R.id.button);
        b1.setOnClickListener(this);

        b2 = (CardView) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        b3 = (CardView) findViewById(R.id.button3);
        b3.setOnClickListener(this);

        b4 = (CardView) findViewById(R.id.button4);
        b4.setOnClickListener(this);

        b5 = (CardView) findViewById(R.id.button5);
        b5.setOnClickListener(this);

        b6 = (CardView) findViewById(R.id.button6);
        b6.setOnClickListener(this);

    }


    @Override
    public void onBackPressed() {

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_exit);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        CardView exit = dialog.findViewById(R.id.dialog_exit_btn);
        Button cancel = dialog.findViewById(R.id.dialog_exit_cancel_btn);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    @Override
    public void onClick(View v) {
        if (b1 == v) {
            Intent i = new Intent(MainActivity.this, Tutorials.class);
            startActivity(i);

        }
        if (b2 == v) {
            Intent i = new Intent(MainActivity.this, Programs.class);
            startActivity(i);

        }
        if (b3 == v) {
            Intent i = new Intent(MainActivity.this, Quiz.class);
            startActivity(i);

        }
        if (b4 == v) {
            Intent i = new Intent(MainActivity.this, Questions.class);
            startActivity(i);

        }
        if (b5 == v) {
            Intent i = new Intent(MainActivity.this, Setting.class);
            startActivity(i);

        }
        if (b6 == v) {
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
        }
    }
}
