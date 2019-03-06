package cprogramming.example.cprogramming.test;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Programs extends AppCompatActivity {

    private ListView lv;
    ArrayAdapter<String> arrayAdapter;

    String[] planets = new String[]{"1) Hello World", "2) Print Integer", "3) Addition of two no", "4) Area of triangle", "5) Odd or Even",
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

        lv = (ListView) findViewById(R.id.listView2);

        //arrayAdapter = new ArrayAdapter<String>(Programs.this, R.layout.activity_programs, R.id.listView2, planets);
        arrayAdapter = new ArrayAdapter<String>(Programs.this, R.layout.list_items, R.id.textView, planets);

        // Assign adapter to ListView
        lv.setAdapter(arrayAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), P1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), P2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), P3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), P4.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), P5.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), P6.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), P7.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), P8.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), P9.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), P10.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), P11.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), P12.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), P13.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), P14.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), P15.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), P16.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), P17.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), P18.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), P19.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), P20.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), P21.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), P22.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), P23.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), P24.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), P25.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), P26.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 26) {
                    Intent myIntent = new Intent(view.getContext(), P27.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 27) {
                    Intent myIntent = new Intent(view.getContext(), P28.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 28) {
                    Intent myIntent = new Intent(view.getContext(), P29.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 29) {
                    Intent myIntent = new Intent(view.getContext(), P30.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 30) {
                    Intent myIntent = new Intent(view.getContext(), P31.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 31) {
                    Intent myIntent = new Intent(view.getContext(), P32.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 32) {
                    Intent myIntent = new Intent(view.getContext(), P33.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 33) {
                    Intent myIntent = new Intent(view.getContext(), P34.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 34) {
                    Intent myIntent = new Intent(view.getContext(), P35.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 35) {
                    Intent myIntent = new Intent(view.getContext(), P36.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 36) {
                    Intent myIntent = new Intent(view.getContext(), P37.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 37) {
                    Intent myIntent = new Intent(view.getContext(), P38.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 38) {
                    Intent myIntent = new Intent(view.getContext(), P39.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 39) {
                    Intent myIntent = new Intent(view.getContext(), P40.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 40) {
                    Intent myIntent = new Intent(view.getContext(), P41.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 41) {
                    Intent myIntent = new Intent(view.getContext(), P42.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 42) {
                    Intent myIntent = new Intent(view.getContext(), P43.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 43) {
                    Intent myIntent = new Intent(view.getContext(), P44.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 44) {
                    Intent myIntent = new Intent(view.getContext(), P45.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 45) {
                    Intent myIntent = new Intent(view.getContext(), P46.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 46) {
                    Intent myIntent = new Intent(view.getContext(), P47.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 47) {
                    Intent myIntent = new Intent(view.getContext(), P48.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 48) {
                    Intent myIntent = new Intent(view.getContext(), P49.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 49) {
                    Intent myIntent = new Intent(view.getContext(), P50.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 50) {
                    Intent myIntent = new Intent(view.getContext(), P51.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 51) {
                    Intent myIntent = new Intent(view.getContext(), P52.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 52) {
                    Intent myIntent = new Intent(view.getContext(), P53.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 53) {
                    Intent myIntent = new Intent(view.getContext(), P54.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 54) {
                    Intent myIntent = new Intent(view.getContext(), P55.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 55) {
                    Intent myIntent = new Intent(view.getContext(), P56.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 56) {
                    Intent myIntent = new Intent(view.getContext(), P57.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 57) {
                    Intent myIntent = new Intent(view.getContext(), P58.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 58) {
                    Intent myIntent = new Intent(view.getContext(), P59.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 59) {
                    Intent myIntent = new Intent(view.getContext(), P60.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 60) {
                    Intent myIntent = new Intent(view.getContext(), P61.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 61) {
                    Intent myIntent = new Intent(view.getContext(), P62.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 62) {
                    Intent myIntent = new Intent(view.getContext(), P63.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 63) {
                    Intent myIntent = new Intent(view.getContext(), P64.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 64) {
                    Intent myIntent = new Intent(view.getContext(), P65.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 65) {
                    Intent myIntent = new Intent(view.getContext(), P66.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 66) {
                    Intent myIntent = new Intent(view.getContext(), P67.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 67) {
                    Intent myIntent = new Intent(view.getContext(), P68.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 68) {
                    Intent myIntent = new Intent(view.getContext(), P69.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 69) {
                    Intent myIntent = new Intent(view.getContext(), P70.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 70) {
                    Intent myIntent = new Intent(view.getContext(), P71.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 71) {
                    Intent myIntent = new Intent(view.getContext(), P72.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 72) {
                    Intent myIntent = new Intent(view.getContext(), P73.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 73) {
                    Intent myIntent = new Intent(view.getContext(), P74.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 74) {
                    Intent myIntent = new Intent(view.getContext(), P75.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 75) {
                    Intent myIntent = new Intent(view.getContext(), P76.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 76) {
                    Intent myIntent = new Intent(view.getContext(), P77.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 77) {
                    Intent myIntent = new Intent(view.getContext(), P78.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 78) {
                    Intent myIntent = new Intent(view.getContext(), P79.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 79) {
                    Intent myIntent = new Intent(view.getContext(), P80.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 80) {
                    Intent myIntent = new Intent(view.getContext(), P81.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 81) {
                    Intent myIntent = new Intent(view.getContext(), P82.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 82) {
                    Intent myIntent = new Intent(view.getContext(), P83.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 83) {
                    Intent myIntent = new Intent(view.getContext(), P84.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 84) {
                    Intent myIntent = new Intent(view.getContext(), P85.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 85) {
                    Intent myIntent = new Intent(view.getContext(), P86.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 86) {
                    Intent myIntent = new Intent(view.getContext(), P87.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 87) {
                    Intent myIntent = new Intent(view.getContext(), P88.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 88) {
                    Intent myIntent = new Intent(view.getContext(), P89.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 89) {
                    Intent myIntent = new Intent(view.getContext(), P90.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 90) {
                    Intent myIntent = new Intent(view.getContext(), P91.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 91) {
                    Intent myIntent = new Intent(view.getContext(), P92.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 92) {
                    Intent myIntent = new Intent(view.getContext(), P93.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 93) {
                    Intent myIntent = new Intent(view.getContext(), P94.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 94) {
                    Intent myIntent = new Intent(view.getContext(), P95.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 95) {
                    Intent myIntent = new Intent(view.getContext(), P96.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 96) {
                    Intent myIntent = new Intent(view.getContext(), P97.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 97) {
                    Intent myIntent = new Intent(view.getContext(), P98.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 98) {
                    Intent myIntent = new Intent(view.getContext(), P99.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 99) {
                    Intent myIntent = new Intent(view.getContext(), P100.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Programs");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "This is C Programming App.\nHere, We Easy to Learn C Programming Language.\n" +
                        "Best Proper Tutorials, 100+ Programs with output, And Many Questions-Answers & Exam Questions also.\n" +
                        "Download it :-\n" +
                        "https://play.google.com/store/apps/details?id=cprogramming.example.cprogramming.test";
                String shareSub = "C Programming App";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                return true;
            case R.id.reference:
                Intent i = new Intent(Programs.this,Reference.class);
                startActivity(i);
                return true;
            case R.id.about:
                Intent i2 = new Intent(Programs.this,About.class);
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
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_example, menu);

        // Inflate the options menu from XML
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        //return true;

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_bar1).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}