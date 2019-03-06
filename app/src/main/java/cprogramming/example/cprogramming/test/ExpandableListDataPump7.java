package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump7 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("A major difference is: string will have static storage duration, whereas as a character array will not, unless " +
                "it is explicity specified by using the static keyword.");

        List<String> second = new ArrayList<String>();
        second.add("Some implementations provide a nonstandard function called itoa(), which converts an integer to string.");

        List<String> third = new ArrayList<String>();
        third.add("Both copy a string, strcpy wants a buffer to copy into.strdup allocates a buffer using malloc(). Unlike strcpy(), " +
                "strdup() is not specified by ANSI.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("sizeof is keyword of c which can find size of a string constant including null character but strlen is function which " +
                "has been defined string.h and can find number of characters in a string excluding null character.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("atoi() is a marco that converts integer to character.\n" +
                "itoa() It converts an integer to string\n" +
                "gcvt() It converts a floating point number to string");


        expandableListDetail.put("What is the difference between strings and character arrays?", first);
        expandableListDetail.put("Does there exist any other function which can be used to convert an integer or a float to a string?", second);
        expandableListDetail.put("Difference between strdup and strcpy?", third);
        expandableListDetail.put("what are differences between sizeof operator and strlen function?", fourth);
        expandableListDetail.put("What do the functions atoi(), itoa() and gcvt() do?", fifth);
        return expandableListDetail;
    }
}