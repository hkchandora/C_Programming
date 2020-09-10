package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P39 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p39);


        b1=(Button) findViewById(R.id.button49);

        t1=(TextView) findViewById(R.id.textView82);
        t2=(TextView) findViewById(R.id.textView83);

        t1.setText("#inclide<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,i,j;\n" +
                "\tprintf(\"Enter The no of row to be print Pattern = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\tfor(j=0;j<i;j++)\n" +
                "\t\t{\n" +
                "\t\t\tprintf(\"*\\t\");\n" +
                "\t\t}\n" +
                "\t\tprintf(\"\\n" +
                "\");\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter The no of row to be print Pattern = 5\n" +
                "*\n" +
                "* *\n" +
                "* * *\n" +
                "* * * *\n" +
                "* * * * *");

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
