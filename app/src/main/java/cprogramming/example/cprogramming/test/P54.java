package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P54 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p54);

        b1=(Button) findViewById(R.id.button64);

        t1=(TextView) findViewById(R.id.textView112);
        t2=(TextView) findViewById(R.id.textView113);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a[100],b[100],c[100],i;\n" +
                "\tprintf(\"Enter 5 elements of 1st Array =\\n\");\n" +
                "\tfor(i=0;i<5;i++)\n" +
                "\t{\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\t}\n" +
                "\tprintf(\"Enter 5 elements of 2nd Array =\\n\");\n" +
                "\tfor(i=0;i<5;i++)\n" +
                "\t{\n" +
                "\t\tscanf(\"%d\",&b[i]);\n" +
                "\t}\n" +
                "\tfor(i=0;i<10;i++)\n" +
                "\t{\n" +
                "\t\tc[i] = a[i];\n" +
                "\t\tc[i+5] = b[i];\n" +
                "\t}\n" +
                "\tprintf(\"Merge Array =\\n\");\n" +
                "\tfor(i=0;i<10;i++)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d\",c[i]);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter 5 elements of 1st Array =\n" +
                "1 2 3 4 5\n" +
                "Enter 5 elements of 2nd Array =\n" +
                "6 7 8 9 10\n" +
                "Merge Array =\n" +
                "1 2 3 4 5 6 7 8 9 10");


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
