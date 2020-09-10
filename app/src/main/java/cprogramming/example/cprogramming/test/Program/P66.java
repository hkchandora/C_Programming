package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P66 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p66);

        b1=(Button) findViewById(R.id.button76);

        t1=(TextView) findViewById(R.id.textView136);
        t2=(TextView) findViewById(R.id.textView137);

        t1.setText("#include <stdio.h>\n" +
                "#include <conio.h>\n" +
                "#include<string.h>" +
                "\n" +
                "void main()\n" +
                "{\n" +
                "\tchar a[100],b[100];\n" +
                "\tprintf(\"Enter the first string\\n\");\n" +
                "\tgets(a);\n" +
                "\tprintf(\"Enter the second string\\n\");\n" +
                "\tgets(b);\n" +
                "\tif(strcmp(a,b) == 0)\n" +
                "\t{\n\t\tprintf(\"Entered strings are equal.\\n\");\n" +
                "\t}\n\telse\n" +
                "\t{\n\t\tprintf(\"Entered strings are not equal.\\n\");\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the first string \nHello\nEnter the second string\nhello\nEntered strings are not equal.");

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
