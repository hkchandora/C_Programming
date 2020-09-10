package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T21 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t21);

        b1 = (Button)findViewById(R.id.button131);

        t1 = (TextView)findViewById(R.id.textView226);

        t1.setText("Pointer is a variable that stores the address of another variable. They can make some things much easier, help improve your program's efficiency, and even allow you to handle unlimited amounts of data. \n" +
                "\n" +
                "C Pointer is used to allocate memory dynamically i.e. at run time. The variable might be any of the data type such as int, float, char, double, short etc.\n" +
                "\n" +
                "Syntax : Pointers require a bit of new syntax because when you have a pointer, you need the ability to both request the memory location it stores and the value stored at that memory location.\n" +
                "data_type *ptr_name;\n" +
                "\n" +
                "Example : \n" +
                "int *a; char *a;\n" +
                "Where, * is used to denote that ''a'' is pointer variable and not a normal variable.\n" +
                "\n" +
                "Key points to remember about pointers in C:\n" +
                "\n" +
                "# Normal variable stores the value whereas pointer variable stores the address of the variable.\n" +
                "\n" +
                "# The content of the C pointer always be a whole number i.e. address.\n" +
                "\n" +
                "# Always C pointer is initialized to null, i.e. int *p = null.\n" +
                "\n" +
                "# The value of null pointer is 0.\n" +
                "\n" +
                "# & symbol is used to get the address of the variable.\n" +
                "\n" +
                "# * symbol is used to get the value of the variable that the pointer is pointing to.\n" +
                "\n" +
                "# If pointer is assigned to NULL, it means it is pointing to nothing.\n" +
                "\n" +
                "# Two pointers can be subtracted to know how many elements are available between these two pointers.\n" +
                "\n" +
                "# But, Pointer addition, multiplication, division are not allowed.\n" +
                "\n" +
                "# The size of any pointer is 2 byte (for 16 bit compiler).\n" +
                "\n" +
                "Example program for pointer in C:\n" +
                "\n" +
                "#include \n" +
                "int main()\n" +
                "{\n" +
                "int *ptr, q;\n" +
                "  q = 50; \n" +
                "\n" +
                "  /* address of q is assigned to ptr */\n" +
                "  ptr = &q; \n" +
                "\n" +
                "  /* display q's value using ptr variable */\n" +
                "  printf(\"%d\", *ptr); \n" +
                "  return 0;\n" +
                "}\n" +
                "\n" +
                "NULL Pointers\n" +
                "It is always a good practice to assign a NULL value to a pointer variable in case you do not have exact address to be assigned. This is done at the time of variable declaration. A pointer that is assigned NULL is called a null pointer. Eg : int *ptr = NULL;\n" +
                "The value of ptr is 0\n" +
                "\n" +
                "Pointer Arithmetic\n" +
                "\n" +
                "As you understood pointer is an address which is a numeric value; therefore, you can perform arithmetic operations on a pointer just as you can a numeric value. There are four arithmetic operators that can be used on pointers: ++, --, +, and -.\n" +
                "\n" +
                "Example : \n" +
                "ptr++;\n" +
                "ptr--;\n" +
                "ptr+21;\n" +
                "ptr-10;\n" +
                "\n" +
                "If a char pointer pointing to address 100 is incremented (ptr++) then it will point to memory address 101\n" +
                "\n" +
                "Pointers vs Arrays\n" +
                "\n" +
                "Pointers and arrays are strongly related. In fact, pointers and arrays are interchangeable in many cases. For example, a pointer that points to the beginning of an array can access that array by using either pointer arithmetic or array-style indexing.\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "int var[3] = {1, 2, 3};\n" +
                "int *ptr;\n" +
                "printf(\"%d \\n\",*ptr);\n" +
                "ptr++;\n" +
                "printf(\"%d \\n\",*ptr);\n" +
                "return 0;\n" +
                "}\n" +
                "\n" +
                "this code will return : \n" +
                "1\n" +
                "2\n" +
                "\n" +
                "Pointer to Pointer\n" +
                "\n" +
                "A pointer to a pointer is a form of multiple indirection or a chain of pointers. Normally, a pointer contains the address of a variable. When we define a pointer to a pointer, the first pointer contains the address of the second pointer, which points to the location that contains the actual value. int main ()\n" +
                "{\n" +
                "int var;\n" +
                "int *ptr;\n" +
                "int **pptr;\n" +
                "var = 3000;\n" +
                "ptr = &var;\n" +
                "pptr = &ptr;\n" +
                "printf(\"Value of var :%d \\n\", var);\n" +
                "printf(\"Value available at *ptr :%d \\n\",*ptr);\n" +
                "printf(\"Value available at *pptr :%d\\n\",*pptr);\n" +
                "return 0;\n" +
                "}\n" +
                "\n" +
                "this code will return \n" +
                "Value of var :3000\n" +
                "Value available at *ptr :3000\n" +
                "Value available at **pptr :3000\n");


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
