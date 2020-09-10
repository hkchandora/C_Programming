package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;

public class P68 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p68);

        b1=(Button) findViewById(R.id.button78);

        t1=(TextView) findViewById(R.id.textView140);
        t2=(TextView) findViewById(R.id.textView141);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<string.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tchar a[100], b[100];\n" +
                "\tprintf(\"Enter the first string\\n\");\n" +
                "\tgets(a);\n" +
                "\tprintf(\"Enter the second string\\n\");\n" +
                "\tgets(b);\n" +
                "\tstrcat(a,b);\n" +
                "\tprintf(\"String obtained on concatenation is %s\\n\",a);\n" +
                "getch();\n" +
                "}\n");

        t2.setText("Enter the first string\nHello\nEnter the second string\nGuyzz\nString obtained on concatenation is Hello Guyzz");

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
