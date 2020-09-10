package cprogramming.example.cprogramming.test.Tutorial;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.R;


public class T22 extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t22);

        b1 = (Button)findViewById(R.id.button132);

        t1 = (TextView)findViewById(R.id.textView227);

        t1.setText("A string is simply an array of characters which is terminated by a null character '\\0' which shows the end of the string. \n" +
                "Strings are always enclosed by double quotes. Whereas, character is enclosed by single quotes in C. \n" +
                "\n" +
                "This declaration and initialization create a string with the word \"AKKI\".\n" +
                "To hold the \\0 (null character) at the end of the array, the size of array is one more than the number of characters in the word \"AKKI\".\n" +
                "\n" +
                "char my_name[5] = {'A', 'K', 'K', 'I','\\0'};\n" +
                "\n" +
                "we can also write the above statement as follows:\n" +
                "char my_name[] = \"AKKI\";\n" +
                "\n" +
                "C String functions:\n" +
                "\n" +
                "To use string functions programmer must import String.h header file. \n" +
                "String.h header file supports all the string functions in C language. \n" +
                "\n" +
                "All the string functions are given below.\n" +
                "1. strcat ( ) \tConcatenates str2 at the end of str1.\n" +
                "\n" +
                "2. strncat ( ) \t appends a portion of string to another\n" +
                "\n" +
                "3. strcpy ( ) \t Copies str2 into str1\n" +
                "\n" +
                "4. strncpy ( ) \t copies given number of characters of one string to another\n" +
                "\n" +
                "5. strlen ( ) \t gives the length of str1.\n" +
                "\n" +
                "6. strcmp ( ) \t Returns 0 if str1 is same as str2. Returns 0 if str1 > str2.\n" +
                "\n" +
                "7. strcmpi ( ) \t Same as strcmp() function. But, this function negotiates case. ''A'' and ''a'' are treated as same.\n" +
                "\n" +
                "8. strchr ( ) \t Returns pointer to first occurrence of char in str1.\n" +
                "\n" +
                "9. strrchr ( ) \t last occurrence of given character in a string is found\n" +
                "\n" +
                "10. strstr ( ) \t Returns pointer to first occurrence of str2 in str1.\n" +
                "\n" +
                "11. strrstr ( ) \t Returns pointer to last occurrence of str2 in str1.\n" +
                "\n" +
                "12. strdup ( ) \t duplicates the string\n" +
                "\n" +
                "13. strlwr ( ) \t converts string to lowercase\n" +
                "\n" +
                "14. strupr ( ) \t converts string to uppercase\n" +
                "\n" +
                "15. strrev ( ) \t reverses the given string\n" +
                "\n" +
                "16. strset ( ) \t sets all character in a string to given character\n" +
                "\n" +
                "17. strnset ( ) \t It sets the portion of characters in a string to given character\n" +
                "\n" +
                "18. strtok ( ) \t tokenizing given string using delimiter\n" +
                "\n" +
                "See Programs section of this app for example of this functions \t \n");


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
