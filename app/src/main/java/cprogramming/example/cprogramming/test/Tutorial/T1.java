package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T1 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1);

        b1 = (Button)findViewById(R.id.button111);

        t1 = (TextView)findViewById(R.id.textView206);

        t1.setText("The C programming language is a general-purpose, high-level language (generally denoted as structured language). C programming language was at first developed by Dennis M. Ritchie at At&T Bell Labs.\n" +
                "\n" +
                "C is one of the most commonly used programming languages. It is simple and efficient therefore it become best among all. It is used in all extents of application, mainly in the software development. \n" +
                "\n" +
                "Many software's & applications as well as the compilers for other programming languages are written in C also Operating Systems like Unix, DOS and Windows are written in C.\n" +
                "\n" +
                "C has many powers, it is simple, stretchy and portable, and it can control System Hardware easily. It is also one of the few languages to have an international standard, ANSI C. ");


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
