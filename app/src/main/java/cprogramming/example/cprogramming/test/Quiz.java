package cprogramming.example.cprogramming.test;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Quiz extends AppCompatActivity implements View.OnClickListener {
    CardView theoryCardView, optionalCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        theoryCardView =  findViewById(R.id.button7);
        theoryCardView.setOnClickListener(this);

        optionalCardView =  findViewById(R.id.button8);
        optionalCardView.setOnClickListener(this);



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
            default:
                return  super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        if(v == theoryCardView){
            Intent i = new Intent(Quiz.this,Optional.class);
            startActivity(i);
        }

        if(v == optionalCardView){
            Intent i = new Intent(Quiz.this,Theoretical.class);
            startActivity(i);
        }
    }
}
