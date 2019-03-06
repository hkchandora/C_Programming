package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P5 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);

        b1=(Button) findViewById(R.id.button15);

        t1=(TextView) findViewById(R.id.textView14);
        t2=(TextView) findViewById(R.id.textView15);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n;\n" +
                "\tprintf(\"Enter a number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tif(n%2==0)\n" +
                        "\t{\n" +
                        "\t\tprintf(\"%d is Even number\",n);\n" +
                        "\t}\n" +
                        "\telse\n" +
                        "\t{\n" +
                        "\t\tprintf(\"%d is Odd number\",n);\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}");
        t2.setText("Enter a number = 68\n68 is Even number");

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
