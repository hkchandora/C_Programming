package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T16 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t16);

        b1 = (Button)findViewById(R.id.button126);

        t1 = (TextView)findViewById(R.id.textView221);

        t1.setText("C is a block structured language. Blocks are enclosed by { and }. Blocks can be defined wherever a C statement could be used. No semi-colon is required after the closing brace of a block.\n" +
                "\n" +
                "Variable Scope\n" +
                "refers to where variables is declared. \n" +
                "\n" +
                "Global variables\n" +
                "\n" +
                "Global variable are declared outside any functions, usually at top of program. they can be used by later blocks of code:\n" +
                "int g;\n" +
                "int main(void)\n" +
                "{\n" +
                "\tg = 0;\n" +
                "}\n" +
                "\n" +
                "Local variables\n" +
                "\n" +
                "Variables that are declared inside a function or block are local variables. The scope of local variables will be within the function only. These variables are declared within the function and can't be accessed outside the function.\n" +
                "void main()\n" +
                "{\n" +
                "\tint g;\n" +
                "\tg=2;\n" +
                "\tprintf(''g= %d'',&g);\n" +
                "}\n");



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
