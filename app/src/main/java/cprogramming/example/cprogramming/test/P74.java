package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P74 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p74);

        b1=(Button) findViewById(R.id.button84);

        t1=(TextView) findViewById(R.id.textView152);
        t2=(TextView) findViewById(R.id.textView153);

        t1.setText("#include <stdio.h>\n" +
                "#include<conio.h>" +
                "#include<stdlib.h>\n" +
                "#include<string.h>\n" +
                "\n" +
                "void sort_string(char*);\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "  char string[100];\n" +
                "  printf(\"Enter some text\\n\");\n" +
                "  gets(string);\n" +
                "  sort_string(string);\n" +
                "  printf(\"%s\\n\", string);\n" +
                "  return 0;\n" +
                "}\n" +
                "\n" +
                "void sort_string(char *s)\n" +
                "{\n" +
                "  int c, d = 0, length;\n" +
                "  char *pointer, *result, ch;\n" +
                "  length = strlen(s);\n" +
                "  result = (char*)malloc(length+1);\n" +
                "  pointer = s;\n" +
                "  for ( ch = 'a' ; ch < = 'z' ; ch++ )\n" +
                "  {\n" +
                "  \tfor ( c = 0 ; c < length ; c++ )\n" +
                "  \t{\n" +
                "  \t\tif ( *pointer == ch )\n" +
                "  \t\t{\n" +
                "    \t\t*(result+d) = *pointer;\n" +
                "    \t\td++;\n" +
                "  \t\t}\n" +
                "  \t\tpointer++;\n" +
                "\t\t}\n" +
                "  \tpointer = s;\n" +
                "\t}\n" +
                "  *(result+d) = '\\0';\n" +
                "  strcpy(s, result);\n" +
                "  free(result);\n" +
                "}\n");

        t2.setText("Enter some text\ngame\naegm");

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
