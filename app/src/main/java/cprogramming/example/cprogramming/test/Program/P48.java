package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P48 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p48);

        b1=(Button) findViewById(R.id.button58);

        t1=(TextView) findViewById(R.id.textView100);
        t2=(TextView) findViewById(R.id.textView101);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n"+
                "\tint n,rem,base=1,hexadecimal=0;\n"+
                "\tprintf(\"Enter A Binary Number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\twhile(n!=0)\n" +
                "\t{\n"+
                "\t\trem = n%10\n"+
                "\t\thexadecimal = hexadecimal+rem*base;\n"  +
                "\t\tbase = base*2;\n"  +
                "\t\tn = n/10;\n"  +
                "\t}\n" +
                "\tprintf(\"Input Number is = %d\",n);\n" +
                "\tprintf(\"It's Hexadecimal equivalent is = %d\",hexadecimal);\n"+
                "\tgetch();\n"  +
                "}");

        t2.setText("Enter A Binary Number = 10101\n" +
                "Input Number is = 10101\n" +
                "It's Hexadecimal equivalent is = 15");

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
