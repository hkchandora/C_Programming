package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P4 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4);


        b1=(Button) findViewById(R.id.button14);

        t1=(TextView) findViewById(R.id.textView12);
        t2=(TextView) findViewById(R.id.textView13);

        t1.setText("#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main()\n" +
                        "{\n" +
                        "\tclrscr();\n" +
                        "\tint height,base;\n" +
                        "\tfloat area;\n" +
                "\tprintf(\"Enter height and base of triangle = \");\n" +
                        "\tscanf(\"%d%d\",&height,&base);\n" +
                        "\tarea = 0.5*height*base;\n" +
                        "\tprintf(\"Area of Triangle is = %f\",area);\n" +
                        "\tgetch();\n" +
                        "}");
        t2.setText("Enter height and base of triangle = \n12\n4.5\nArea of Triangle is = 27");

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
