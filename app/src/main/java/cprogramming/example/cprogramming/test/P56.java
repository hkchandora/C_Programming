package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class P56 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p56);

        b1=(Button) findViewById(R.id.button66);

        t1=(TextView) findViewById(R.id.textView116);
        t2=(TextView) findViewById(R.id.textView117);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a[10][10],b[10][10],c[10][10],i,j,r,c;\n" +
                "\tprintf(\"Enter the number of row and columns =\\n\");\n" +
                "\tscanf(\"%d%d\",&r,&c);\n" +
                "\tprintf(\"Enter the element of first Matrix =\\n\");\n" +
                "\tfor(i=0;i<r;i++)\n" +
                "\t{\n" +
                "\t\tfor(j=0;j<c;j++)\n" +
                "\t\t{\n" +
                "\t\t\tscanf(\"%d\",&a[i][j]);\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tprintf(\"Enter the element of second Matrix =\\n\");\n" +
                "\tfor(i=0;i<r;i++)\n" +
                "\t{\n" +
                "\t\tfor(j=0;j<c;j++)\n" +
                "\t\t{\n" +
                "\t\t\tscanf(\"%d\",&b[i][j]);\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tfor(i=0;i<r;i++)\n" +
                "\t{\n" +
                "\t\tfor(j=0;j<c;j++)\n" +
                "\t\t{\n" +
                "\t\t\tc[i][j] = a[i][j]-b[i][j];\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tprintf(\"Subtract of Both Matrices =\\n\");\n" +
                "\tfor(i=0;i<r;i++)\n" +
                "\t{\n" +
                "\t\t{\n" +
                "\t\tfor(j=0;j<c;j++)\n" +
                "\t\t\tprintf(\"%d\",c[i][j]);\n" +
                "\t\t}\n" +
                "\t\tprintf(\"\\n\");\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the number of row and columns =\n" +
                "2\n" +
                "2\n" +
                "Enter the element of first Matrix =\n" +
                "5 6\n" +
                "7 8\n" +
                "Enter the element of second Matrix =\n" +
                "1 2\n" +
                "3 4\n" +
                "Sum of Both Matrices =\n" +
                "4 4\n" +
                "4 4");


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
