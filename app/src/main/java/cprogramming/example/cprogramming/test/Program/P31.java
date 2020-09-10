package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P31 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p31);

        b1=(Button) findViewById(R.id.button41);

        t1=(TextView) findViewById(R.id.textView66);
        t2=(TextView) findViewById(R.id.textView67);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,i,temp,rem=0,sum=0;\n" +
                "\tprintf(\"Enter A No Upto Which We Want Armstrong Number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"Following Armstrong Numbers Are Found from 1 to %d\",n);\n" +
                "\tfor(i=1;i<=n;i++)\n" +
                "\t{\n" +
                "\t\ttemp = c;\n" +
                "\t\twhile(temp!=0)\n" +
                "\t\t{\n" +
                "\t\t\trem = temp%10;\n" +
                "\t\t\tsum = sum+rem*rem*rem);\n" +
                "\t\t\ttemp = temp/10;\n" +
                "\t\t}\n" +
                "\t\tif(i==sum)\n" +
                "\t\t{\n" +
                "\t\t\tprintf(\"%d\",i);\n" +
                "\t\t\tsum=0;\n" +
                "\t\t}\n\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter A No Upto Which We Want Armstrong Number = \n200\n" +
                "Following Armstrong Numbers Are Found from 1 to 200\n" +
                "1\n" +
                "153");


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
