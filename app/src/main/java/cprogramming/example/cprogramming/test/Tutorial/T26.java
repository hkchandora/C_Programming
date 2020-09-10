package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T26 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t26);

        b1 = (Button)findViewById(R.id.button136);

        t1 = (TextView)findViewById(R.id.textView231);

        t1.setText("Before a C program is compiled in a compiler, source code is processed by a program called preprocessor. This process is called preprocessing.\n" +
                "\n" +
                "Commands used in preprocessor are called preprocessor directives and they begin with ''#'' symbol. Below is the list of preprocessor directives that C language offers.\n" +
                "\n\n" +
                "1) Macro\n" +
                "syntax:\n" +
                "#define \n" +
                "This macro defines constant value and can be any of the basic data types.\n" +
                "\n\n" +
                "2) Header file inclusion \t\n" +
                "syntax:\n" +
                "#include <file_name>\n" +
                "\t The source code of the file ''file_name'' is included in the main program at the specified place\n" +
                "\n\n" +
                "3) Conditional compilation\n" +
                "syntax:\n" +
                "#ifdef, #endif, #if, #else, #ifndef\n" +
                "Set of commands are included or excluded in source program before compilation with respect to the condition\n" +
                "\n\n" +
                "4) Other directives \t\n" +
                "syntax:\n" +
                "#undef, #pragma\n" +
                "\t #undef is used to undefine a defined macro variable.\n" +
                "#Pragma is used to call a function before and after main function in a C program\n" +
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
