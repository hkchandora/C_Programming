package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T17 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t17);

        b1 = (Button)findViewById(R.id.button127);

        t1 = (TextView)findViewById(R.id.textView222);

        t1.setText("auto\n" +
                "The default class. Automatic variables are local to their block. Their storage space is reclaimed on exit from the block.\n" +
                "\n" +
                "register \n" +
                "If possible, the variable will be stored in a processor register. May give faster access to the variable. If register storage is not possible, then the variable will be of automatic class. \n" +
                "Use of the register class is not recommended, as the compiler should be able to make better judgement about which variables to hold in registers, in fact injudicious use of register variables may slow down the program.\n" +
                "\n" +
                "static \n" +
                "On exit from block, static variables are not reclaimed. They keep their value. On re-entry to the block the variable will have its old value. \n" +
                "\n" +
                "extern \n" +
                "Allows access to external variables. An external variable is either a global variable or a variable defined in another source file. External variables are defined outside of any function. (Note: Variables passed to a function and modified by way of a pointer are not external variables)\n" +
                "\n" +
                "static external \n" +
                "External variables can be accessed by any function in any source file which make up the final program. Static external variables can only be accessed by functions in the same file as the variable declaration.\n");



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
