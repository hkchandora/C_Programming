package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P53 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p53);

        b1=(Button) findViewById(R.id.button63);

        t1=(TextView) findViewById(R.id.textView110);
        t2=(TextView) findViewById(R.id.textView111);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tint a[100],position,i,n;\n" +
                "\tprintf(\"Enter number of elements in array = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"Enter Elements = \\n\");\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\t}\n" +
                "\tprintf(\"Enter the location where you wish to delete an element = \");\n" +
                "\tscanf(\"%d\",&position);\n" +
                "\tif(position>=n+1)\n" +
                "\t{\n" +
                "\t\tprintf(\"Deletion not possible\");\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tfor(i=position-1;i<n-1;i++)\n" +
                "\t\t{\n" +
                "\t\t\ta[i] = a[i+1];\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tprintf(\"Resultant array is = \");\n" +
                "\tfor(i=0;i<n-1;i++)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d\\t\",a[i]);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter number of elements in array = 3\n" +
                "Enter Elements =\n" +
                "2\t" +
                "4\t" +
                "6\n" +
                "Enter the location where you wish to insert an element = 2\n" +
                "Enter the value to insert = 10\n" +
                "Resultant array is = \n" +
                "2\t" +
                "10\t" +
                "4\t" +
                "6");


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
