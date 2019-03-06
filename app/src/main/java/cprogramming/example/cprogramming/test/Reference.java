package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Reference extends AppCompatActivity {
    Button b1;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);

        b1=(Button) findViewById(R.id.button10);

        t3=(TextView) findViewById(R.id.textView3);
        t3.setText("Book:\n" +
                "Setphen Gough and Brevan Miles, *Programming in C Oxford University Computing Services 3rd ed.,October 1996*\n\n" +
                "Rob Miles,*Introduction to C Programming,2001*\n\n" +
                "Nick Parlante, Essential C,April 2003\n\n\n" +

                "Websites:\n" +
                "*C Programming Tutorial*,[online], Available: http://fresh2refresh.com/c-tutorial-for-beginner/\n\n" +
                "*C Programming examoles*,[online], Available: http://www.programmingsimplified.com/c-program-examples\n\n" +
                "*C Interview Questions(2019)*,[online], Available: http://placement.freshersworld.com/power-programming-answer-21419");



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Reference");
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
