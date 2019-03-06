package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P15 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p15);

        b1=(Button) findViewById(R.id.button25);

        t1=(TextView) findViewById(R.id.textView34);
        t2=(TextView) findViewById(R.id.textView35);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<math.h>\n" +
                "#define PI 3.142\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tfloat radious,area;\n" +
                "\tprintf(\"Enter The Radius of Circle = \");\n" +
                "\tscanf(\"%f\",&radius);\n" +
                "\tarea = PI*pow(radius,2);\n" +
                "\tprintf(\"Area of Circle = %.2f\",area);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter The Radius of Circle = 10\nArea of Circle = 314.20");
        t2.setText("Enter a integer number, you want to add = \n5\nEnter 5 intergers\n1\n2\n3\n4\n5\nSum of entered integer = 15");

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
