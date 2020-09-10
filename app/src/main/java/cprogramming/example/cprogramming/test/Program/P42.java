package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P42 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p42);

        b1=(Button) findViewById(R.id.button52);

        t1=(TextView) findViewById(R.id.textView88);
        t2=(TextView) findViewById(R.id.textView89);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\nvoid main()" +
                "{\n" +
                "\tint n,i,c;\n" +
                "\tprintf(\"Enter The No of Rows = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\tfor(c=0;c<=(n-i-2);c+++)\n" +
                "\t\tprintf(\" \");\n" +
                "\t\tfor(c=0;c<=i;c++)\n" +
                "\t\tprintf(\"%d\",factorial(i)/(factorial(c)*factorial(i-c)));\n" +
                "\t\tprintf(\"\\n" +
                "\");\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}\n" +
                "int factorial(int n)\n" +
                "{\n" +
                "\tint c;\n" +
                "\tlong result=1;\n" +
                "\tfor(c=1;c<=n;c++)\n" +
                "\t\tresult = result*c;\n" +
                "\treturn(result);\n" +
                "}");
        t2.setText("Enter The No of Rows = 3\n" +
                "   1\n" +
                "  1 1\n" +
                " 1 2 1");


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
