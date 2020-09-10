package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T24 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t24);

        b1 = (Button)findViewById(R.id.button134);

        t1 = (TextView)findViewById(R.id.textView229);

        t1.setText("C Union is also like structure, i.e. collection of different data types which are grouped together. Each element in a union is called member.\n" +
                "\n" +
                "Union and structure both are same, except allocating memory for their members. Structure allocates storage space for each member separately. Whereas, Union allocates one common storage space for all its members.\n" +
                "\n" +
                "Syntax\n" +
                "\n" +
                "union tag_name\n" +
                "{\n" +
                "\tdata type var_name1;\n" +
                "\tdata type var_name2;\n" +
                "\tdata type var_name3;\n" +
                "};\n" +
                "\n" +
                "Example \n" +
                "\n" +
                "\t union student\n" +
                "{\n" +
                "\tint id;\n" +
                "\tchar name[10];\n" +
                "\tchar address[50];\n" +
                "};\n" +
                "\n" +
                "Initializing and Declaring union variable \t\n" +
                "\n" +
                "union student data;\n" +
                "union student data = {001,''AKKI'', ''mumbai''};\n" +
                "\n" +
                "Accessing union members \t\n" +
                "\n" +
                "data.id\n" +
                "data.name\n" +
                "data.address\n");



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tutorials");
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
