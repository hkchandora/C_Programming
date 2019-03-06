package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P69 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p69);

        b1=(Button) findViewById(R.id.button79);

        t1=(TextView) findViewById(R.id.textView142);
        t2=(TextView) findViewById(R.id.textView143);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<string.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tchar arr[100];\n" +
                "\tprintf(\"Enter a string to reverse\\n\");\n" +
                "\tgets(arr);\n" +
                "\tstrrev(arr);\n" +
                "\tprintf(\"Reverse of entered string is \\n%s\\n\",arr);\n" +
                "getch();\n" +
                "}");

        t2.setText("Enter a string to reverse\nHow's doing?\nReverse of entered string is\n?gniod s'woh");

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
