package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P72 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p72);

        b1=(Button) findViewById(R.id.button82);

        t1=(TextView) findViewById(R.id.textView148);
        t2=(TextView) findViewById(R.id.textView149);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<string.h>\n" +
                "int check_vowel(char);\n" +
                "void main()\n" +
                "{\n" +
                "\tchar s[100], t[100];\n" +
                "\tint i, j = 0;\n" +
                "\tprintf(\"Enter a string to delete vowels\\n\");\n" +
                "\tgets(s);\n" +
                "\tfor(i = 0; s[i] != '\\0'; i++)\n\t{\n" +
                "\t\tif(check_vowel(s[i]) == 0)\n\t\t{\n" +
                "\t\t\tt[j] = s[i];\n" +
                "\t\t\tj++;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tt[j] = '\\0';\n" +
                "\tstrcpy(s, t); \n" +
                "\tprintf(\"String after deleting vowels: %s\\n\", s);\n" +
                "\tgetch();;\n" +
                "}\n" +
                "int check_vowel(char c)\n" +
                "{\n" +
                "  switch(c) {\n" +
                "  case 'a':\n" +
                "  case 'A':\n" +
                "  case 'e':\n" +
                "  case 'E':\n" +
                "  case 'i':\n" +
                "  case 'I':\n" +
                "  case 'o':\n" +
                "  case 'O':\n" +
                "  case 'u':\n" +
                "  case 'U':\n" +
                "  return 1;\n" +
                "  default:\n" +
                "  return 0;\n" +
                "  }\n" +
                "}\n");

        t2.setText("Enter a string to delete vowels\nC Programming\nString after deleting vowels: C Prgrmmng");

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
