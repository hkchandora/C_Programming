package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P98 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p98);

        b1=(Button) findViewById(R.id.button108);

        t1=(TextView) findViewById(R.id.textView200);
        t2=(TextView) findViewById(R.id.textView201);

        t1.setText("#include\n" +
                "int main()\n" +
                "{\n" +
                "  system(\"C:\\\\Windows\\\\System32\\\\ipconfig\");\n" +
                "  return 0;\n" +
                "}");

        t2.setText("Window IP Configuration\n\n" +
                "PPP adapter Idea Internet:\n" +
                "\t\tConnection-specific DNS Suffix.: \n" +
                "\t\tIPV4 Address...................: 100.80.215.247\n" +
                "\t\tSubnet Mask....................: 255.255.255.255\n" +
                "\t\tDefault Gateway................: 0.0.0.0");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Programs");
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
