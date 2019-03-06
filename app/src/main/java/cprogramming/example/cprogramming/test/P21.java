package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P21 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p21);

        b1=(Button) findViewById(R.id.button31);

        t1=(TextView) findViewById(R.id.textView46);
        t2=(TextView) findViewById(R.id.textView47);

        t1.setText("#include<stdio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tchar ch;\n" +
                "\tprintf(\"Enter a Character = \");\n" +
                "\tscanf(\"%c\",&ch);\n" +
                "\tswitch(ch)\n" +
                "\t{\n" +
                "\t\tcase 'a'\n" +
                "\t\tcase 'A':\n" +
                "\t\tcase 'e':\n" +
                "\t\tcase 'E':\n" +
                "\t\tcase 'i':\n" +
                "\t\tcase 'I'\n" +
                "\t\tcase 'o':\n" +
                "\t\tcase 'O'\n" +
                "\t\tcase 'u'\n" +
                "\t\tcase 'U'\n" +
                "\t\tprintf(\"%c is Vowel\",ch);\n" +
                "\t\tdefault:\n" +
                "\t\tprintf(\"%c is not Vowel\",ch);\n" +
                "\t}\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter a Character = h\n" +
                "h is not Vowel");

        t2.setText("Enter a integer number, you want to add = \n5\nEnter 5 intergers\n1\n2\n3\n4\n5\nSum of entered integer = 15");

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
