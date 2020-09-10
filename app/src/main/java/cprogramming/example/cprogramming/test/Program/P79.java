package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P79 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p79);

        b1=(Button) findViewById(R.id.button89);

        t1=(TextView) findViewById(R.id.textView162);
        t2=(TextView) findViewById(R.id.textView163);

        t1.setText("#include < stdio.h >\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "  clrscr();\n" +
                "  int first, second, *p, *q, sum;\n" +
                "  printf(\"Enter two integers to add\\n\");\n" +
                "  scanf(\"%d%d\", &first, &second);\n" +
                "  p = &first;\n" +
                "  /storing address of first in p/\n" +
                "  q = &second;\n" +
                "  /storing address of second in q/\n" +
                "  sum = *p + *q;\n" +
                "  /adding contents of address stored in p & q/\n" +
                "  printf(\"Sum of entered numbers = %d\\n\",sum);\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter two integers to add\n5\n7\nSum of entered numbers = 12");

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
