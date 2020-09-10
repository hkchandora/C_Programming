package cprogramming.example.cprogramming.test.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump1 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Use\"short\" when you need to avoid values over 32,767,\n" +
                "\"int\" when you want to store integers,\n" +
                "\"long\" for long number(more than 6 digits),and\n" +
                "\"float\" for number over 4 billion");

        List<String> second = new ArrayList<String>();
        second.add("int");

        List<String> third = new ArrayList<String>();
        third.add("Only sometimes. It's not portable,because in EBCDIC, i and j are not adjacent");

        List<String> fourth = new ArrayList<String>();
        fourth.add("In headers;this way,you can get link error when you include the same header twice. Generally, you will have to define a variable everywhere you want to use it, and than declare it someplace so you know what it is.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("Long ints can be entered using hexadecimal notation; for instance, long int foo = 07; set foo to hex 7.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("Switch statement is generally best to use when you have more than two conditional expressions based on a single variable of numeric type.");

        expandableListDetail.put("If I write the code int i,j; can I assume that(&i+1)==&j?", third);
        expandableListDetail.put("How do you device which integer type to use?", first);
        expandableListDetail.put("What should the 64-bit type on new ,64-bit machines be?", second);
        expandableListDetail.put("What's the best way to declare and define global variables?", fourth);
        expandableListDetail.put("When is a switch statement better than multiple if statements?", sixth);
        expandableListDetail.put("How do I enter values using hexadecimal?", fifth);
        return expandableListDetail;
    }
}