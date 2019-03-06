package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump11 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Break the '%' sign out. i.e. fprintf(\"foo\"\"%\"\"\"%d\\n\",foo); Alternative, try sprintf(\"o\"\"\\\"\"o\") " +
                "to get a \"%\". The astute reader will notice that latter example uses sprintf, and the former fprintf - this is because " +
                "sprintf() works by character, or strings, while fprintf(\"fast printf\") work on files.");

        List<String> second = new ArrayList<String>();
        second.add("You need to do this a bit differently; you should always check for the return from scanf, so try something like i=1; " +
                "if((scanf,\"%d\",i) == 1) to make sure you're reading correctly. (The assignment tto i is so that, if scanf fails, you " +
                "still have a legal value in i.)");

        List<String> third = new ArrayList<String>();
        third.add("Call main() - the environment will be restored. ");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Because they're try to spoil your fun. gets() can make an otherwise droll and predictable program a lot " +
                "more exciting.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("Try to rebuild again.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("Ask the user to press enter after hitting a single character.");

        List<String> seventh = new ArrayList<String>();
        seventh.add("They've been programming more than ten years. You haven't. Draw your own conclusion. That's right! They hadn't " +
                "noticed it. No doubt their compilers have it too, and its behavior is identical everywhere else in the world, also. " +
                "That would explain everything");

        List<String> eighth = new ArrayList<String>();
        eighth.add("Well, that would depend on the definition you're using for \"works\".");

        List<String> ninth = new ArrayList<String>();
        ninth.add("execlv(\"main()\"\">file\",argv);");

        expandableListDetail.put("How can i print a \"%\" character in a printf format string? I tried \"\\%\" but it didn't work?", fifth);
        expandableListDetail.put("Why doesn't the code scanf(\"%d\",i); work?", second);
        expandableListDetail.put("Once I've used freoprn, how can i get the original stdout(or stdin) back?", third);
        expandableListDetail.put("Why does everyone say not to use gets()?", fourth);
        expandableListDetail.put("My program's prompts and intermediate output don't always show up on the screen, especially when " +
                "i pipe the output through another program?", fifth);
        expandableListDetail.put("How can I read one character at a time, without waiting for the RETURN key?", sixth);
        expandableListDetail.put("People keep telling me that getch() is not standard, but my C compiler has it. Are they wrong?", seventh);
        expandableListDetail.put("What does it matter that getch() isn't standard; it works,doesn't it?", eighth);
        expandableListDetail.put("How can I redirect stdin or stdout to a file from within a program?", ninth);
        return expandableListDetail;
    }
}