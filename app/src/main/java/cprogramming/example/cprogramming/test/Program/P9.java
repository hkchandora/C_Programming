package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P9 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p9);

        b1= (Button) findViewById(R.id.button19);

        t1= (TextView) findViewById(R.id.textView22);
        t2= (TextView) findViewById(R.id.textView23);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a,b,c;\n" +
                "\tprintf(\"Enter three integers = \");\n" +
                "\tscanf(\"%d%d%d\",&a,&b,&c);\n" +
                "\tif(a>b&&a>c)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is greatest.\",a);\n" +
                "\t}\n" +
                "\telse if(b>a&&b>c)\n" +
                        "\t{\n" +
                        "\t\tprintf(\"%d is greatest\",b);\n" +
                        "\t}\n" +
                        "\telse\n" +
                        "\t{\n" +
                        "\t\tprintf(\"%d is greatest\",c);\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}");

        t2.setText("Enter three integers = \n58\n24\n72\n24 is greatest");

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
