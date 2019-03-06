package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class T23 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t23);

        b1 = (Button)findViewById(R.id.button133);

        t1 = (TextView)findViewById(R.id.textView228);

        t1.setText("In Array we can store data of one type only, but structure is a variable that gives facility of storing data of different data type in one variable.\n" +
                "\n" +
                "Structures are variables that have several parts; each part of the object can have different types.\n" +
                "Each part of the structure is called a member of the structure.\n" +
                "\n" +
                "# Declaration\n" +
                "\n" +
                "Consider basic data of student :\n" +
                "roll_no, class, name, age, address.\n" +
                "\n" +
                "A structure data type called student can hold all this information:\n" +
                "struct student\n" +
                "{\n" +
                "\tint roll_no\n" +
                "\tchar class\n" +
                "\tchar name[25];\n" +
                "\tint age;\n" +
                "\tchar address[50];\n" +
                "};\n" +
                "\n" +
                "before the final semicolon, At the end of the structure's definition, we can specify one or more structure variables.\n" +
                "\n" +
                "There is also another way of declaring variables given below,\n" +
                "struct student s1;\n" +
                "\n" +
                "# Initialization\n" +
                "\n" +
                "Structure members can be initialized at declaration. This is same as the initialization of arrays; the values are listed inside braces. The structure declaration is preceded by the keyword static.\n" +
                "\n" +
                "static struct student akki ={1234,''comp'',''akki'',20,''mumbai''};\n" +
                "\n" +
                "# Accessing structure data\n" +
                "\n" +
                "To access a given member the dot notation is use. The ''dot'' is called the member access operator\n" +
                "\n" +
                "struct student s1;\n" +
                "s1.name = ''Akki'';\n" +
                "s1.roll_no = 1234\n" +
                "\n" +
                "# scope\n" +
                "\n" +
                "A structure type declaration can be local or global, depending upon where the declaration is made.\n");




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
