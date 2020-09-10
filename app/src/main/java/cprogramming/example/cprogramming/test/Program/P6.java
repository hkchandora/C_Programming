package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P6 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p6);

        b1=(Button) findViewById(R.id.button16);

        t1=(TextView) findViewById(R.id.textView16);
        t2=(TextView) findViewById(R.id.textView17);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a,b,add,sub,mul;\n" +
                "\tfloat div;\n" +
                "\tprintf(\"Enter two numbers = \");\n" +
                "\tscanf(\"%d%d\",&a,&b);\n" +
                        "\tadd = a+b;\n" +
                        "\tsub = a-b;\n" +
                        "\tmul = a*b;\n" +
                        "\tdiv = a/b;\n" +
                        "\tprintf(\"Addition is = %d\",add);\n" +
                "\tprintf(\"Subtraction is = %d\",sub);\n" +
                        "\tprintf(\"Multiplication is = %d\",&mul);\n" +
                        "\tprintf(\"Division is = %.4f\",div);\n" +
                        "\tgetch();\n" +
                        "}");
        t2.setText("Enter two numbers = \n" +
                "68\n" +
                "22\n" +
                "Addition is = 90\n" +
                "Subtraction is = 46\n" +
                "Multiplication is = 1496\n" +
                "Divition is = 3.0909");

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
