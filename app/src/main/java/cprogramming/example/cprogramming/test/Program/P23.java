package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P23 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p23);

        b1=(Button) findViewById(R.id.button33);

        t1=(TextView) findViewById(R.id.textView50);
        t2=(TextView) findViewById(R.id.textView51);

        t1.setText("#include < stdio.h >\n" +
                "#include<conio.h>" +
                "long gcd(long, long);\n" +
                "int main() {\n" +
                "  long x, y, hcf, lcm;\n" +
                "  printf(\"Enter two integers\\n\");\n" +
                "  scanf(\"%ld%ld\", &x, &y);\n" +
                "  hcf = gcd(x, y);\n" +
                "  lcm = (x*y)/hcf;\n" +
                "  printf(\"Greatest common divisor of %ld and %ld = %ld\\n\", x, y, hcf);\n" +
                "  printf(\"Least common multiple of %ld and %ld = %ld\\n\", x, y, lcm);\n" +
                "  return 0;\n" +
                "}\n"+
                "long gcd(long x, long y)\n" +
                "{\n" +
                "  if (x == 0)\n" +
                "  {\n" +
                "  return y;\n" +
                "  }\n" +
                "  while (y != 0)\n" +
                "  {\n" +
                "    if (x > y)\n" +
                "    {\n" +
                "      x = x - y;\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "      y = y - x;\n" +
                "    }\n" +
                "  }\n" +
                "  return x;\n" +
                "}");

        t2.setText("Enter two integers:\n" +
                "9\n" +
                "24\n" +
                "Greatest common divisor of 9 and 24 = 3\n" +
                "Least common multiple of 9 and 24 = 72");

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
