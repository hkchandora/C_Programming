package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;

public class P86 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p86);

        b1=(Button) findViewById(R.id.button96);

        t1=(TextView) findViewById(R.id.textView176);
        t2=(TextView) findViewById(R.id.textView177);

        t1.setText("#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "  char ch, source_file[20], target_file[20];\n" +
                "  FILE *source, *target;\n" +
                "  printf(\"Enter name of file to copy\\n\");\n" +
                "  gets(source_file);\n" +
                "  source = fopen(source_file, \"r\");\n" +
                "  if( source == NULL )\n" +
                "  {\n" +
                "  \tprintf(\"Press any key to exit...\\n\");\n" +
                "  \texit(EXIT_FAILURE);\n" +
                "  }\n" +
                "  printf(\"Enter name of target file\\n\");\n" +
                "  gets(target_file);\n" +
                "  target = fopen(target_file, \"w\");\n" +
                "  if( target == NULL )\n" +
                "  {\n" +
                "  \tfclose(source);\n" +
                "  \tprintf(\"Press any key to exit...\\n\");\n" +
                "  \texit(EXIT_FAILURE);\n" +
                "  }\n" +
                "  while( ( ch = fgetc(source) ) != EOF )\n" +
                "  \tfputc(ch, target);\n" +
                "  printf(\"File copied successfully.\\n\");\n" +
                "  fclose(source);\n" +
                "  fclose(target);\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter name of file to copy\n" +
                "Prime.c\n" +
                "Enter name of target file\n" +
                "Prime-copy.c\n" +
                "File copied successfully.");

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
