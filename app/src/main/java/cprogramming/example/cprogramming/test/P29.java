package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P29 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p29);

        b1=(Button) findViewById(R.id.button39);

        t1=(TextView) findViewById(R.id.textView62);
        t2=(TextView) findViewById(R.id.textView63);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,i=1,sum=0;\n" +
                "\tprintf(\"Enter A Number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\twhile(i<n)\n" +
                "\t{\n" +
                "\t\tsum = sum+i;\n" +
                "\t\ti++;\n" +
                "\t}\n" +
                "\tif(sum==n)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d Is A Perfect Number\",n);\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tprintf(\"%d Is Not A Perfect Number\",n);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter A Number = 15\n" +
                "15 Is Not A Perfect Number");


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
