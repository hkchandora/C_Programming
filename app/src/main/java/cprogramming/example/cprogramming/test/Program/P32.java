package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P32 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p32);

        b1=(Button) findViewById(R.id.button42);

        t1=(TextView) findViewById(R.id.textView68);
        t2=(TextView) findViewById(R.id.textView69);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "clrscr();\n" +
                "\tint t;\n" +
                "\tfloat value,f,c;\n" +
                "\tprintf(\"Enter no of Unit to convert to\\n" +
                "1) Celcius to Farenheit\\n" +
                "2) Farenheit to Celcius\");\n" +
                "\tscanf(\"%d\",&t);\n" +
                "\tprintf(\"Enter The Value to convert = \");\n" +
                "\tscanf(\"%f\",&value);\n" +
                "\tswitch(t)\n" +
                "\t{\n" +
                "\t\tcase 1:\n" +
                "\t\tf = (value*(9/5))+32;\n" +
                "\t\tprintf(\"%d Celcius = %d Farenheit\",value,f);break;\n" +
                "\t\tcase 2:\n" +
                "\t\tc = ((value-32)*(5/9));\n" +
                "\t\tprintf(\"%d Farenheit = %d Celcius\",value,c);break;\n" +
                "\t\tdefault:break;\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("'Enter no of Unit to convert to\n" +
                "1) Celcius to Farenheit\n" +
                "2) Farenheit to Celcius\n" +
                "1\n" +
                "Enter The Value to convert = 40\n" +
                "40 Celcius = 130.999992 Farenheit");


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
