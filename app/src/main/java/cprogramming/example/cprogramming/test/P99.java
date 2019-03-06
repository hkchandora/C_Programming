package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P99 extends AppCompatActivity {

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p99);

        b1 = (Button) findViewById(R.id.button109);

        t1 = (TextView) findViewById(R.id.textView202);

        t1.setText("#include < stdio.h >\n" +
                "#include < stdlib.h >\n" +
                "int main()\n" +
                "{\n" +
                "  char ch;\n" +
                "  printf(\"Do you want to shutdown your computer now (y/n)\\n\");\n" +
                "  scanf(\"%c\",&ch);\n" +
                "  if (ch == 'y' || ch == 'Y')\n" +
                "  {\n" +
                "  \tsystem(\"C:\\\\WINDOWS\\\\System32\\\\shutdown /s\");\n" +
                "  }\n" +
                "  return 0;\n" +
                "}\n");

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
