package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class T11 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t11);

        b1 = (Button)findViewById(R.id.button121);

        t1 = (TextView)findViewById(R.id.textView216);

        t1.setText("We can jump to any statement inside the same function using goto. To spot the end point of the jump a label (tag) is used. goto statement is not to ideal to choose in any programming language because it makes difficult to trace the flow of a program, makes the program hard to understand, and to guess the output.\n" +
                "\n" +
                "void any_function(void)\n" +
                "{\n" +
                "    for( ... )\n" +
                "      if (problem) goto error;\n" +
                "\n" +
                "error:\n" +
                "solve problem\n" +
                "}\n" +
                "\n" +
                "But in the example above, remember that the code could be rewritten as:\n" +
                "\n" +
                "void function1(void)\n" +
                "{\n" +
                "    for( ... )\n" +
                "      if (problem)\n" +
                "      {\n" +
                "        solve problem\n" +
                "        return;\n" +
                "      }\n" +
                "} \n");



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
