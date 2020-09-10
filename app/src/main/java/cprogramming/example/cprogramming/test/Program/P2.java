package cprogramming.example.cprogramming.test.Program;


import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P2 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Programs");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));


        b1=(Button) findViewById(R.id.button12);

        t1=(TextView) findViewById(R.id.textView8);
        t2=(TextView) findViewById(R.id.textView9);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n;\n" +
                "\tprintf(\"Enter an integer = \");\n" +
                "\tscanf(\"%d\",&n);" +
                "\n\tprintf(\"Value of Integer is = %d\",n);\n\tgetch();\n}");

        t2.setText("Enter an integer = 10\nValue of Integer is = 10");
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


