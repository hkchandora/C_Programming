package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class T15 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t15);

        b1 = (Button)findViewById(R.id.button125);

        t1 = (TextView)findViewById(R.id.textView220);

        t1.setText("standard header files contains Prototypes of the library functions. For example, math.h contains prototypes for mathematical operations.\n" +
                "\n" +
                "some standard header files are:\n" +
                "stdio.h printf, scanf, getchar, putchat etc.\n" +
                "stdlib.h utility functions; number conversions, memory allocation, exit and system , Quick Sort\n" +
                "float.h system limits for floating point types\n" +
                "math.h mathematical functions\n" +
                "string.h string functions\n" +
                "assert.h assertions\n" +
                "ctype.h character class tests\n" +
                "time.h date and time functions\n" +
                "limits.h system limits for integral types\n" +
                "setjmp.h non-local jumps\n" +
                "signal.h signals and error handling\n" +
                "stdarg.h variable length parameter lists\n" +
                "\n" +
                "Use the #include (preprocessor directive) and give angle brackets around the name of the file to include these standard header files in your program \n");



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
