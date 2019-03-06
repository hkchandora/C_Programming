package cprogramming.example.cprogramming.test;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class P87 extends AppCompatActivity {

    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p87);

        b1=(Button) findViewById(R.id.button97);

        t1=(TextView) findViewById(R.id.textView178);
        t2=(TextView) findViewById(R.id.textView179);

        t1.setText("#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<conio.h>\n" +
                "int main()\n" +
                "{\n" +
                "  FILE *fs1, *fs2, *ft;\n" +
                "  char ch, file1[20], file2[20], file3[20];\n" +
                "  printf(\"Enter name of first file\\n\");\n" +
                "  gets(file1);\n" +
                "  printf(\"Enter name of second file\\n\");\n" +
                "  gets(file2);\n" +
                "  printf(\"Enter name of file which will store contents of two files\\n\");\n" +
                "  gets(file3);\n" +
                "  fs1 = fopen(file1,\"r\");\n" +
                "  fs2 = fopen(file2,\"r\");\n" +
                "  if( fs1 == NULL || fs2 == NULL )\n" +
                "  {\n" +
                "  \tperror(\"Error \");\n" +
                "  \tprintf(\"Press any key to exit...\\n\");\n" +
                "  \tgetch();\n" +
                "  \texit(EXIT_FAILURE);\n" +
                "  }\n" +
                "  ft = fopen(file3,\"w\");\n" +
                "  if( ft == NULL )\n" +
                "  {\n" +
                "  \tperror(\"Error \");\n" +
                "  \tprintf(\"Press any key to exit...\\n\");\n" +
                "  \texit(EXIT_FAILURE);\n" +
                "  }\n" +
                "  while( ( ch = fgetc(fs1) ) != EOF )\n" +
                "  \tfputc(ch,ft);\n" +
                "  while( ( ch = fgetc(fs2) ) != EOF )\n" +
                "  \tfputc(ch,ft);\n" +
                "  printf(\"Two files were merged into %s file successfully.\\n\",file3);\n" +
                "  fclose(fs1);\n" +
                "  fclose(fs2);\n" +
                "  fclose(ft);\n" +
                "  getch();\n" +
                "}");

        t2.setText("Enter name of first file\n" +
                "data.c\n" +
                "Enter name of second file\n" +
                "factorial.c\n" +
                "Enter name of file which will store contents of two files\n" +
                "data-factorial.c\n" +
                "Two files were merged into data-factorial.c file successfully.");

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
