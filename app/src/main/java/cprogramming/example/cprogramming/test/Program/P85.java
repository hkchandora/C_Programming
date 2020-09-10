package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P85 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p85);

        b1=(Button) findViewById(R.id.button95);

        t1=(TextView) findViewById(R.id.textView174);
        t2=(TextView) findViewById(R.id.textView175);

        t1.setText("#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<conio.h>" +
                "void main()\n" +
                "{\n" +
                "  char ch, file_name[25];\n" +
                "  FILE *fp;\n" +
                "  printf(\"Enter the name of file you wish to see\\n\");\n" +
                "  gets(file_name);\n" +
                "  fp = fopen(file_name,\"r\"); // read mode\n" +
                "  if( fp == NULL )\n" +
                "  {\n" +
                "    perror(\"Error while opening the file.\\n\");\n" +
                "    exit(EXIT_FAILURE);\n" +
                "  }\n" +
                "  printf(\"The contents of %s file are :\\n\", file_name);\n" +
                "  while((ch=fgetc(fp)) != EOF)\n" +
                "  {\n" +
                "  \tprintf(\"%c\",ch);\n" +
                "  }\n" +
                "  fclose(fp);\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter the name of file you wish to see\nCprogram.txt\n" +
                "The contents of computer-programming.txt file are:\n" +
                        "computer programming is fun.\n" +
                        "\n" +
                        "Process returned 0(0x0)  execution time : 8.697 s\n" +
                        "Press any key to continue.");


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
