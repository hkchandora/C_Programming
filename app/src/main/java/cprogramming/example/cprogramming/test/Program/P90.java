package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P90 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p90);

        b1=(Button) findViewById(R.id.button100);

        t1=(TextView) findViewById(R.id.textView184);
        t2=(TextView) findViewById(R.id.textView185);

        t1.setText("#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "int main()\n" +
                "{\n" +
                "  int c, n;\n" +
                "  printf(\"Ten random numbers in 1 to 100\\n\");\n" +
                "  for (c = 1; c < = 10; c++)\n" +
                "  {\n" +
                "  \tn = rand()%100 + 1;\n" +
                "  \tprintf(\"%d\\n\", n);\n" +
                "  }\n" +
                "  return 0;\n" +
                "}\n");

        t2.setText("Ten random no in [1,100]\n" +
                "27\n" +
                "49\n" +
                "54\n" +
                "78\n" +
                "65\n" +
                "34\n" +
                "15\n" +
                "68\n" +
                "42\n" +
                "82");

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
