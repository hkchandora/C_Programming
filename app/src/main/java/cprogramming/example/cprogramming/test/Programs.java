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
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cprogramming.example.cprogramming.test.Program.*;
import cprogramming.example.cprogramming.test.adapter.ProgramItemAdapter;


public class Programs extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayAdapter<String> arrayAdapter;

    String[] title = new String[]{"1) Hello World", "2) Print Integer", "3) Addition of two no", "4) Area of triangle", "5) Odd or Even",
            "6) Add subtract multiply divide", "7) Add n numbers", "8) Add digits", "9) Greatest of 3 numbers", "10) Swapping 2 numbers",
            "11) Nested If Else", "12) Calculate percentage", "13) Calculate Gross  salary", "14) Simple interest", "15) Area of Circle",
            "16) Area of Rectangle", "17) Area of Square", "18) Volume of Cube", "19) Volume of Cylinder", "20) Volume of Sphere",
            "21) Chech Vowel", "22) Leap Year", "23) HCF and LCM", "24) nCr and nPr", "25) Reverse number",
            "26) Reverse number using array", "27) Palindrome number", "28) Prime numbers", "29) Perfect number", "30) Find armstrong number",
            "31) Generate armstrong number", "32) Temperature convesion", "33) Factorial using function", "34) Factorial using recursion", "35) Fibonacci series using loop",
            "36) Fibonacci series using recursion", "37) Sine Series", "38) Cosine Series", "39) Print Pattern", "40) Diamond Pattern",
            "41) Print floyd's triangle", "42) Print pascal triangle", "43) Decimal to binary bitwise", "44) Decimal to Binary", "45) Decimal to Octal",
            "46) Binary to Decimal", "47) Binary to Octal", "48) Binary to Hexadecimal", "49) Maximum element in array", "50) Minimum element in array",
            "51) Reverse Array", "52) Insert element in array", "53) Delete element from array", "54) Merge array", "55) Add Matrices",
            "56) Subtract Matrices", "57) Transpose Matrix", "58) Multiply two matrices", "59) Linear search", "60) Binary search",
            "61) Binary search using recursion", "62) Bubble Sort", "63) Insertion Sort", "64) Print string", "65) String Length",
            "66) Compare String ", "67) Copy String", "68) Concatenate Strings", "69) Reverse String", "70) Find Palindrome",
            "71) Change case", "72) Delete vowels", "73) C substring", "74) Sort a String", "75) Remove spaces",
            "76) Swap String", "77) Character's frequency", "78) Anagrams", "79) Addition using pointers", "80) Reverse array using pointer",
            "81) Sum of array using pointer", "82) Length of array using pointer", "83) Structure", "84) Union", "85) Read file",
            "86) Copy file", "87) Merge two file", "88) List files in a directory", "89) Delete file", "90) Random numbers",
            "91) Call by Value", "92) Call by Reference", "93) Add complex numbers", "94) Swap two numbers without 3rd variable", "95) Print source code of program",
            "96) Password text mask", "97) Print date", "98) Get IP address", "99) Shutdown computer", "100) Merge 2 files contain and display."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

        recyclerView = findViewById(R.id.listView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProgramItemAdapter(this, title));


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