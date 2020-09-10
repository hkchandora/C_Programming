package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P78 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p78);

        b1=(Button) findViewById(R.id.button88);

        t1=(TextView) findViewById(R.id.textView160);
        t2=(TextView) findViewById(R.id.textView161);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "\nint check_anagram(char [], char []);\n" +
                "\n" +
                "void main()\n" +
                "{\n" +
                "  char a[100], b[100];\n" +
                "  int flag;\n" +
                "  printf(\"Enter first string\\n\");\n" +
                "  gets(a);\n" +
                "  printf(\"Enter second string\\n\");\n" +
                "  gets(b);\n" +
                "  flag = check_anagram(a, b);\n" +
                "  if (flag == 1)\n" +
                "  \tprintf(\"\\\"%s\\\" and \\\"%s\\\" are anagrams.\\n\", a, b);\n" +
                "  else\n" +
                "  \tprintf(\"\\\"%s\\\" and \\\"%s\\\" are not anagrams.\\n\", a, b);\n" +
                "  getch();\n" +
                "}\n" +
                "\n" +
                "int check_anagram(char a[], char b[])\n" +
                "{\n" +
                "  int first[26] = {0}, second[26] = {0}, c = 0;\n" +
                "  while (a[c] != '\\0')\n" +
                "  {\n" +
                "  \tfirst[a[c]-'a']++;\n" +
                "  \tc++;\n" +
                "  }\n" +
                "  c = 0;\n" +
                "  while (b[c] != '\\0')\n" +
                "  {\n" +
                "  \tsecond[b[c]-'a']++;\n" +
                "  \tc++;\n" +
                "  }\n" +
                "  for (c = 0; c < 26; c++)\n" +
                "  {\n" +
                "  \tif (first[c] != second[c])\n" +
                "  \t\treturn 0;\n" +
                "  }\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter first string\n" +
                "creative\n" +
                "Enter second string\n" +
                "reactive\n" +
                "\"creative\" and \"reactive\" are anagrams.");

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
