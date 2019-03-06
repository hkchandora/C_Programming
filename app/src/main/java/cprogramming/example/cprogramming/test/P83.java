package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class P83 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p83);

        b1=(Button) findViewById(R.id.button93);

        t1=(TextView) findViewById(R.id.textView170);
        t2=(TextView) findViewById(R.id.textView171);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>" +
                "#define SIZE 50\n" +
                "struct student\n" +
                "{\n" +
                "  char name[30];\n" +
                "  int rollno;\n" +
                "  int sub[3];\n" +
                "  int total;\n" +
                "};\n" +
                "\n" +
                "void main()\n" +
                "{\n" +
                "  int i, j, max, count, tot=0, n, a[SIZE], ni;\n" +
                "  struct student st[SIZE];\n" +
                "  printf(\"Enter how many students: \");\n" +
                "  scanf(\"%d\", &n);\n" +
                "  for (i = 0; i < n; i++)\n" +
                "  {\n" +
                "  \ttot=0;\n" +
                "  \tprintf(\"\\nEnter name and roll number for student %d : \", i+1);\n" +
                "  \tscanf(\"%s\", &st[i].name);\n" +
                "  \tscanf(\"%d\", &st[i].rollno);\n" +
                "  \tfor (j = 0; j < = 2; j++)\n" +
                "  \t{\n" +
                "    \tprintf(\"Enter marks of student %d for subject %d : \", i+1, j+1);\n" +
                "    \tscanf(\"%d\", &st[i].sub[j]);\n" +
                "    \ttot = tot+st[i].sub[j];\n" +
                "  \t}\n" +
                "  \tst[i].total = tot;\n" +
                "\t}\n" +
                "  printf(\"\\n\\n\\n\");\n" +
                "  for(i=0; i < n; i++)\n" +
                "  {\n" +
                "  \tprintf(\"Student %d Name : %s \\n\",i+1,st[i].name);\n" +
                "  \tprintf(\"Student %d Rollno: %d \\n\",i+1,st[i].rollno);\n" +
                "  \tfor (j = 0; j <= 2; j++)\n" +
                "  \t{\n" +
                "    \tprintf(\"marks of subject %d : %d \\n\", j+1, st[i].sub[j]);\n" +
                "  \t}\n" +
                "  \tprintf(\"Total marks : %d \\n\\n\",st[i].total);\n" +
                "  }\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter how many students: 2\n" +
                "Enter name and roll number for student 1 : Bhagya 1001\n" +
                "Enter marks of student 1 for subject 1 :79\n" +
                "Enter marks of student 1 for subject 2 :82\n" +
                "Enter marks of student 1 for subject 3 :75\n\n" +
                "Enter name and roll number for student 1 : Bhavik 1002\n" +
                "Enter marks of student 2 for subject 1 :75\n" +
                "Enter marks of student 2 for subject 2 :83\n" +
                "Enter marks of student 2 for subject 3 :74\n\n\n" +
                "Student 1 Name : Bhagya\n" +
                "Student 1 Roll no : 1001\n" +
                "Marks of subject 1 : 79\n" +
                "Marks of subject 2 : 82\n" +
                "Marks of subject 3 : 75\n" +
                "Total marks : 236\n\n" +
                "Student 2 Name : Bhavik\n" +
                "Student 2 Roll no : 1002\n" +
                "Marks of subject 1 : 75\n" +
                "Marks of subject 2 : 83\n" +
                "Marks of subject 3 : 74\n" +
                "Total marks : 232");

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
