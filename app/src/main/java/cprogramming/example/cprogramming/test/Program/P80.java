package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P80 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p80);

        b1=(Button) findViewById(R.id.button90);

        t1=(TextView) findViewById(R.id.textView164);
        t2=(TextView) findViewById(R.id.textView165);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#define MAX 30\n" +
                "void main() \n" +
                "{\n" +
                "  int size, i, arr[MAX];\n" +
                "  int *ptr;\n" +
                "  ptr = &arr[0];\n" +
                "  printf(\"\\nEnter the size of array : \");\n" +
                "  scanf(\"%d\", &size);\n" +
                "  printf(\"\\nEnter %d integers into array: \", size);\n" +
                "  for (i = 0; i < size; i++)\n" +
                "  {\n" +
                "  \tscanf(\"%d\", ptr);\n" +
                "  \tptr++;\n" +
                "  }\n" +
                "  ptr = &arr[size - 1];\n" +
                "  printf(\"\\nElements of array in reverse order are :\");\n" +
                "  for (i = size - 1; i > = 0; i--)\n" +
                "  {\n" +
                "  \tprintf(\"\\nElement%d is %d : \", i, *ptr);\n" +
                "  \tptr--;\n" +
                "  }\n" +
                "  getch();" +
                "}\n");

        t2.setText("Enter the size of array : 5\n" +
                "Enter 5 integer into array: 3  8  5  2  5\n" +
                "\n" +
                "Elements of array in reverse order are:\n" +
                "Elements4 is: 5\n" +
                "Elements3 is: 2\n" +
                "Elements2 is: 5\n" +
                "Elements1 is: 8\n" +
                "Elements0 is: 3");

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
