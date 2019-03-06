package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class T20 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t20);

        b1 = (Button)findViewById(R.id.button130);

        t1 = (TextView)findViewById(R.id.textView225);

        t1.setText("Array is a collection of similar data type items. Arrays are used to store group of data of same datatype. Arrays can of any datatype. Arrays must have constant size. Continuous memory locations are used to store array. Array index always starts with 0.\n" +
                "\n" +
                "Example for Arrays:\n" +
                "int a[5]; // integer array\n" +
                "char a[5]; // character(string) array \n" +
                "\n" +
                "Types of Arrays:\n" +
                "# One Dimensional Array\n" +
                "# Two Dimensional Array\n" +
                "# Multi Dimensional Array \n" +
                "\n\n" +
                "1) One Dimensional Array\n" +
                "\n" +
                "Array declaration \n" +
                "int age [5];\n" +
                "\n" +
                "Array initialization \n" +
                "int age[5]={0, 1, 2, 3, 4, 5};\n" +
                "\n" +
                "Accessing array \n" +
                "age[0]; /0_is_accessed/\n" +
                "age[1]; /1_is_accessed/\n" +
                "age[2]; /2_is_accessed/\n" +
                "\n\n" +
                "2) Two Dimensional Array\n" +
                "\n" +
                "Two dimensional array is combination of rows n columns.\n" +
                "Array declaration\n" +
                "int arr[2][2];\n" +
                "\n" +
                "Array initialization\n" +
                "int arr[2][2] = {{1,2}, {3,4}};\n" +
                "\n" +
                "Accessing array\n" +
                "arr [0][0] = 1; \n" +
                "arr [0][1] = 2;\n" +
                "arr [1][0] = 3;\n" +
                "arr [1][1] = 4;\n" +
                "\n\n" +
                "3) Multi Dimensional Array\n" +
                "\n" +
                "C programming language allows programmer to create arrays of arrays known as multidimensional arrays.\n" +
                "For example:\n" +
                "float a[2][4][3];\n" +
                "\n\n" +
                "4) Passing Array To Function\n" +
                "\n" +
                "In C we can pass entire Arrays to functions as an argument.\n" +
                "For eg.\n" +
                "#include <stdio.h>\n" +
                "void display(int a)\n" +
                "{ \n" +
                "  int i;\n" +
                "  for(i=0;i < 4;i++){\n" +
                "    printf(\"%d\",a[i]);\n" +
                "  }\n" +
                "}\n" +
                "int main(){\n" +
                "  int c[]={1,2,3,4};\n" +
                "  display(c); \n" +
                "  //Passing array to display.\n" +
                "  return 0;\n" +
                "}\n" +
                "See Programs section of this app for example of Arrays\n");



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tutorials");
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
