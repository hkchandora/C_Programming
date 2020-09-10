package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P28 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p28);

        b1=(Button) findViewById(R.id.button38);

        t1=(TextView) findViewById(R.id.textView60);
        t2=(TextView) findViewById(R.id.textView61);

        t1.setText("#include<stdio.h\n" +
                "#include<conio.h>\n" +
                "void main()" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,i,flage=0;\n" +
                "\tprintf(\"Enter a Number to check is it Prime = \");\n" +
                "\tscanf(\"%d\"&n);\n" +
                "\tfor(i=2;i<n;i++)\n" +
                "\t{\n" +
                "\t\tif(n%i==0)\n" +
                "\t\t{\n" +
                "\t\t\tflage=1;\n" +
                "\t\t}\n" +
                "\tif(flage==1)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Not Prime Number\",n);\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Prime Number\",n);\n" +
                "\t}\n" +
                "\tgetch()'\n" +
                "}");

        t2.setText("Enter a Number to check is it Prime = 17\n" +
                "17 is Prime Number");


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
