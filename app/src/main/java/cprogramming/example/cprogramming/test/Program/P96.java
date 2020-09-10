package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P96 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p96);

        b1=(Button) findViewById(R.id.button106);

        t1=(TextView) findViewById(R.id.textView196);
        t2=(TextView) findViewById(R.id.textView197);

        t1.setText("#include < stdio.h > \n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "  char password[10],username[10], ch;\n" +
                "  int i;\n" +
                "  printf(\"Enter User name: \");\n" +
                "  gets(username);\n" +
                "  printf(\"Enter the password : \");\n" +
                "  for(i=0;i < 8;i++)\n" +
                "  {\n" +
                "  \tch = getch();\n" +
                "  \tpassword[i] = ch;\n" +
                "  \tch = '*' ;\n" +
                "  \tprintf(\"%c\",ch);\n" +
                "  }\n" +
                "  password[i] = '\\0';\n" +
                "  printf(\"\\n\\nYour username is : %s \",username);\n" +
                "  printf(\"\\nYour password is : %s\",password);\n" +
                "  getch();\n" +
                "}\n");

        t2.setText("Enter User name: Himanshu\nEnter the password : ********\n\nYour username is : Himanshu\nYour password is : kuma wat");

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
