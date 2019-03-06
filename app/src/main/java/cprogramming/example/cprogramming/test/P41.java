package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class P41 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p41);

        b1=(Button) findViewById(R.id.button51);

        t1=(TextView) findViewById(R.id.textView86);
        t2=(TextView) findViewById(R.id.textView87);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\nvoid main()" +
                "{\n" +
                "\tint n,i,j,a=1;\n" +
                "\tprintf(\"Enter the no of rows of Floyd's Triangle = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tfor(i=1;i<n;i++)\n" +
                "\t{\n" +
                "\t\tfor(j=1;j<i;j++)\n" +
                "\t\t{\n" +
                "\t\t\tprintf(\"%d\",a);\n" +
                "\t\t\ta++;\n" +
                "\t\t}\n" +
                "\t\tprintf(\"\\n" +
                "\");\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the no of rows of Floyd's Triangle = 4\n" +
                "1\n" +
                "2 3\n" +
                "4 5 6 \n" +
                "7 8 9 10");

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
