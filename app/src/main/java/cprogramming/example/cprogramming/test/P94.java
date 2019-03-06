package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P94 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p94);

        b1=(Button) findViewById(R.id.button104);

        t1=(TextView) findViewById(R.id.textView192);
        t2=(TextView) findViewById(R.id.textView193);

        t1.setText("#include<stdio.h>\n" +
                "void main()\n" +
                "{\n" +
                "  int a, b;\n" +
                "  printf(\"\\nEnter value for a & b : \");\n" +
                "  scanf(\"%d %d\", &a, &b);\n" +
                "  a = a + b;\n" +
                "  b = a - b;\n" +
                "  a = a - b;\n" +
                "  printf(\"\\nAfter swapping value of a : %d\", a);\n" +
                "  printf(\"\\nAfter swapping value of b : %d\", b);\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter value for num1 & num2 : \n" +
                "10\n" +
                "12\n" +
                "After swapping value of a : 12\n" +
                "After swapping value of b : 10");

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
