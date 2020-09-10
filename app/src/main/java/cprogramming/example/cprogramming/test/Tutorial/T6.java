package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T6 extends AppCompatActivity {

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t6);

        b1 = (Button)findViewById(R.id.button116);

        t1 = (TextView)findViewById(R.id.textView211);

        t1.setText("1) Formatted Output - printf\n" +
                "\n" +
                "It takes text and values from within the program and sends it out onto the screen.\n" +
                "\n" +
                "printf(''%f is your weight\\n'', w);\n" +
                "In the above program statement: \n" +
                "\n" +
                "''%f is your weight\\n'' is the control string \n" +
                "w   is the variable to be printed \n" +
                "%f   meaning that a floating point value is to be printed.\n" +
                "The number of conversion specifications and the number of variables following the control string must be same, and that the conversion character is correct for the type of the parameter.\n" +
                "\n\n" +
                "2) Formatted Input - scanf\n" +
                "\n" +
                "scanf is used to get input from user and to store it in the specified variable(s).\n" +
                "scanf(''%d'', &x);\n" +
                "read a decimal integer from the keyboard and store the value in the memory address of the variable x.\n" +
                "\n\n" +
                "3) Character Escape Sequences\n" +
                "\n" +
                "  There are several character escape sequences which can be used in place of a character constant or within a string. \n" +
                "\n" +
                "\\a alert (bell)\n" +
                "\\b backspace\n" +
                "\\f formfeed\n" +
                "\\n newline\n" +
                "\\r carriage return\n" +
                "\\t tab\n" +
                "\\v vertical tab\n" +
                "\\ backslash\n" +
                "\\? question mark\n" +
                "\\' quote\n" +
                "\\'' double quote\n" +
                "\\ooo character specified as an octal number\n" +
                "\\xhh character specified in hexadecimal\n" +
                "\n");


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
