package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P11 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p11);

        b1=(Button) findViewById(R.id.button21);

        t1=(TextView) findViewById(R.id.textView26);
        t2=(TextView) findViewById(R.id.textView27);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a;\n" +
                "\tprintf(\"Enter a number = \");\n" +
                "\tscanf(\"%d\",&a);\n" +
                "\tif(a>0)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Positive.\",a);\n" +
                "\t}\n" +
                "\telse if(a<0)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Negative\",b);\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is Zero\",c);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter a number = \n-72\n-72 is Negative");

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
