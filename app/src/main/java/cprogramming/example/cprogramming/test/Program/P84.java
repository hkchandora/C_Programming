package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P84 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p84);

        b1=(Button) findViewById(R.id.button94);

        t1=(TextView) findViewById(R.id.textView172);
        t2=(TextView) findViewById(R.id.textView173);

        t1.setText("#include<stdio.h> \n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "  struct student\n" +
                "  {\n" +
                "  \tchar name[30], sex[1];\n" +
                "  \tint rollno;\n" +
                "  \tfloat percentage;\n" +
                "  };\n" +
                "  union details\n" +
                "  {\n" +
                "  \tstruct student st;\n" +
                "  };\n" +
                "  union details set;\n" +
                "  printf(\"Enter details:\");\n" +
                "  printf(\"\\nEnter name : \");\n" +
                "  scanf(\"%s\", set.st.name);\n" +
                "  printf(\"Enter roll no : \");\n" +
                "  scanf(\"%d\", &set.st.rollno);\n" +
                "  printf(\"Enter sex : \");\n" +
                "  scanf(\"%s\", &set.st.sex);\n" +
                "  printf(\"Enter percentage :\");\n" +
                "  scanf(\"%f\", &set.st.percentage);\n" +
                "  printf(\"\\nThe student details are : \\n\");\n" +
                "  printf(\"\\name : %s\", set.st.name);\n" +
                "  printf(\"\\nRollno : %d\", set.st.rollno);\n" +
                "  printf(\"\\nSex : %s\", set.st.sex);\n" +
                "  printf(\"\\nPercentage : %f\", set.st.percentage);\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter Details :\n" +
                "Enter Name : Abhay\n" +
                "Enter roll no : 101\n" +
                "Enter sex : M\n" +
                "Enter percentage : 92\n" +
                "\n" +
                "The student details are:\n" +
                "Name : Abhay\n" +
                "Roll No : 101\n" +
                "Sex : M\n" +
                "Percentage : 92.000000");

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
