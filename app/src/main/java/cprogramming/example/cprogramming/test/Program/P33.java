package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P33 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p33);

        b1=(Button) findViewById(R.id.button43);

        t1=(TextView) findViewById(R.id.textView70);
        t2=(TextView) findViewById(R.id.textView71);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "int factorial(int n)\n" +
                        "{\n" +
                        "\tint i,fact=1;\n" +
                        "\tfor(i=1;i<=n;i++)\n" +
                        "\t{\n" +
                        "\t\tfact = fact*i;\n" +
                        "\t}\n" +
                        "\tprintf(\"Factorial of %d is = %d\",n,result);\n" +
                "}\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n;\n" +
                "\tprintf(\"Enter a number = \")\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tfactorial(n);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter a number = 5\n" +
                "Factorial of 5 is = 120");


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
