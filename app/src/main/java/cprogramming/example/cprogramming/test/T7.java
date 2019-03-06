package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class T7 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t7);

        b1 = (Button)findViewById(R.id.button117);

        t1 = (TextView)findViewById(R.id.textView212);

        t1.setText("getchar and putchar are used for the input or output only one character.\n" +
                "\n" +
                "getchar() \n" +
                "It returns an int which is either EOF(indicating end-of-file) or the next character in the standard input stream.\n" +
                "\n" +
                "putchar(c) \n" +
                "puts the character on the output stream.\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "int a;\n" +
                "a = getchar();\n" +
                "/* read and assign character to c */\n" +
                "putchar(a);\n" +
                "/* print c on the screen */\n" +
                "return 0;\n" +
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
