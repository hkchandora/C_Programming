package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P61 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p61);

        b1=(Button) findViewById(R.id.button71);

        t1=(TextView) findViewById(R.id.textView126);
        t2=(TextView) findViewById(R.id.textView127);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrscr();\n" +
                "\tint a[100],n,i,ele,c,l,u;\n" +
                "\tprintf(\"Enter the number of elements in array = \");\n" +
                "\tscanf(\"%d\",&n);\n" +
                "\tprintf(\"Enter %d  integer\\n" +
                "\",n);\n" +
                "\tfor(i=0;i<n;i++)\n" +
                "\t\tscanf(\"%d\",&a[i]);\n" +
                "\tprintf(\"Enter the number to be search = \");\n" +
                "\tscanf(\"%d\",&ele);\n" +
                        "\tl=0,u=n-1;\n" +
                        "\tc = binary(a,n,ele,l,u);\n" +
                        "\tif(c==0)\n" +
                        "\t\tprintf(\"Number is not found\");\n" +
                        "\telse\n" +
                        "\t\tprint(\"Number is found\");\n" +
                        "\tgetch();\n" +
                        "}\n" +
                        "int binary(int a[],int n,int ele,int l,int u)\n" +
                        "{\n" +
                        "\tint mid,c=0;\n" +
                        "\tif(l<=u)\n" +
                        "\t\tmid = (l+u)/2;\n" +
                        "\t\tif(m==a[mid)\n" +
                        "\t\t\tc=1;\n" +
                        "\t\telse if(ele<a[mid])\n" +
                        "\t\t\treturn binary(a,n,ele,l,mid-1);\n" +
                        "\t\telse\n" +
                        "\t\t\tretun binary(a,n,ele,mid+1,u);\n" +
                        "\telse\n" +
                        "\t\treturn c;\n" +
                        "}");


        t2.setText("Enter the number of elements in array = 4\n" +
                "Enter 4 integer\n" +
                "10\n" +
                "15\n" +
                "20\n" +
                "25\n" +
                "Enter the number to be search = 30\n" +
                "Number is not found");


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
