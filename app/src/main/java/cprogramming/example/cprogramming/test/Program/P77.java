package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;

public class P77 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p77);

        b1=(Button) findViewById(R.id.button87);

        t1=(TextView) findViewById(R.id.textView158);
        t2=(TextView) findViewById(R.id.textView159);

        t1.setText("#include<stdio.h>\n" +
                "#include<string.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "  clrscr();" +
                "  char string[100];\n" +
                "  int c = 0, count[26] = {0};\n" +
                "  printf(\"Enter a string\\n\");\n" +
                "  gets(string);\n" +
                "  while ( string[c] != '\\0' )\n" +
                "  {\n" +
                "  if ( string[c]>='a' && string[c]   count[string[c]-'a']++;\n" +
                "  c++;\n" +
                "  }\n" +
                "  for ( c = 0 ; c < 26 ; c++ )\n" +
                "  {\n" +
                "  \tif( count[c] != 0 )\n" +
                "  \tprintf(\"%c occurs %d times in the entered string.\\n\",c+'a',count[c]);\n" +
                "  }\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter a string\n" +
                "C Programming\n" +
                "a occurs 1 times in the entered string." +
                "\nb occurs 0 times in the entered string." +
                "\nc occurs 1 times in the entered string." +
                "\nd occurs 0 times in the entered string." +
                "\ne occurs 0 times in the entered string." +
                "\nf occurs 0 times in the entered string." +
                "\ng occurs 2 times in the entered string." +
                "\nh occurs 0 times in the entered string." +
                "\ni occurs 1 times in the entered string." +
                "\nj occurs 0 times in the entered string." +
                "\nk occurs 0 times in the entered string." +
                "\nl occurs 0 times in the entered string." +
                "\nm occurs 2 times in the entered string." +
                "\nn occurs 1 times in the entered string." +
                "\no occurs 1 times in the entered string." +
                "\np occurs 1 times in the entered string." +
                "\nq occurs 0 times in the entered string." +
                "\nr occurs 2 times in the entered string." +
                "\ns occurs 0 times in the entered string." +
                "\nt occurs 0 times in the entered string." +
                "\nu occurs 0 times in the entered string." +
                "\nv occurs 0 times in the entered string." +
                "\nw occurs 0 times in the entered string." +
                "\nx occurs 0 times in the entered string." +
                "\ny occurs 0 times in the entered string." +
                "\nz occurs 0 times in the entered string.");

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
