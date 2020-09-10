package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P60 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p60);


        b1=(Button) findViewById(R.id.button70);

        t1=(TextView) findViewById(R.id.textView124);
        t2=(TextView) findViewById(R.id.textView125);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a[100],n,i,ele,first,last,mid;\n" +
                "\tprintf(\"Enter the number of elements in array = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"Enter %d  integer\\n\",n);\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t{\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\t}\n" +
                "\tprintf(\"Enter the number to be search = \");\n" +
                "\tscanf(\"%d\",&ele);\n\tfirst = 0;\n\tlast = n-1;\n\tmid = (first+last)/2;\n" +
                "\twhile(first<=last)\n" +
                "\t{\n" +
                "\t\tif(a[mid]==ele)\n" +
                "\t\t{\n" +
                "\t\t\tprintf(\"%d is present at location %d\",ele,mid++);\n" +
                "\t\t\tbreak;\n" +
                "\t\t}\n" +
                "\t\telse if(a[mid]<ele)\n" +
                "\t\t{\n" +
                "\t\t\tfirst = mid=1;\n" +
                "\t\t}\n" +
                "\t\telse\n" +
                "\t\t{\n" +
                "\t\t\tlast = mid-1;\n" +
                "\t\t}\n" +
                "\t\tmid = (first+last)/2;\n" +
                "\t}\n" +
                "\tif(first>last)\n" +
                "\t{\n" +
                "\t\tprintf(\"NOT FOUND! %d is not present in array\",ele);\n" +
                "\n}\n" +
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
