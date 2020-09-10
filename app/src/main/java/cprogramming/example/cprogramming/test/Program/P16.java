package cprogramming.example.cprogramming.test.Program;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class P16 extends AppCompatActivity {
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p16);

        b1=(Button) findViewById(R.id.button26);

        t1=(TextView) findViewById(R.id.textView36);
        t2=(TextView) findViewById(R.id.textView37);

        t1.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "\tclrcsr();\n" +
                "\tint length,breath,area;\n" +
                "\tprintf(\"Enter the Length of Rectangle = \");\n" +
                "\tscanf(\"%d\",&length);\n" +
                "\tprintf(\"Enter the Breath of Rectangle = \");\n" +
                "\tscanf(\"%d\",&breath);\n" +
                "\tarea = length*breath;\n" +
                "\tprintf(\"Area of Rectangle is = %d\",area);\n" +
                "\tgetch();\n" +
                "}");

        t2.setText("Enter the Length of Rectangle = 12\n" +
                "Enter the Breath of Rectangle = 10\n" +
                "Area of Rectangle is = 120");

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
