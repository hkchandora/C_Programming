package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P10 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p10);

        b1= (Button) findViewById(R.id.button20);

        t1= (TextView) findViewById(R.id.textView24);
        t2= (TextView) findViewById(R.id.textView25);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a,b,temp;\n" +
                "\tprintf(\"Enter the two numbers = \");\n" +
                "\tscanf(\"%d%d\",&a,&b);\n" +
                "\tprintf(\"Before Swapping a=%d and b=%d\",a,b);\n" +
                "\ttemp=a;\n" +
                "\ta=b;\n" +
                "\tb=temp;\n" +
                "\tprintf(\"After Swapping a=%d and b=%d\",a,b);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the two numbers = \n24\n65\nBefore Swapping a=24 and b=65\nAfter Swapping a=65 and b=24");

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
