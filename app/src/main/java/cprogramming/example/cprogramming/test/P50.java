package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P50 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p50);

        b1=(Button) findViewById(R.id.button60);

        t1=(TextView) findViewById(R.id.textView104);
        t2=(TextView) findViewById(R.id.textView105);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n"+
                "\tint a[100],min,size,i,location=1;\n"+
                "\tprintf(\"Enter the number of elements in array = \");\n" +
                "\tscanf(\"%d\",&size);\n" +
                "\tfor(i=0;i<size;i++)\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\t\tmin = a[0];\n" +
                "\t\tfor(i=1;i<size;i++)\n" +
                "\t\t{\n" +
                "\t\t\tif(a[i]<min)\n" +
                "\t\t\t{\n" +
                "\t\t\t\tmin = a[i];\n" +
                "\t\t\t\tlocation=i+1;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\tprintf(\"Minimum element is %d at location %d\",min,location);\n" +
                "\tgetch();\n"  +
                "}");

        t2.setText("Enter the number of elements in array = 4\n" +
                "4\n7\n3\n5\n" +
                "Minimum element is 3 at location 3");

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
