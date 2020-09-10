package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;

public class T25 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t25);

        b1 = (Button)findViewById(R.id.button135);

        t1 = (TextView)findViewById(R.id.textView230);

        t1.setText("1) File Pointers\n" +
                "\n" +
                "It is not enough to just display the data on the screen. We need to save it because memory is volatile and its contents would be lost once program terminated, so if we need some data again there are two ways one is retype via keyboard to assign it to particular variable, and other is regenerate it via programmatically both options are tedious. At such time it becomes necessary to store the data in a manner that can be later retrieved and displayed either in part or in whole. This medium is usually a ''file'' on the disk.\n" +
                "\n" +
                "Introduction to file\n" +
                "\tUntil now we have been using the functions such as scanf,printf, getch, putch etc to read and write data on the variable and arrays for storing data inside the programs. But this approach poses the following programs.\n" +
                "1.\tThe data is lost when program terminated or variable goes out of scope.\n" +
                "2.\tDifficulty to use large volume of data.\n" +
                "\n" +
                "We can overcome these problems by storing data on secondary devices such as Hard Disk. The data is storage on the devices using the concept of ''file''.\n" +
                "\n" +
                "\t A file is collection of related records, a record is composed of several fields and field is a group of character.\n" +
                "\n" +
                "The most straightforward use of files is via a file pointer.\n" +
                "\n" +
                "  FILE *fp;\n" +
                "fp is a pointer to a file.\n" +
                "\n" +
                "The type FILE, is not a basic type, instead it is defined in the header file stdio.h , this file must be included in your program.\n" +
                "\n\n" +
                "2) File Operations\n" +
                "\n" +
                "1.\tCreate a new file.\n" +
                "2.\tOpen an existing file\n" +
                "3.\tRead from file\n" +
                "4.\tWrite to a file\n" +
                "5.\tMoving a specific location in a file(Seeking)\n" +
                "6.\tClosing File\n" +
                "\n\n" +
                "3) Opening a File\n" +
                "\n" +
                "fp = fopen(filename, mode);\n" +
                "\n" +
                "The filename and mode are both strings.\n" +
                "\n" +
                "Here modes can be\n" +
                "\"r\" read\n" +
                "\"w\" write, overwrite file if it exists\n" +
                "\"a\" write, but append instead of overwrite\n" +
                "\"r+\" read & write, do not destroy file if it exists\n" +
                "\"w+\" read & write, but overwrite file if it exists\n" +
                "\"a+\" read & write, but append instead of overwrite\n" +
                "\"b\" may be appended to any of the above to force the file to be opened in binary mode rather than text mode.\n" +
                "\n" +
                "Eg.\n" +
                "FILE *fp;\n" +
                "\tfp=fopen(''input.txt'',''r'');\n" +
                "\t//Opens inputs.txt file in read mode\n" +
                "\tfclose(fp); //close file\n" +
                "\n" +
                "Sequential file access is performed with the following library functions.\n" +
                "\n" +
                "1. fopen() - Create a new file\n" +
                "2. fclose() - Close file\n" +
                "3. getc() - Read character from file\n" +
                "4. putc() - Write character to a file\n" +
                "5. getw() - Read Integer from file\n" +
                "6. putw() - Write Integer to a file\n" +
                "7. fprintf() - Write set of data values\n" +
                "8. fscanf() - Read set of data values\n");




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
