package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class P88 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p88);

        b1=(Button) findViewById(R.id.button98);

        t1=(TextView) findViewById(R.id.textView180);
        t2=(TextView) findViewById(R.id.textView181);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "#include<dir.h>\n" +
                "int main()\n" +
                "{\n" +
                "  int done;\n" +
                "  struct ffblk a;\n" +
                "  printf(\"Press any key to view the files in the current directory\\n\");\n" +
                "  getch();\n" +
                "  done = findfirst(\".\",&a,0);\n" +
                "  while(!done)\n" +
                "  {\n" +
                "  \tprintf(\"%s\\n\",a.ff_name);\n" +
                "  \tdone = findnext(&a);\n" +
                "  }\n" +
                "  getch();\n" +
                "  return 0;\n" +
                "}\n");

        t2.setText("Press any key to view the files in the current directory\n" +
                "ADDCOM~1.C\n" +
                "COPYST~1.C\n" +
                "LISTFI~1.EXE\n" +
                "LISTF1~1.OBJ\n" +
                "REVERSE~1.C");

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
