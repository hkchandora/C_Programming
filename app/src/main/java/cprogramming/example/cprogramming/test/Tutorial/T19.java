package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T19 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t19);

        b1 = (Button)findViewById(R.id.button129);

        t1 = (TextView)findViewById(R.id.textView224);

        t1.setText("Initialization means assigning a value to the variable.\n" +
                "If variables are not explicitly initialised, then external and static variables are initialised to zero; pointers (see ch 8) are initialised to NULL ; auto and register variables have undefined values.\n" +
                "\n" +
                "int x = 1;\n" +
                "char quote = '\\'';\n" +
                "long day = 60 * 24;\n" +
                "int len = strlen(s);\n" +
                "\n" +
                "external and static\n" +
                "initialisation done once only.\n" +
                "\n" +
                "auto and register \n" +
                "initialisation done each time block is entered.\n" +
                "\n" +
                "external and static variables cannot be initialised with a value that is not known until run-time; the initialiser must be a constant expression.\n");



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
