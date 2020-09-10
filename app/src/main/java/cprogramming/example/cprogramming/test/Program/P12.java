package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P12 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p12);

        b1=(Button) findViewById(R.id.button22);

        t1=(TextView) findViewById(R.id.textView28);
        t2=(TextView) findViewById(R.id.textView29);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                        "\tint m1,m2,m3,m4,m5,sum,total=500;\n" +
                        "\tfloat per;\n" +
                        "\tprintf(\"Enter The Marks of Students = \");\n" +
                        "\tscanf(\"%d%d%d%d%d\",&m1,&m2,&m3,&m4,&m5);\n" +
                        "\tsum=s1+s2+s3+s4+s5;\n" +
                        "\tprintf(\"Sum is = \",sum);\n" +
                        "\tper=(sum*100)/total;\n" +
                        "\tprintf(\"Percentage is = %f%\",per);\n" +
                        "\tgetch();\n" +
                        "}");

        t2.setText("Enter The Marks of Students = \n85\n96\n90\n83\n87\nSum is = 441\nPersentage is = 88.2%");

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
