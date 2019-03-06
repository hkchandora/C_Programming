package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class T3 extends AppCompatActivity {

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t3);

        b1 = (Button)findViewById(R.id.button113);

        t1 = (TextView)findViewById(R.id.textView208);

        t1.setText("/* This program prints Hello World on screen */\n" +
                "\n" +
                "-------------------------------------\n" +
                "#include <stdio.h>\n" +
                "Void main()\n" +
                "{\n" +
                "  printf(''Hello World\\n'');\n" +
                "}\n" +
                "-------------------------------------\n" +
                "\n\n" +
                "1 . /* This program ... */\n" +
                "\n" +
                "The symbols/* and*/ used for comment. This Comments are ignored by the compiler, and are used to provide useful information about program to humans who use it.\n" +
                "\n" +
                "2. #include<stdio.h>\n" +
                "\n" +
                "This is a preprocessor command which tells compiler to include stdio.h file.\n" +
                "\n" +
                "3. main()\n" +
                "\n" +
                "C programs consist of one or more functions. There must be one and only one function called main. The brackets following the word main indicate that it is a function and not a variable.\n" +
                "\n" +
                "4. { }\n" +
                "\n" +
                "braces surround the body of the function, which may have one or more instructions/statements.\n" +
                "\n" +
                "5. printf()\n" +
                "\n" +
                "it is a library function that is used to print data on the user screen.\n" +
                "\n" +
                "6. ''Hello World\\n'' is a string that will be displayed on user screen \n" +
                "\\n is the newline character.\n" +
                "; a semicolon ends a statement.\n" +
                "\n" +
                "7. return 0; return the value zero to the Operating system.\n" +
                "\n" +
                "\n" +
                "C is case sensitive language, so the names of the functions must be typed in lower case as above.\n" +
                "\n" +
                "we can use white spaces, tabs & new line characters to make our code easy to read. \n");


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
