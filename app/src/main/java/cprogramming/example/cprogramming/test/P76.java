package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class P76 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p76);

        b1=(Button) findViewById(R.id.button86);

        t1=(TextView) findViewById(R.id.textView156);
        t2=(TextView) findViewById(R.id.textView157);

        t1.setText("#include < stdio.h >\n" +
                "#include < string.h >\n" +
                "#include < malloc.h >\n" +
                "int main()\n" +
                "{\n" +
                "  char first[100], second[100], *temp;\n" +
                "  printf(\"Enter the first string\\n\");\n" +
                "  gets(first);\n" +
                "  printf(\"Enter the second string\\n\");\n" +
                "  gets(second);\n" +
                "  printf(\"\\nBefore Swapping\\n\");\n" +
                "  printf(\"First string: %s\\n\",first);\n" +
                "  printf(\"Second string: %s\\n\\n\",second);\n" +
                "  temp = (char*)malloc(100);\n" +
                "  strcpy(temp,first);\n" +
                "  strcpy(first,second);\n" +
                "  strcpy(second,temp);\n" +
                "  printf(\"After Swapping\\n\");\n" +
                "  printf(\"First string: %s\\n\",first);\n" +
                "  printf(\"Second string: %s\\n\",second);\n" +
                "  return 0;\n" +
                "}\n" +
                "\n");

        t2.setText("Enter the first string\n" +
                "Hello\n" +
                "Enter the second string\n" +
                "Bye\n" +
                "\n" +
                "Before Swapping\n" +
                "First string: Hello\n" +
                "Second String: Bye\n" +
                "\nAfter Swapping\n" +
                "First string: Bye\n" +
                "Second String: Hello");

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
