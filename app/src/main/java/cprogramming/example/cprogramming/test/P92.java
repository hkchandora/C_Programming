package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P92 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p92);

        b1=(Button) findViewById(R.id.button102);

        t1=(TextView) findViewById(R.id.textView188);
        t2=(TextView) findViewById(R.id.textView189);

        t1.setText("\n" +
                "#include<stdio.h>\n" +
                "void call_by_reference(int *y)\n " +
                "{\n" +
                "\tprintf(\"Inside call_by_reference y = %d before adding 10.\\n\", *y);\n" +
                "\t(*y) += 10;\n" +
                "\tprintf(\"Inside call_by_reference y = %d after adding 10.\\n\", *y);\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "\tint b=10;\n" +
                "\tprintf(\"b = %d before function call_by_reference.\\n\", b);\n" +
                "\tcall_by_reference(&b);\n" +
                "\tprintf(\"b = %d after function call_by_reference.\\n\", b);\n" +
                "\treturn 0;\n" +
                "}\n");

        t2.setText("b = 10 before function call_by_reference.\n" +
                "Inside call_by_reference y = 10 before adding 10.\n" +
                "Inside call_by_reference y = 20 after adding 10.\n" +
                "b = 20 after function call_by_reference.");

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
