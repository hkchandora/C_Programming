package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P18 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p18);

        b1=(Button) findViewById(R.id.button28);

        t1=(TextView) findViewById(R.id.textView40);
        t2=(TextView) findViewById(R.id.textView41);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrcsr();\n" +
                "\tfloat a,surface_area,volume;\n" +
                "\tprintf(\"Enter Size of Side of a Cube = \");\n" +
                "\tscanf(\"%f\",&a);\n" +
                "\tsurface_area = 6*(a*a);\n" +
                "\tvolume = a*a*a;\n" +
                "\tprintf(\"Surface Area of Cube is = %f\",surface_area);\n" +
                "\tprintf(\"Volume of Cube is = %f\",volume);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter Size of Side of a Cube = 4\n" +
                "Surface Area of Cube is = 96\n" +
                "Volume of Cube is = 64");
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
