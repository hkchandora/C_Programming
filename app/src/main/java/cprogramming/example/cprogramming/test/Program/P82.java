package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P82 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p82);

        b1=(Button) findViewById(R.id.button92);

        t1=(TextView) findViewById(R.id.textView168);
        t2=(TextView) findViewById(R.id.textView169);

        t1.setText("#include < stdio.h > \n" +
                "#include<conio.h>\n" +
                "int string_ln(char*);\n" +
                "\n" +
                "void main()\n" +
                "{\n" +
                "  char str[20];\n" +
                "  int length;\n" +
                "  printf(\"\\nEnter any string : \");\n" +
                "  gets(str);\n" +
                "  length = string_ln(str);\n" +
                "  printf(\"The length of the given string %s is : %d\", str, length);\n" +
                "  getch();\n" +
                "}\n" +
                "\n" +
                "int string_ln(char*p) /p=&str[0]/\n" +
                "{\n" +
                "  int count = 0;\n" +
                "  while (*p != '\\0')\n" +
                "  {\n" +
                "  \tcount++;\n" +
                "  \tp++;\n" +
                "  }\n" +
                "  return count;\n" +
                "}\n");

        t2.setText("Enter any string : C Programming\n" +
                "The length of the given string C Programming is : 13");

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
