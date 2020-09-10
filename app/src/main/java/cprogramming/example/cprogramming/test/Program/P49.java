package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P49 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p49);

        b1=(Button) findViewById(R.id.button59);

        t1=(TextView) findViewById(R.id.textView102);
        t2=(TextView) findViewById(R.id.textView103);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n"+
                "\tint a[100],max,size,i,location=1;\n"+
                "\tprintf(\"Enter the number of elements in array = \");\n" +
                "\tscanf(\"%d\",&size);\n" +
                "\tfor(i=0;i<size;i++)\n" +
                        "\t\tscanf(\"%d\",&a[i]);\n" +
                        "\t\tmax = a[0];\n" +
                        "\t\tfor(i=1;i<size;i++)\n" +
                        "\t\t{\n" +
                        "\t\t\tif(a[i]>max)\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\tmax = a[i];\n" +
                        "\t\t\t\tlocation=i+1;\n" +
                        "\t\t\t}\n" +
                        "\t\t}\n" +
                        "\tprintf(\"Maximum element is %d at location %d\",max,location);\n" +
                "\tgetch();\n"  +
                "}");

        t2.setText("Enter the number of elements in array = 4\n" +
                "4\n7\n3\n5\n" +
                "Maximum element is 7 at location 2");

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
