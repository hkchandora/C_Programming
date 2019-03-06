package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P20 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p20);

        b1=(Button) findViewById(R.id.button30);

        t1=(TextView) findViewById(R.id.textView44);
        t2=(TextView) findViewById(R.id.textView45);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#define PI 3.1416\n" +
                "void main()\n" +
                "{\n" +
                "\tclrcsr();\n" +
                "\tfloat r,vol;\n" +
                "\tprintf(\"Enter the Radius = \");\n" +
                "\tif(scanf(\"%f\",&r)==1)\n" +
                "\t{\n" +
                "\t\tvolume = (4/3)*PI*pow(r,3);\n" +
                "\t\tprintf(\"The Volume is = %6.2f\",vol);\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tprintf(\"ERROR,Enter Correct Value\");\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the Radius = 20\nThe Volume is = 33510.39");
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
