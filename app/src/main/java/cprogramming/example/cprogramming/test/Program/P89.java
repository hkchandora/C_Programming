package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P89 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p89);

        b1=(Button) findViewById(R.id.button99);

        t1=(TextView) findViewById(R.id.textView182);
        t2=(TextView) findViewById(R.id.textView183);

        t1.setText("#include &ltstdio.h >\n" +
                " int main()\n" +
                "{\n" +
                "  int status;\n" +
                "  char file_name[25];\n" +
                "  printf(\"Enter the name of file you wish to delete\\n\");\n" +
                "  gets(file_name);\n" +
                "  status = remove(file_name);\n" +
                "  if( status == 0 )\n" +
                "  {\n" +
                "  \tprintf(\"%s file deleted successfully.\\n\",file_name);\n" +
                "  }\n" +
                "  else\n" +
                "  {\n" +
                "  \tprintf(\"Unable to delete the file\\n\");\n" +
                "  \tperror(\"Error\");\n" +
                "  }\n" +
                "  return 0;\n" +
                "}\n");

        t2.setText("Enter the name of file you wish to delete\n" +
                "leap-year.c\n" +
                "leap-year.c file deleted successfully.\n");

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
