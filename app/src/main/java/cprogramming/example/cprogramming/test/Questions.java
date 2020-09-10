package cprogramming.example.cprogramming.test;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cprogramming.example.cprogramming.test.adapter.QuestionItemAdapter;

public class Questions extends AppCompatActivity {
    private RecyclerView recyclerView;

    String[] text = new String[]{"----------> 2 Marks Questions <----------",
            "1) List out fundamental data types in C.",
            "2) Give any 2 differences between while and do while statements in C?",
            "3) What is an array? Define an array to store marks of 30 students in 3 subjects.",
            "4) what is Variable declaration and Variable initialization?",
            "5) What are preprocessor directives?",
            "6) Define Array.",
            "7) Define function.",
            "8) What are bitwise operators available in C?",
            "9) Give any 2 differences between Structures & union.",
            "10) What does a storage class mean? Mention different storage classes available in C.",
            "11) What are enumerated  data type? Give an example.",
            "12) What is recursion? What are its advantages?",
            "13) Distinguish between variables and keywords with example.",
            "14) Mention different operators used in C with example.",
            "15) Give any two difference between call by value and call by reference?",
            "16) How do you pass parameters to main() function?",
            "17) What is pointer? Give its declaration.",
            "",
            "----------> 4/5 Marks Questions <----------",
            "1) What are keywords? List the rule for naming a variable in C.",
            "2) Write an algorithm to find the sum of numbers from 1 to N.",
            "3) Example the use of bitwise operators in C with examples.",
            "4) Write a function to exchange the values of two variables, say x and y.",
            "5) Demonstrate the usage of a switch statement with an example.",
            "6) With an example getch() and putch() function.",
            "7) Distinguish between while and do while.",
            "8) Write a program to check whether the given number is prime or not. Print the suitable messages.",
            "9) Using array declaration for fibonacci series, write a C program to generate first n terms.",
            "10) Write a C program to find largest number among 3 numbers.",
            "",
            "----------> 8/10 Marks Questions <----------",
            "1) Write a program to multiply 2 Matrices.",
            "2) Write a program using pointer to read an array of integers and print its elements in reverse order.",
            "3) Explain the different kinds of loopa available in C with example.",
            "4) Explain while loop structure with an example. Write thee flow chart also.",
            "5) Write a C program to simulate the basic operations of calculator.",
            "6) Write a C program to solve a quadratic equation using switch statement.",
            "7) Write a program to read 10 integers from the users and print the sum of even and odd numbers.",
            "8) Write a program to convert a given decimal number into its binary equivalent",
            "9) Give any five string manipulation library functions, with an example each.",
            "10) Explain all control statements."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        recyclerView = findViewById(R.id.listView3);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionItemAdapter(this, text));


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
            default:
                return  super.onOptionsItemSelected(item);
        }
    }
}
