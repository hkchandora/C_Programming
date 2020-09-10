package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P25 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p25);

        b1=(Button) findViewById(R.id.button35);

        t1=(TextView) findViewById(R.id.textView54);
        t2=(TextView) findViewById(R.id.textView55);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,rev=0;\n" +
                "\tprintf(\"Enter a number to reverse = \");\n" +
                "\tscanf(\"%d\",n);\n" +
                "\twhile(n!=0)\n" +
                "\t{\n" +
                "\t\trev = rev*10;\n" +
                "\t\trev = rev+n%10;\n" +
                "\t\tn=n/10;\n" +
                "\t}\n" +
                "\tprintf(\"Reverse of The Number is = %d\",rev);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter a number to reverse = 18311\n" +
                "Reverse of The Number is = 11381");

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
