package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class P71 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p71);

        b1=(Button) findViewById(R.id.button81);

        t1=(TextView) findViewById(R.id.textView146);
        t2=(TextView) findViewById(R.id.textView147);

        t1.setText("Lower Case:-\n" +
                "#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<string.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tchar string[] = \"Strlwr in C\";\n" +
                "\tprintf(\"%s\\n\",strlwr(string));\n" +
                "getch();\n" +
                "}\n" +
                "\n" +
                "Upper Case:-\n" +
                "#include<stdio.h >\n" +
                "#include<conio.h>\n" +
                "#include<string.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tchar string[] = \"strupr in c\";\n" +
                "\tprintf(\"%s\\n\",strupr(string));\n" +
                "getch();\n" +
                "}");

        t2.setText("Lower Case\nstrlwr in c\n\nUpper Case\nSTRUPR IN C");

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
