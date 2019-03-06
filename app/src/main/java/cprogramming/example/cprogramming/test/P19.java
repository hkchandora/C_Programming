package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P19 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p19);

        b1=(Button) findViewById(R.id.button29);

        t1=(TextView) findViewById(R.id.textView42);
        t2=(TextView) findViewById(R.id.textView43);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#define PI 3.14\n" +
                "void main()\n" +
                "{\n" +
                "\tclrcsr();\n" +
                "\tfloat r,h,vol;\n" +
                "\tprintf(\"Enter The Value of Radious = \");\n" +
                "\tscanf(\"%f\",&r);\n" +
                "\tprintf(\"Enter The Value of Height = \");\n" +
                "\tscanf(\"%f\",&h);\n" +
                "\tvol = PI*r*r*h;\n" +
                "\tprintf(\"Volume of Cylinder is = %f\",vol);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter The Value of Radious = 10\n" +
                "Enter The Value of Height = 15\n" +
                "Volume of Cylinder is = 4710");
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
