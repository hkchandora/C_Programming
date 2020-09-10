package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;

public class T14 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t14);

        b1 = (Button)findViewById(R.id.button124);

        t1 = (TextView)findViewById(R.id.textView219);

        t1.setText("A function definition contains function name, parameters, its code and return type and A function declaration contains only name and return type. \n" +
                "User can define a function only once but it can be declared several times.\n" +
                "\n" +
                "declaration of function \n" +
                "Syntax :\n" +
                "< return_type> < function_name>(arguments... );\n" +
                "\n" +
                "/* Declaration of area() */\n" +
                "\n" +
                "int area(int x, int y);\n" +
                "int main()\n" +
                "{\n" +
                "int x=10, y=25;   printf(''%d\\n'',area(x,y)));\n" +
                "  return 0;\n" +
                "}\n" +
                "\n" +
                "Definition of function\n" +
                "syntax\n" +
                "< return_type> < function_name>(arguments)\n" +
                "{\n" +
                "Body of function;\n" +
                "}\n" +
                "\n" +
                "/* Definition of area() */\n" +
                "\n" +
                "int area(int x, int y)\n" +
                "{\n" +
                "  int z;\n" +
                "  z = x*y;\n" +
                "  retrun z; }\n");



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
