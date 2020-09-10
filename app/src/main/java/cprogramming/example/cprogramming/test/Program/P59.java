package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P59 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p59);

        b1=(Button) findViewById(R.id.button69);

        t1=(TextView) findViewById(R.id.textView122);
        t2=(TextView) findViewById(R.id.textView123);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a[100],n,i,ele;\n" +
                "\tprintf(\"Enter the number of elements in array = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"Enter %d  integer\\n\",n);\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\t}\n" +
                "\tprintf(\"Enter the number to be search = \");\n" +
                "\tscanf(\"%d\",&ele);\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\tif(a[i]==ele)\n" +
                "\t\t{\n" +
                "\t\t\tprintf(\"%d is present at location %d\",ele,i++);\n" +
                "\t\t\tbreak;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tif(i==n)\n" +
                "\t{\n" +
                "\t\tprintf(\"%d is not present in array\",ele);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the number of elements in array = 4\n" +
                "Enter 4 integer\n" +
                "10\n" +
                "15\n" +
                "20\n" +
                "25\n" +
                "Enter the number to be search = 20\n" +
                "20 is present at location 3");

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
