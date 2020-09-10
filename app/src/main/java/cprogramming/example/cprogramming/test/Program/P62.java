package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P62 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p62);

        b1=(Button) findViewById(R.id.button72);

        t1=(TextView) findViewById(R.id.textView128);
        t2=(TextView) findViewById(R.id.textView129);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a[100],n,i,j,temp=0;\n" +
                "\tprintf(\"Enter the number of elements = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"Enter %d integer\\n" +
                "\",n);\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t\tfor(j=0;j<n;j++)\n" +
                "\t\t\tif(a[j]>a[j+1])\n" +
                "\t\t\t\ttemp = a[j];\n" +
                "\t\t\t\ta[j] = a[j+1]\n" +
                "\t\t\t\ta[j+1] = temp;\n" +
                "\tprintf(\"Sorted list in asending order \\n" +
                "\");\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t\tprintf(\"%d\",a[i]);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the number of elements = 4\n" +
                "Enter 4 integer\n" +
                "24\t" +
                "97\t" +
                "68\t" +
                "35\n" +
                "Sorted list in asending order\n" +
                "24\t" +
                "35\t" +
                "68\t" +
                "97");

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
