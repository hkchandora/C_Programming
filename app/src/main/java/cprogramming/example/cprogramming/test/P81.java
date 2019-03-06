package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class P81 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p81);

        b1=(Button) findViewById(R.id.button91);

        t1=(TextView) findViewById(R.id.textView166);
        t2=(TextView) findViewById(R.id.textView167);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "  int numArray[10];\n" +
                "  int i, sum = 0;\n" +
                "  int *ptr;\n" +
                "  printf(\"\\nEnter 5 elements : \");\n" +
                "  for (i = 0; i < 5; i++)\n" +
                "  {\n" +
                "  \tscanf(\"%d\", &numArray[i]);\n" +
                "  \tptr = numArray; /*a=&a[0] */\n" +
                "  }\n" +
                "  for (i = 0; i < 5; i++)\n" +
                "  {\n" +
                "  \tsum = sum + *ptr;\n" +
                "  \tptr++;\n" +
                "  }\n" +
                "  printf(\"The sum of array elements : %d\", sum);\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter 5 elements :\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "The sum of array elements : 15");

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
