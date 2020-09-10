package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T12 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t12);

        b1 = (Button)findViewById(R.id.button122);

        t1 = (TextView)findViewById(R.id.textView217);

        t1.setText("1) Break statement\n" +
                "\n" +
                "Break statement is usually used to terminate a case in the switch statement. \n" +
                "Break statement in loops to instantly terminates the loop and program control goes to the next statement after the loop.\n" +
                "\n" +
                "If break statement is used in nested loops (i.e., loop within another loop), the break statement will end the execution of the inner loop and Program control goes back to outer loop.\n" +
                "\n" +
                "Syntax :\n" +
                "break;\n" +
                "\n\n" +
                "2) Continue statement\n" +
                "\n" +
                "In C programming language the continue statement works slightly similar to the break statement. The continue restarts the loop with the next value of item. All the line code below continue statement is skips.\n" +
                "\n" +
                "Syntax :\n" +
                "continue; \n" +
                "\n" +
                "In the for loop, continue statement skips the test condition and increment value of the variable to execute again and In the while and do...while loops, continue skips all the statements and program control goes to at the end of loop for tests condition.\n");



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
            default:
                return  super.onOptionsItemSelected(item);
        }
    }

}
