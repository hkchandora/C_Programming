package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T18 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t18);

        b1 = (Button)findViewById(R.id.button128);

        t1 = (TextView)findViewById(R.id.textView223);

        t1.setText("Definition is the place where variable is created (allocated storage).\n" +
                "\n" +
                "Declaration is a place where nature (type) of variable is stated, but no storage is allocated.\n" +
                "\n" +
                "Initialization means assigning a value to the variable.\n" +
                "\n" +
                "Variables can be declared many times, but defined only once. Memory space is not allocated for a variable while declaration. It happens only on variable definition.\n" +
                "\n" +
                "Variable declaration\n" +
                "syntax\t\n" +
                "data_type variable_name;\n" +
                "\n" +
                "example\n" +
                "int a, b, c;\n" +
                "char flag;\n" +
                "\n" +
                "\t Variable initialization\n" +
                "syntax\n" +
                "data_type variable_name = value;\n" +
                "\n" +
                "example\n" +
                "int a = 50; \n" +
                "char flag = 't';\n");



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
