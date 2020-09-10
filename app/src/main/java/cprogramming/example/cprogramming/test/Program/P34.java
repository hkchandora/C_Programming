package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P34 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p34);


        b1=(Button) findViewById(R.id.button44);

        t1=(TextView) findViewById(R.id.textView72);
        t2=(TextView) findViewById(R.id.textView73);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,fact;\n" +
                "\tprintf(\"Enter a Number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tif(n<0)\n" +
                "\t{\n" +
                "\t\tprintf(\"Negative number is not allowed\");\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tfact = factorial();\n" +
                "\t}\n" +
                "\tprintf(\"%d! = %d\",n,fact);\n" +
                "\tgetch();\n" +
                "}\n" +
                "int factorial(int n)\n" +
                "{\n" +
                "\tif(n==0)\n" +
                "\t\treturn 1;\n" +
                "\telse\n" +
                "\t\treturn n*factorial(n-1);\n" +
                "}");

        t2.setText("Enter a Number = 10\n" +
                "10! = 3628800");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Programs");
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
