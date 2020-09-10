package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P8 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p8);

        b1= (Button) findViewById(R.id.button18);

        t1= (TextView) findViewById(R.id.textView20);
        t2= (TextView) findViewById(R.id.textView21);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,rem,sum=0;\n" +
                "\tprintf(\"Enter a number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\twhile(n!=0)\n" +
                        "\t{\n" +
                        "\t\trem = n%10;\n" +
                        "\t\tsum = sum+rem;\n" +
                        "\t\tn = n/10;\n" +
                        "\t}\n" +
                        "\tprintf(\"Sum of digit of number is = %d\",sum);\n" +
                        "\tgetch();\n" +
                        "}");

        t2.setText("Enter a number = 156\nSum of digit of number is = 12");

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
