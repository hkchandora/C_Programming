package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P43 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p43);

        b1=(Button) findViewById(R.id.button53);

        t1=(TextView) findViewById(R.id.textView90);
        t2=(TextView) findViewById(R.id.textView91);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\nvoid main()" +
                "{\n" +
                "\tint n,i,k;\n" +
                "\tprintf(\"Enter a no in Decimal no System = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                        "\tprintf(\"%d in Binary no system is = \\n" +
                        "\");\n" +
                        "\tfor(i=31;i>=0;i--)\n" +
                        "\t{\n" +
                        "\t\tk = n>>i;\n" +
                        "\t\tif(k&1)\n" +
                        "\t\t\tprintf(\"1\");\n" +
                        "\t\telse\n" +
                        "\t\t\tprintf(\"0\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}");

        t2.setText("Enter a no in Decimal no System = 100\n" +
                "100 in Binary no system is = \n" +
                "00000000000000000000000001100100");

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
