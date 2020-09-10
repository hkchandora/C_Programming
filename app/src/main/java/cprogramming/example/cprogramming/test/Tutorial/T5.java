package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T5 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t5);

        b1 = (Button)findViewById(R.id.button115);

        t1 = (TextView)findViewById(R.id.textView210);

        t1.setText("An operator is a symbol. Compiler identifies Operator and performs specific mathematical or logical operation. C provides following operators : \n" +
                "# Arithmetic Operators\n" +
                "# Increment and Decrement Operators\n" +
                "# Relational Operators\n" +
                "# Logical Operators\n" +
                "# Cast Operators\n" +
                "# Bitwise Operators\n" +
                "# Assignment Operators\n" +
                "\n\n" +
                "1) Arithmetic Operators\n" +
                "\n" +
                "* multiplication\n" +
                "/ division\n" +
                "% remainder after division (modulo arithmetic)\n" +
                "+ addition\n" +
                "- subtraction and unary minus\n" +
                "\n\n" +
                "2) Increment and Decrement Operators\n" +
                "\n" +
                "Increment and decrement operators are used to add or subtract 1 from the current value of oprand.\n" +
                "\n" +
                "++ increment\n" +
                "-- decrement\n" +
                "\n" +
                "Increment and Decrement operators can be prefix or postfix. In the prefix style the value of oprand is changed before the result of expression and in the postfix style the variable is modified after result.\n" +
                "\n" +
                "For eg.\n" +
                "a = 9;\n" +
                "b = a++ + 5; /* a=10 b=14 */\n" +
                "a = 3;\n" +
                "b = ++a + 6; /* a=10 b=15 */\n" +
                "\n\n" +
                "3) Relational Operators\n" +
                "\n" +
                "== equal.\n" +
                "!= Not equal.\n" +
                "> < Greater than/less than\n" +
                ">= greater than or equal to \n" +
                "<= less than or equal to \n" +
                "\n\n" +
                "4) Logical Operators\n" +
                "\n" +
                "&& Called Logical AND operator. If both the operands are non-zero, then condition becomes true.\n" +
                "\n" +
                "|| Called Logical OR Operator. If any of the two operands is non-zero, then condition becomes true.\n" +
                "\n" +
                "! Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true, then Logical NOT operator will make false.\n" +
                "\n\n" +
                "5) Cast Operators\n" +
                "\n" +
                "Cast operators are used to convert a value from one to another type.\n" +
                "(float) sum;   converts type to float\n" +
                "(int) fred;   converts type to int\n" +
                "\n\n" +
                "6) Bitwise Operators \n" +
                "\n" +
                "Bitwise operators performs operation on actual bits present in each byte of a variable. Each byte contain 8 bits, each bit can store the value 0 or 1 \n" +
                "\n" +
                "~ one's complement\n" +
                "& bitwise AND\n" +
                "^ bitwise XOR\n" +
                "| bitwise OR\n" +
                "<< left shift (binary multiply by 2)\n" +
                ">> right shift (binary divide by 2)\n" +
                "\n\n" +
                "7) Assignment Operators\n" +
                "\n" +
                "= assign\n" +
                "+= assign with add\n" +
                "-= assign with subtract\n" +
                "*= assign with multiply\n" +
                "/= assign with divide\n" +
                "%= assign with remainder\n" +
                ">>= assign with right shift\n" +
                "<<= assign with left shift\n" +
                "&= assign with bitwise AND \n" +
                "^= assign with bitwise XOR\n" +
                "|= assign with bitwise OR\n" +
                "\n" +
                "For example,\n" +
                "a = a + 64; is same as \n" +
                "a += 64;\n" +
                "\n");


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
