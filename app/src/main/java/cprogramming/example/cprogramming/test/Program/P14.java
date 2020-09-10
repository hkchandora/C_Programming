package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P14 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p14);

        b1=(Button) findViewById(R.id.button24);

        t1=(TextView) findViewById(R.id.textView32);
        t2=(TextView) findViewById(R.id.textView33);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint amount,rate,time,ans;\n" +
                "\tprintf(\"Enter Principal Amount = \");\n" +
                "\tscanf(\"%d\",&amount);\n" +
                "\tprintf(\"Enter Rate of Interest = \");\n" +
                "\tscanf(\"%d\",&rate);\n" +
                "\tprintf(\"Enter Period of Time = \",&time);\n" +
                "\tans = (amount*rate*time)/100;\n" +
                "\tprintf(\"Simple Interest is = %d\",ans);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter Principal Amount = 25000\n" +
                "Enter Rate of Interest = 10\n" +
                "Enter Period of Time = 2\n" +
                "Simple Interest is = 5000");

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
