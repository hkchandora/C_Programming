package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P95 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p95);

        b1=(Button) findViewById(R.id.button105);

        t1=(TextView) findViewById(R.id.textView194);
        t2=(TextView) findViewById(R.id.textView195);

        t1.setText("#include<stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "  FILE *fp;\n" +
                "  char ch;\n" +
                "  fp = fopen(_FILE_, \"r\");\n" +
                "  do\n" +
                "  {\n" +
                "  \tch = getc(fp);\n" +
                "  \tputchar(ch);\n" +
                "  }while (ch != EOF);\n" +
                "  fclose(fp);\n" +
                "  return 0;\n" +
                "}");

        t2.setText("#include<stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "  FILE *fp;\n" +
                "  char ch;\n" +
                "  fp = fopen(_FILE_, \"r\");\n" +
                "  do\n" +
                "  {\n" +
                "  \tch = getc(fp);\n" +
                "  \tputchar(ch);\n" +
                "  }while (ch != EOF);\n" +
                "  fclose(fp);\n" +
                "  return 0;\n" +
                "}");

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
