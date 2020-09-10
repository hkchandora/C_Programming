package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;

public class P26 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p26);

        b1=(Button) findViewById(R.id.button36);

        t1=(TextView) findViewById(R.id.textView56);
        t2=(TextView) findViewById(R.id.textView57);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h1.\n" +
                "void main()\n" +
                "{\n" +
                "\tint n,a[10],i;\n" +
                "\tprintf(\"Enter no of digits in your number = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"Enter no = \");\n" +
                "\tfor(1=0;1<n;i++)\n" +
                "\t{\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\t}\n" +
                "\tprintf(\"Reverse no is = \");\n" +
                "\tfor(i=n-1;i>0;i--)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d\",a[i]);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter no of digits in your number = 3\n" +
                "11\n" +
                "22\n" +
                "33\n" +
                "Reverse no is = \n" +
                "33\n" +
                "22\n" +
                "11");


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
