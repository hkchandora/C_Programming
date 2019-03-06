package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P70 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p70);

        b1=(Button) findViewById(R.id.button80);

        t1=(TextView) findViewById(R.id.textView144);
        t2=(TextView) findViewById(R.id.textView145);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<string.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tchar a[100], b[100];\n" +
                "\tprintf(\"Enter the string to check if it is a palindrome\\n\");\n" +
                "\tgets(a);\n" +
                "\tstrcpy(b,a);\n" +
                "\tstrrev(b);\n" +
                "\tif( strcmp(a,b) == 0 )\n" +
                "\t{\n\t\tprintf(\"Entered string is a palindrome.\\n\");\n" +
                "\t}\n\telse\n" +
                "\t{\n\t\tprintf(\"Entered string is not a palindrome.\\n\");\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the string to check if it is a palindrome\nwow\nEntered string is a palindrome.");

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
