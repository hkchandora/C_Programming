package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;

public class P30 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p30);

        b1=(Button) findViewById(R.id.button40);

        t1=(TextView) findViewById(R.id.textView64);
        t2=(TextView) findViewById(R.id.textView65);

        t1.setText("#include<stdio.h\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tint n,temp,rem,sum=0;\n" +
                "\tprintf(\"Enter A Number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\ttemp=n;\n" +
                "\twhile(temp!=0)\n" +
                "\t{\n" +
                "\t\trem = temp%10;\n" +
                "\t\tsum = sum+(rem*rem*rem);\n" +
                "\t\ttemp = temp/10;\n" +
                "\t}\n" +
                "\tif(n==sum)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Armstrong Number\",n);\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Not Armstrong Number\",n);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter A Number = 153\n" +
                "153 is Armstrong Number");


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
    }}
