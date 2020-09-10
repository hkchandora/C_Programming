package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P36 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p36);


        b1=(Button) findViewById(R.id.button46);

        t1=(TextView) findViewById(R.id.textView76);
        t2=(TextView) findViewById(R.id.textView77);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "int fibonacci(int n)\n" +
                "{\n" +
                "\tif(n==0||n==1)\n" +
                "\t\treturn n;\n" +
                "\telse\n" +
                "\t\treturn (fibonacci(n-1)+fibonacci(n-2));\n" +
                "}\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,i,j=0;\n" +
                "\tprintf(\"Enter a number of terms =  \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"First %d terms of fibonacci series are = \",n);\n" +
                "\tfor(i=1;i<=n;i++)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d\\n\",fibonacci(j));\n" +
                "\t\tj++;\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter a number of terms =  4\n" +
                "First 4 terms of fibonacci series are = \n" +
                "0\n" +
                "1\n" +
                "1\n" +
                "2");

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
