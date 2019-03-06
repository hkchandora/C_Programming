package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P97 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p97);

        b1=(Button) findViewById(R.id.button107);

        t1=(TextView) findViewById(R.id.textView198);
        t2=(TextView) findViewById(R.id.textView199);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<dos.h>\n" +
                "void main()\n" +
                "{\n" +
                "  struct date d;\n" +
                "  getdate(&d);\n" +
                "  /storing date in structure d/\n" +
                "  printf(\"Current system date is %d/%d/%d\",d.da_day,d.da_mon,d.da_year);\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Current system date is 28/01/2019");

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
