package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P91 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p91);

        b1=(Button) findViewById(R.id.button101);

        t1=(TextView) findViewById(R.id.textView186);
        t2=(TextView) findViewById(R.id.textView187);

        t1.setText("#include<stdio.h>\n" +
                "void call_by_value(int x)\n" +
                "{\n" +
                "\tprintf(\"Inside call_by_value x = %d before adding 10.\\n\", x);\n" +
                "\tx += 10;\n" +
                "\tprintf(\"Inside call_by_value x = %d after adding 10.\\n\", x);\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "\tint a=10;\n" +
                "\tprintf(\"a = %d before function call_by_value.\\n\", a);\n" +
                "\tcall_by_value(a);\n" +
                "\tprintf(\"a = %d after function call_by_value.\\n\", a);\n" +
                "\treturn 0;\n" +
                "}\n");

        t2.setText("a=10 before function call_by_value.\n" +
                "Inside call_by_value x = 10 before adding 10.\n" +
                "Inside call_by_value x =  after adding 10.\n" +
                "a = 10 after function call_by_value.");

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
