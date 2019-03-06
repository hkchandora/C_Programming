package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P40 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p40);


        b1=(Button) findViewById(R.id.button50);

        t1=(TextView) findViewById(R.id.textView84);
        t2=(TextView) findViewById(R.id.textView85);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint n,i,j,space=1;\n" +
                "\tprintf(\"Enter number of row =\\n\");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tspace = n-1;\n" +
                "\tfor(j=1;j<=n;j++)\n" +
                "\t{\n" +
                "\t\tfor(i=0;i<=space;i++)\n" +
                "\t\t\tprintf(\" \");\n" +
                "\t\tspace-;\n" +
                "\t\tfor(i=1;i<=2*k-1;i++)\n" +
                "\t\t\tprintf(\"*\");\n" +
                "\t\tprintf(\"\\n" +
                        "\");\n" +
                        "\t}\n" +
                        "\tspace = 1;\n" +
                        "\tfor(j=1;j<=n-1;j++)\n" +
                        "\t{\n" +
                        "\t\tfor(i=1;i<=space;i++)\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\tspace++;\n" +
                        "\t\tfor(i=0;i<=2*(n-k)-1;i++)\n" +
                        "\t\t\tprintf(\"*\");\n" +
                        "\t\tprintf(\"\\n" +
                        "\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}");

        t2.setText("Enter number of row =\n3\n   *   \n  **  \n ***\n***\n ** \n  *  ");

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
