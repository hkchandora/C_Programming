package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P93 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p93);

        b1=(Button) findViewById(R.id.button103);

        t1=(TextView) findViewById(R.id.textView190);
        t2=(TextView) findViewById(R.id.textView191);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>" +
                "struct complex\n" +
                "{\n" +
                "  int real, img;\n" +
                "};\n" +
                "void main()\n" +
                "{\n" +
                "  struct complex a, b, c;\n" +
                "  printf(\"Enter a and b where a + ib is the first complex number.\\n\");\n" +
                "  printf(\"a = \");\n" +
                "  scanf(\"%d\", &a.real);\n" +
                "  printf(\"b = \");\n" +
                "  scanf(\"%d\", &a.img);\n" +
                "  printf(\"Enter c and d where c + id is the second complex number.\\n\");\n" +
                "  printf(\"c = \");\n" +
                "  scanf(\"%d\", &b.real);\n" +
                "  printf(\"d = \");\n" +
                "  c.real = a.real + b.real;\n" +
                "  c.img = a.img + b.img;\n" +
                "  if ( c.img >= 0 )\n" +
                "  {\n" +
                "  \tprintf(\"Sum of two complex numbers = %d + %di\\n\",c.real,c.img);\n" +
                "  }\n" +
                "  else\n" +
                "  {\n" +
                "  \tprintf(\"Sum of two complex numbers = %d - %di\\n\",c.real,c.img);\n" +
                "  }\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter a and b where a + ib is the first complex number.\n" +
                "a = 3\nb = 54\n" +
                "Enter c and d where c + id is the second complex number.\n" +
                "c = 4\nd = 63\n" +
                "Sum of two complex numbers = 7 + 177i");

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
