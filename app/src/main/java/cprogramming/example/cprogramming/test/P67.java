package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P67 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p67);

        b1=(Button) findViewById(R.id.button77);

        t1=(TextView) findViewById(R.id.textView138);
        t2=(TextView) findViewById(R.id.textView139);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include <string.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tchar source[] = \"C program\";\n" +
                "\tchar destination[50];\n"+
                "\tstrcpy(destination, source);\n" +
                "\tprintf(\"Source string: %s\\n\", source);\n" +
                "\tprintf(\"Destination string: %s\\n\", destination);\n" +
                "\tgetch();\n" +
                "}\n");

        t2.setText("Source string: C Program\nDestination string: C Program");


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
