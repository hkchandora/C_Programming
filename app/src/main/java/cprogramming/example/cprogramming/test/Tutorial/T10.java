package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;

public class T10 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t10);

        b1 = (Button)findViewById(R.id.button120);

        t1 = (TextView)findViewById(R.id.textView215);

        t1.setText("1) while loop\n" +
                "\n" +
                "The while loop calculates the expression before every loop. If the expression is true then block of statements is executed, so it will not execute If the condition is initially false. It needs the parenthesis like the if statement.\n" +
                "\n" +
                "while ( expression ) \n" +
                "/* while expression is true do following*/\n" +
                "  statements... ;\n" +
                "\n\n" +
                "2) Do While loop\n" +
                "This is equivalent to a while loop, but it have test condition at the end of the loop. The Do while loop will always execute at least once.\n" +
                "\n" +
                "do\n" +
                "  statements ;\n" +
                "while ( expression );\n" +
                "/* while expression is true do...*/\n" +
                "\n\n" +
                "3) For loop\n" +
                "This is very widely held loop.\n" +
                "For loops work like the corresponding while loop shown in the above example. The first expression is treated as a statement and executed, then the second expression is test or condition which is evaluated to see if the body of the loop should be executed. The third expression is increment or decrement which is performed at the end of every iteration/repetition of the loop.\n" +
                "\n" +
                "for (expr1; expr2; expr3)\n" +
                "  statements...;\n" +
                "\n" +
                "  In while loop it can happen that the statement will never execute But In the do-while loop, test condition is based at the end of loop therefore the block of statement will always execute at least once. This is the main difference between the while and the do-while loop.\n" +
                "\n" +
                "  For example, to execute a statement 5 times: \n" +
                "\n" +
                "for (i = 0; i < 5; i++)\n" +
                "  printf(''%d\\\\n'',i);\n" +
                "\n" +
                "Another way of doing this is:\n" +
                "i = 5;\n" +
                "while (i--)\n" +
                "  statements;\n" +
                "\n" +
                "While using this method, make sure that value of i is greater than zero, or make the test i-->0.\n");


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
