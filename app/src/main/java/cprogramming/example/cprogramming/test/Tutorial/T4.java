package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T4 extends AppCompatActivity {

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t4);

        b1 = (Button)findViewById(R.id.button114);

        t1 = (TextView)findViewById(R.id.textView209);

        t1.setText("1) Variable Declaration\n" +
                "\n" +
                "  Usually Variables are declared before use either at the start of a block of code after the opening { and before any other statements or outside a function.\n" +
                "\n" +
                "-----------------------------------\n" +
                "int a,b; /* global variables */\n" +
                "main()\n" +
                "{\n" +
                "float a; /* local variables */\n" +
                "}\n" +
                "-----------------------------------\n" +
                "\n" +
                "Local variables can only accessed within that function only whereas Global variables can access in whole program.\n" +
                "\n\n" +
                "2) Variable Types\n" +
                "\n" +
                "  There are many 'built-in' data types in C.\n" +
                "\n" +
                "short int -128 to 127 (1 byte)\n" +
                "\n" +
                "unsigned short int 0 to 255 (1 byte)\n" +
                "\n" +
                "char 0 to 255 or -128 to +127 (1 byte)\n" +
                "\n" +
                "unsigned char 0 to 255 (1 byte)\n" +
                "\n" +
                "signed char -128 to 127 (1 byte)\n" +
                "\n" +
                "int -32,768 to +32,767 (2 bytes)\n" +
                "\n" +
                "unsigned int 0 to +65,535 (2 bytes)\n" +
                "\n" +
                "long int -2,147,483,648 to +2,147,483,647 (4 bytes)\n" +
                "\n" +
                "unsigned long int 0 to 4,294,967,295 (4 bytes)\n" +
                "\n" +
                "float single precision floating point (4 bytes)\n" +
                "\n" +
                "double double precision floating point (8 bytes)\n" +
                "\n" +
                "long double extended precision floating point (10 bytes)\n" +
                "\n" +
                "\n" +
                "3) Variable Names\n" +
                "\n" +
                "  we can use any combination of letters and numbers for Variable and function names but it must start with a letter.\n" +
                "We can use Underscore (_) as a letter in variable name and can begin with an underscore But Identifiers beginning with an underscore are reserved, And identifiers beginning with an underscore followed by a lower case letter are reserved for file scope identifiers Therefore using underscore as starting letter is not desirable.\n" +
                "\n" +
                "Himanshu and himanshu are different identifiers because upper and lower case letters are treated as different identifiers \n");



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
