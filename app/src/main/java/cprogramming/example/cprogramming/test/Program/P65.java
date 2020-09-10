package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P65 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p65);

        b1=(Button) findViewById(R.id.button75);

        t1=(TextView) findViewById(R.id.textView134);
        t2=(TextView) findViewById(R.id.textView135);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n\n int len\n" +
                "\tchar a[100];\n" +
                "\tprintf(\"Enter a string =\");\n" +
                "\tscanf(\"%s\",a);\n\tlen = strlen(a);\n" +
                "\tprintf(\"Length of string is = %d \",len);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter string = \nCProgramming\nLength of string is = 12");

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
