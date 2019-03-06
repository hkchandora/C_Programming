package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class T8 extends AppCompatActivity {

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t8);

        b1 = (Button)findViewById(R.id.button118);

        t1 = (TextView)findViewById(R.id.textView213);

        t1.setText("1) if statement\n" +
                "\n" +
                "An if statement contains a Boolean expression and block of statements enclosed within braces.\n" +
                "\n" +
                "Structure of if statement :\n" +
                "if (boolean expression ) \n" +
                "/* if expression is true */\n" +
                "  statements... ; /* Execute statements */\n" +
                "If the Boolean expression is true then statement block is executed otherwise (if false) program directly goes to next statement without executing Statement block.\n" +
                "\n\n" +
                "2) if...else statement\n" +
                "\n" +
                "If statement block with else statement is known as as if...else statement. Else portion is non-compulsory.\n" +
                "\n" +
                "Structure of if...else\n" +
                "\n" +
                "if(condition)\n" +
                "{\n" +
                "  statements...\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "  statements...\n" +
                "}\n" +
                "If the condition is true, then compiler will execute the if block of statements, if false then else block of statements will be executed.\n" +
                "\n" +
                "We can use multiple if-else for one inside other this is called as Nested if-else.\n");


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
