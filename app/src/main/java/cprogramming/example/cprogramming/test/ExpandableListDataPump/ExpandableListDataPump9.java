package cprogramming.example.cprogramming.test.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump9 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Macro gets to see the Compilation environment, so it can expand _TIME__FILE__ #defines. It is expanded by the preprocessor.");

        List<String> second = new ArrayList<String>();
        second.add("file inclusion\nsubstitution facility\nconditional compilation");

        List<String> third = new ArrayList<String>();
        third.add("Macro is a Pre-processor. Major advantage of using the marco is to increase the speed of the execution of the program.\n" +
                "Major disadvantage of the marcos are:\n" +
                "(i) No type checking is performed in macro. This mat cause error.\n" +
                "(ii) A macro call may cause unexpected results.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("#ifdef __BIG_ENDIAN should work on all know machines; Borland defines it.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("The enum doesn't require the preprocessor.");


        expandableListDetail.put("Advantages of a macro over a function?", fifth);
        expandableListDetail.put("What are the facilities provided by preprocessor?", second);
        expandableListDetail.put("What are macros? What are its advantages and disadvantages?", third);
        expandableListDetail.put("How can I use a preprocessor #if expression to tell if a machine is big-endian or little-endian?", fourth);
        expandableListDetail.put("What is the difference bettween an enum and a series of preprocessor #defines?", fifth);
        return expandableListDetail;
    }
}