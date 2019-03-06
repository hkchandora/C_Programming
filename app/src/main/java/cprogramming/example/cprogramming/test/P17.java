package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P17 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p17);

        b1=(Button) findViewById(R.id.button27);

        t1=(TextView) findViewById(R.id.textView38);
        t2=(TextView) findViewById(R.id.textView39);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrcsr();\n" +
                "\tint side,area;\n" +
                "\tprintf(\"Enter The Length of Side = \");\n" +
                "\tscanf(\"%d\",&side);\n" +
                "\tarea = side*side;\n" +
                "\tprintf(\"Area of Square is = %d\",area);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter The Length of Side = 25\nArea of Square is = 625");
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
