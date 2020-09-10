package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P13 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p13);

        b1=(Button) findViewById(R.id.button23);

        t1=(TextView) findViewById(R.id.textView30);
        t2=(TextView) findViewById(R.id.textView31);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint basic,da,ta;\n" +
                        "\tfloat gross_salary;\n" +
                        "\tprintf(\"Enter Basic Salary = \");\n" +
                        "\tscanf(\"%d\",&basic);\n" +
                        "\tda = (10*basic)/100;\n" +
                        "\tta = (12*basic)/100;\n" +
                        "\tgross_salary = basic+da+ta;\n" +
                        "\tprintf(\"Gross Salary is = %f\",gross_salary);\n" +
                        "\tgetch();\n" +
                        "}");

        t2.setText("Enter Basic Salary = 10000\nGross Salary is = 12200");

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
