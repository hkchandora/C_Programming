package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P73 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p73);

        b1=(Button) findViewById(R.id.button83);

        t1=(TextView) findViewById(R.id.textView150);
        t2=(TextView) findViewById(R.id.textView151);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<malloc.h>\n" +
                "char* substring(char*, int, int);\n" +
                "void main()\n" +
                "{\n" +
                "  char string[100], *pointer;\n" +
                "  int position, length;\n" +
                "  printf(\"Enter a string\\n\");\n" +
                "  gets(string);\n" +
                "  printf(\"Enter the position and length of substring\\n\");\n" +
                "  scanf(\"%d%d\",&position, &length);\n" +
                "  pointer = substring( string, position, length);\n" +
                "  printf(\"Required substring is \\\"%s\\\"\\n\", pointer);\n" +
                "  free(pointer);\n" +
                "  getch();\n" +
                "}\n" +
                "\n" +
                "char *substring(char *string, int position, int length)\n" +
                "{\n" +
                "  char *pointer;\n" +
                "  int c;\n" +
                "  pointer = malloc(length+1);\n" +
                "  if (pointer == NULL)\n" +
                "  {\n" +
                "  \tprintf(\"Unable to allocate memory.\\n\");\n" +
                "  \texit(EXIT_FAILURE);\n" +
                "  }\n" +
                "  for (c = 0 ; c < position -1 ; c++)\n" +
                "  {\n\t\tstring++;\n\t}\n" +
                "  for (c = 0 ; c < length ; c++)\n" +
                "  {\n\t\t*(pointer+c) = *string;\n" +
                "  string++;\n\t}\n" +
                "}" +
                "\n" +
                "*(pointer+c) = '\\0';\n" +
                "return pointer;\n" +
                "}\n");

        t2.setText("Enter the position and length of substring\n" +
                "C Programming\n" +
                "Enter the position and length of string\n" +
                "3\n" +
                "11\n" +
                "Required substrings is = Programming");

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
