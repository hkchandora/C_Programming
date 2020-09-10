package cprogramming.example.cprogramming.test.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump16 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("When we write printf(\"%d\",x); this means compiler will print the value of x. But as here, there is nothing after " +
                "%d so compiler will show in output window garbage value.");

        List<String> second = new ArrayList<String>();
        second.add("The expression n++ requires a single machine instruction such as INR to carry out the increment operation " +
                "whereas, n+1 requires more instructions to carry out this operation.");

        List<String> third = new ArrayList<String>();
        third.add("Evaluation of any expression os from left to right. Preincrement is faster because it doesn't need to save the " +
                "current value for next instruction whereas Postincrement needs to saves current value to be increment after execution " +
                "of current instruction.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Not really; it's too similar to if(!strcmp(s1,s2)) which invokes undefined behavior, so it might be confusing.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("There are many system of indentation advocated, but all of them have the same basic flaw; they will mislead the reader " +
                "when the actual code logic does not follow the indentation entirely, so the reader will not be misled.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("Usually don't use a goto statement unless it is necessary.");

        expandableListDetail.put("What is the output of printf(\"%d\")?", first);
        expandableListDetail.put("Why n++ executes faster than n+1?", second);
        expandableListDetail.put("Why Preincrement operator is faster than Postincrement?", third);
        expandableListDetail.put("Here's a neat trick: if(!strcmp(s1,s2)) is this good style?", fourth);
        expandableListDetail.put("What's the best style for code layout in C?", fifth);
        expandableListDetail.put("Is goto a good thing or a bad thing?", sixth);
        return expandableListDetail;
    }
}