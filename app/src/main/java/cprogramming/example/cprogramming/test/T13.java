package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class T13 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t13);

        b1 = (Button)findViewById(R.id.button123);

        t1 = (TextView)findViewById(R.id.textView218);

        t1.setText("1) Building Blocks of Programs\n" +
                "\n" +
                "Functions like main, printf and scanf, We have already come through.\n" +
                "All C programs made up of one or more functions. There must be one and only one main function. All functions are at the same level - there is no nesting. \n" +
                "\n\n" +
                "2) Return Value\n" +
                "\n" +
                "Including main All functions can return a value,.\n" +
                "Void Return type is specified if fuction is returning no value. Functions can return arithmetic values (int, float etc.), pointers structures, unions, or will not return anything (void) But they cannot return an array or a function.\n" +
                "\n\n" +
                "3) Function Parameters\n" +
                "\n" +
                "Any function (as well as main) can receive some values called parameters. While calling a function we must pass values of parameters.\n" +
                "\n" +
                "Format of Function :-\n" +
                "< return_type> < function_name>(parameters...)\n" +
                "{\n" +
                "}\n" +
                "\n" +
                "Only Values of the parameters to the function at the time of calling it \n" +
                "\n" +
                "If, In definition of function contains void as parameter then function will not accept any parameter.\n" +
                "\n" +
                "Calling the expressions specified as arguments in a function call and the variables listed as parameters in the function definition is very usual. For example, in the following call of function, the expressions x and y*2 are the arguments passed to the function. The values of the x and y will be copied into the parameters p and q. The variable given in the function definition are called as formal argument and the expression given in the function call are called as the actual argument .\n" +
                "\n" +
                "cal_area(a, b*2); \n");


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
