package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P22 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p22);

        b1=(Button) findViewById(R.id.button32);

        t1=(TextView) findViewById(R.id.textView48);
        t2=(TextView) findViewById(R.id.textView49);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint year;\n" +
                "\tprintf(\"Enter A Year to Check Is It Leap Year or Not = \");\n" +
                "\tscanf(\"%d\",year);\n" +
                "\tif(year%4==0)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Leap Year\",year);\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is not Leap Year\",year);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("'Enter A Year to Check Is It Leap Year or Not = 2004\n" +
                "2004 is Leap Year");

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
