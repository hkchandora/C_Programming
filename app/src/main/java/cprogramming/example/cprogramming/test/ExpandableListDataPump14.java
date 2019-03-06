package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump14 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("An argument is an entity usse to pass the data from calling function to the called function\n" +
                "Formal arguments are the arguments available in the function definition. They are preceded by their own data types. " +
                "Actual arguments are available in the function call.");

        List<String> second = new ArrayList<String>();
        second.add("Getting the arguments from command prompt in c is known as command line arguments.\n" +
                "In c main function has three arguments. They are:\n" +
                "- Argument counter\n" +
                "- Argument vector\n" +
                "- Environment vector");

        List<String> third = new ArrayList<String>();
        third.add("By declaring it with a variable number of arguments in the prototype. Use only the arguments declared at any given time");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Redefine printf; the call to \"printf\" inside yours will be resolved to the library version, because the C " +
                "language doesn't allow recursion.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("It will probably work some of the time; the number of arguments used by printf() may vary, as it is a variadic function.");


        expandableListDetail.put("What is an argument? Differentiate between formal arguments and actual arguments?", first);
        expandableListDetail.put("What is command line argument?", second);
        expandableListDetail.put("How can I write a function that take a variable number of arguments?", third);
        expandableListDetail.put("How can I write a function that takes a format string and a variable number of arguments, like printf, " +
                "and passes them to printf to do most of the work?", fourth);
        expandableListDetail.put("Why doesn't printf(\"hello,\",\"world!\",'\\n'); work? I thought printf() took a variable " +
                "number of arguments.)", fifth);
        return expandableListDetail;
    }
}