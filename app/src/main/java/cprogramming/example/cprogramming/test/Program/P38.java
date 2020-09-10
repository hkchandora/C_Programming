package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P38 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p38);


        b1=(Button) findViewById(R.id.button48);

        t1=(TextView) findViewById(R.id.textView80);
        t2=(TextView) findViewById(R.id.textView81);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<math.h>\n" +
                "void main()\n" +
                "{\n" +
                "  int i, n ;\n" +
                "  float x, val, sum = 1, t = 1 ;\n" +
                "  printf(\"Enter the value for x : \") ;\n" +
                "  scanf(\"%f\", &x) ;\n" +
                "  printf(\"\\nEnter the value for n : \") ;\n" +
                "  scanf(\"%d\", &n) ;\n"+
                "  val = x ;\n" +
                "  x = x * 3.14159 / 180 ;\n" +
                "  for(i = 1 ; i < n + 1 ; i++)\n" +
                "  {\n" +
                "  \tt=t*pow((double)(-1),(double)(2*i-1))*x*x/(2*i*(2*i-1));\n" +
                "  \tsum = sum + t ;\n" +
                "  }\n" +
                "  printf(\"\\nCosine value of %f is : %8.4f\", val, sum) ;\n" +
                "}\n");

        t2.setText("Enter the value for x : 10\n"+
                "Enter the value for n : 5\n" +
                        "Cosine value of 10.000000 is : 0.9848");


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
