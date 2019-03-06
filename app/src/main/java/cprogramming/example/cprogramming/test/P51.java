package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P51 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p51);

        b1 = (Button) findViewById(R.id.button61);

        t1 = (TextView) findViewById(R.id.textView106);
        t2 = (TextView) findViewById(R.id.textView107);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tint n,i,j,a[100],b[100];\n" +
                "\tprintf(\"Enter the Number of element in Array = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"Enter the elements = \\n\");\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\t}\n" +
                "\tfor(i=n-1,j=0;i>=0;i--,j++)\n" +
                "\t{\n" +
                "\t\tb[j] = a[i];\n" +
                "\t}\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\ta[i] = b[i];\n" +
                "\t}\n" +
                "\tprintf(\"Reverse array is = \\n\");\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d\",a[i]);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the Number of element in Array = 3\n" +
                "Enter the elements = \n" +
                "1\t" +
                "2\t" +
                "3\n" +
                "Reverse array is = \n" +
                "3\t" +
                "2\t" +
                "1");


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
