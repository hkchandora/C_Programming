package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump12 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Library Function are predefined functions and stored in .lib files.");

        List<String> second = new ArrayList<String>();
        second.add("Prototype of printf function is: int printf(const char*format ,....)");

        List<String> third = new ArrayList<String>();
        third.add("When a function of body calls the same function then it is called as 'recursive function'");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Yes, we can rename any function using typedef keyword. It is useful when function declaration is too complex and " +
                "we have to give any simple name or if we have to create more numbers of function of the same type.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("There's frequently an itoa function. Better yet, write your own; it'll be good practice. On some implementations,(char*)" +
                "x; will convert x to a string.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("fprintf(stderr.\"please enter the current time and date...\"); fflush(stderr); gets(stdin);");

        List<String> seventh = new ArrayList<String>();
        seventh.add("use random(int) function.");

        List<String> eighth = new ArrayList<String>();
        eighth.add("random(n) returns random numbers between n and INT_MAX.");

        List<String> ninth = new ArrayList<String>();
        ninth.add("This is so your results will be reproducible.");

        expandableListDetail.put("What are library Functions?", first);
        expandableListDetail.put("What is prototype of printf function?", second);
        expandableListDetail.put("What is function recursion?", third);
        expandableListDetail.put("Is it possible to rename any function in c?", fourth);
        expandableListDetail.put("How can i convert number to string (the opposite of atoi)? Is there an itoa function?", fifth);
        expandableListDetail.put("How can I get the current date or time of day in a C program?", sixth);
        expandableListDetail.put("I need a random number generator?", seventh);
        expandableListDetail.put("How can I get random integers in a certain range?", eighth);
        expandableListDetail.put("Each time I run my program, I get the same sequence of numbers back form rand()?", ninth);
        return expandableListDetail;
    }
}