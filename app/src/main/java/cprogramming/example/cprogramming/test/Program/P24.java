package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P24 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p24);

        b1=(Button) findViewById(R.id.button34);

        t1=(TextView) findViewById(R.id.textView52);
        t2=(TextView) findViewById(R.id.textView53);

        t1.setText("#include < stdio.h >\n" +
                "#include<conio.h>" +
                "long factorial(int);\n" +
                "long find_ncr(int, int);\n" +
                "long find_npr(int, int);\n" +
                "main()\n" +
                "{\n" +
                "  int n, r;\n" +
                "  long ncr, npr;\n" +
                "  printf(\"Enter the value of n and r\\n\");\n" +
                "  scanf(\"%d%d\",&n,&r);\n" +
                "  ncr = find_ncr(n, r);\n" +
                "  npr = find_npr(n, r);\n" +
                "  printf(\"%dC%d = %ld\\n\", n, r, ncr);\n" +
                "  printf(\"%dP%d = %ld\\n\", n, r, npr);\n" +
                "  return 0;\n" +
                "}\n" +
                "long find_ncr(int n, int r)\n" +
                "{\n" +
                "  long result;\n" +
                "  result = factorial(n)/(factorial(r)*factorial(n-r));\n" +
                "  return result;\n" +
                "}\n" +
                "long find_npr(int n, int r)\n" +
                "{\n" +
                "  long result;\n" +
                "  result = factorial(n)/factorial(n-r);\n" +
                "  return result;\n" +
                "} \n" +
                "long factorial(int n)\n" +
                "{\n" +
                "  int c;\n" +
                "  long result = 1;\n" +
                "  for( c = 1 ; c < = n ; c++ )\n" +
                "  result = result*c;\n" +
                "  return ( result );\n" +
                "}\n");

        t2.setText("Enter the value of n and r\n" +
                "5\n" +
                "2\n" +
                "5C2 = 10\n" +
                "5P2 = 20");

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
