package cprogramming.example.cprogramming.test;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Questions extends AppCompatActivity {
    ListView lv;

    String[] planets = new String[] {  "---------------> 2 Marks Questions <---------------",
            "1) List out fundamental data types in C.",
            "2) Give any 2 differences between while and do while statements in C?",
            "3) What is an array? Define an array to store marks of 30 students in 3 subjects.",
            "4) what is Variable declaration and Variable initialization?",
            "5) What are preprocessor directives?",
            "6) Define Array.",
            "7) Define function.",
            "8) What are bitwise operators avalible in C?",
            "9) Give any 2 differences between Structures & union.",
            "10) What does a storage class mean? Mention different storage classes available in C.",
            "11) What are enumerated  data type? Give an example.",
            "12) What is recursion? What are its advantages?",
            "13) Distinguish between variables and keywords with example.",
            "14) Mention different operators used in C with example.",
            "15) Give any two difference between call by value and call by reference?",
            "16) How do you pass parameters to main() function?",
            "17) What is pointer? Give its declaration.",
            "---------------> 4/5 Marks Questions <---------------",
            "1) What are keywords? List the rule for naming a variable in C.",
            "2) Write an algorithm to find the sum of numbers from 1 to N.",
            "3) Example the use of bitwise operators in C with examples.",
            "4) Write a function to exchange the values of two variables, say x and y.",
            "5) Demonstrate the usage of a switch stetement with an example.",
            "6) With an example getch() and putch() function.",
            "7) Distinguish between while and do while.",
            "8) Write a program to check whether the given number is prime or not. Print the suitable messages.",
            "9) Using array declaration for fibonacci serries, write a C program to generate first n terms.",
            "10) Write a C program to find largest number among 3 numbers.",
            "---------------> 8/10 Marks Questions <---------------",
            "1) Write a program to multiply 2 Matrices.",
            "2) Write a program using pointer to read an array of integers and print its elements in reverse order.",
            "3) Explain the different kinds of loopa available in C with example.",
            "4) Explain while loop structure with an example. Write thee flow chart also.",
            "5) Write a C program to simulate the basic operations of calculator.",
            "6) Write a C program to slove a quadratic equation using switch statement.",
            "7) Write a program to read 10 integers from the users and print the sum of even and odd numbers.",
            "8) Write a program to convert a given decimal number into its binary equivalent",
            "9) Give any five string mainpulation libraray functions, with an example each.",
            "10) Explain all control statements."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        lv=(ListView) findViewById(R.id.listView3);

        @SuppressWarnings("unchecked")
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, android.R.id.text1, planets);

        // Assign adapter to ListView
        lv.setAdapter(adapter);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Exams Questions");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "This is C Programming App.\nHere, We can Easy to Learn C Programming Language.\n" +
                        "Best Proper Tutorials, 100+ Programs with output, And Many Questions-Answers & Exam Questions also.\n" +
                        "Download it :-\n\n" +
                        "https://play.google.com/store/apps/details?id=cprogramming.example.cprogramming.test";
                String shareSub = "C Programming App";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                return true;
            case R.id.reference:
                Intent i = new Intent(Questions.this,Reference.class);
                startActivity(i);
                return true;
            case R.id.about:
                Intent i2 = new Intent(Questions.this,About.class);
                startActivity(i2);
                return true;
            case R.id.rate:
                Uri uri = Uri.parse("market://details?id=" + getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                }
                return true;
            default:
                return  super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return true;
    }

}
