package cprogramming.example.cprogramming.test.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump15 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Yes. There's too much lint in it. You should get a shop vac.");

        List<String> second = new ArrayList<String>();
        second.add("Don't run lint. Alternatively provide a prototype of \"extern double*malloc()\" to make the return from malloc() " +
                "be more strongly aligned.");

        List<String> third = new ArrayList<String>();
        third.add("You may wish to check your spouse's navel occasionally, especially if your spouse work for a standards committee.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Lexeme Interpreter aNd Tester");

        expandableListDetail.put("I just typed in this program, and it's acting strangely. Can you see anything wrong with it?", first);
        expandableListDetail.put("How can I shut off the \"warning: possible pointer alignment problem\" message lint gives me " +
                "for each call to malloc?", second);
        expandableListDetail.put("Where can I get an ANSI - compatible lint?", third);
        expandableListDetail.put("What does LINT stand for, anyway?", fourth);
        return expandableListDetail;
    }
}