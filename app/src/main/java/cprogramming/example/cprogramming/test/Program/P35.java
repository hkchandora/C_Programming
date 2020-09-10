package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P35 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p35);


        b1=(Button) findViewById(R.id.button45);

        t1=(TextView) findViewById(R.id.textView74);
        t2=(TextView) findViewById(R.id.textView75);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,i,a=0,b=1,c;\n" +
                "\tprintf(\"Enter The Numbers of Terms = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"%d\\n%d\\n\",a,b);\n" +
                "\tfor(i=2;i<n;i++)\n" +
                "\t{\n" +
                "\t\tc = a+b;\n" +
                "\t\ta = b;\n" +
                "\t\tb = c;\n" +
                "\tprintf(\"%d\\n\",c);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("'Enter The Numbers of Terms = 7\n" +
                "0\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "8");


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
