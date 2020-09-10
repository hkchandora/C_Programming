package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P27 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p27);

        b1=(Button) findViewById(R.id.button37);

        t1=(TextView) findViewById(R.id.textView58);
        t2=(TextView) findViewById(R.id.textView59);

        t1.setText("#include<stdio.h\n" +
                "#include<conio.h>\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,temp,rev=0;\n" +
                "\tprintf(\"Enter a number to check is it Palindrome = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\ttemp=n;\n" +
                "\twhile(temp!=0)\n" +
                "\t{\n" +
                "\t\trev = rev*10;\n" +
                "\t\trev = rev+temp%10;\n" +
                "\t\ttemp = temp/10;\n" +
                "\t}\n" +
                "\tif(n==rev)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Palindrome Number\",n);\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is not Palindrome Number\",n);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter a number to check is it Palindrome = 121\n" +
                "121 is Palindrome Number");


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
