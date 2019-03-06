package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class T9 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t9);

        b1 = (Button)findViewById(R.id.button119);

        t1 = (TextView)findViewById(R.id.textView214);

        t1.setText("switch()\n" +
                "\n" +
                "A switch statement is used instead of nested if...else statements. It is multiple branch decision statement of C. A switch statement tests a variable with list of values for equivalence. Each value is called a case.\n" +
                "\n" +
                "The case value must be a constant integer. \n" +
                "\n" +
                "Structure of switch() statement :\n" +
                "switch (expression)\n" +
                "{\n" +
                "  case value: statements...\n" +
                "  case value: statements...\n" +
                "  default : statements...\n" +
                "}\n" +
                "\n" +
                "Individual case keyword and a semi-colon (:) is used for each constant. Switch tool is used for skipping to particular case, after jumping to that case it will execute all statements from cases beneath that case this is called as ''Fall Through''. \n" +
                "\n" +
                "In the example below, for example, if the value 2 is entered, then the program will print two one something else!\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "  int i;\n" +
                "  printf(''Enter an integer: '');\n" +
                "  scanf(''%d'',&i);   switch(i)\n" +
                "  {\n" +
                "    case 4: printf(''four ''); break;\n" +
                "    case 3: printf(''three ''); break;\n" +
                "    case 2: printf(''two '');\n" +
                "    case 1: printf(''one '');\n" +
                "    default: printf(''something else!'');\n" +
                "  }\n" +
                "  return 0;\n" +
                "}\n" +
                "\n" +
                "To avoid fall through, the break statements are necessary to exit the switch. If value 4 is entered, then in case 4 it will just print four and ends the switch.\n" +
                "\n" +
                "The default label is non-compulsory, It is used for cases that are not present.\n");


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
