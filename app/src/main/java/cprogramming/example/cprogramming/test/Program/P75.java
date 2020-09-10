package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P75 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p75);

        b1=(Button) findViewById(R.id.button85);

        t1=(TextView) findViewById(R.id.textView154);
        t2=(TextView) findViewById(R.id.textView155);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "  char text[100], blank[100];\n" +
                "  int c = 0, d = 0;\n" +
                "  printf(\"Enter some text\\n\");\n" +
                "  gets(text);\n" +
                "  while (text[c] != '\\0')\n" +
                "\t{\n" +
                "  \tif (!(text[c] == ' ' && text[c+1] == ' '))\n" +
                "\t\t{\n" +
                "\t\t\tblank[d] = text[c];\n" +
                "\t\t\td++;\n" +
                "\t\t}\n" +
                "\t\tc++;\n" +
                "\t}\n" +
                "  blank[d] = '\\0';\n" +
                "  printf(\"Text after removing space\\n%s\\n\", blank);\n" +
                "  return 0;\n" +
                "}\n");

        t2.setText("Enter some text:\nC Programming is easy\nText after removing space\nCProgrammingiseasy");

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
