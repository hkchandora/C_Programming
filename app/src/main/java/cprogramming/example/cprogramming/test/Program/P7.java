package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P7 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p7);

        b1=(Button) findViewById(R.id.button17);

        t1=(TextView) findViewById(R.id.textView18);
        t2=(TextView) findViewById(R.id.textView19);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,i,value,sum=0;\n" +
                "\tprintf(\"Enter a integer number, you want to add = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                        "\tprintf(\"Enter %d integers\",n)\n" +
                        "\tfor(i=0;i<n;i++)\n" +
                        "\t{\n" +
                "\t\tscanf(\"%d\",&value);\n" +
                        "\t\tsum=sum+value;\n" +
                        "\t}\n" +
                        "\tprintf(\"Sum of entered integers = %d\",sum);\n" +
                        "\tgetch();\n" +
                        "}");
        t2.setText("Enter a integer number, you want to add = \n5\nEnter 5 intergers\n1\n2\n3\n4\n5\nSum of entered integer = 15");

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
