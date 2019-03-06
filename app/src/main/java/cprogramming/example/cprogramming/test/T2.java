package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class T2 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2);

        b1 = (Button)findViewById(R.id.button112);

        t1 = (TextView)findViewById(R.id.textView207);

        t1.setText("- Fast, Powerful & efficient\n" +
                "- Easy to learn.\n" +
                "- It is portable\n" +
                "- ''Mid-level'' Language\n" +
                "- Widely accepted language\n" +
                "- Supports modular programming style\n" +
                "- Useful for all applications\n" +
                "- C is the native language of UNIX\n" +
                "- Easy to connect with system devices/assembly routines");


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
