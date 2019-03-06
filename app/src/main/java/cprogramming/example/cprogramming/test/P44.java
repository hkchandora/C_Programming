package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P44 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p44);

        b1=(Button) findViewById(R.id.button54);

        t1=(TextView) findViewById(R.id.textView92);
        t2=(TextView) findViewById(R.id.textView93);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tint n,decimal,rem,base=1,binary=0;\n" +
                "\tprintf(\"Enter A Decimal Number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tdecimal = n;\n" +
                "\twhile(n>0)\n" +
                "\t{\n" +
                "\t\trem = n%2;\n" +
                "\t\t\tbinary= binary+rem*base;\n" +
                "\t\t\tn = n/2;\n" +
                "\t\t\tbase = base*10;\n" +
                "\t}\n" +
                "\tprintf(\"Input Number is = %d\",decimal);\n" +
                "\tprintf(\"It's Binary equivalent is = %d\",binary);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter A Decimal Number = 25\n" +
                "Input Number is = 25\n" +
                "It's Binary equivalent is = 11001");

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
