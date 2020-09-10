package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P46 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p46);

        b1=(Button) findViewById(R.id.button56);

        t1=(TextView) findViewById(R.id.textView96);
        t2=(TextView) findViewById(R.id.textView97);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n"+
                "\tint n,binary,rem,base=1,decimal=0;\n"+
                "\tprintf(\"Enter A Binary Number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tbinary = n;\n" +
                "\twhile(n>0)\n" +
                "\t{\n"+
                "\t\trem = n%10\n"+
                "\t\tdecimal = decimal+rem*base;\n"  +
                "\t\tn = n/10;\n"  +
                "\t\tbase = base*2;\n"  +
                "\t}\n" +
                "\tprintf(\"Input Number is = %d\",binary);\n" +
                "\tprintf(\"It's decimal equivalent is = %d\",decimal);\n"+
                "\tgetch();\n"  +
                "}");

        t2.setText("Enter A Binary Number = 1011\n" +
                "Input Number is = 1011\n" +
                "It's decimal equivalent is = 11");

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
