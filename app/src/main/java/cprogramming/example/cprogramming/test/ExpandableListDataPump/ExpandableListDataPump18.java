package cprogramming.example.cprogramming.test.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump18 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("They're always zero.");

        List<String> second = new ArrayList<String>();
        second.add("The traditional solution, pioneered by Microsoft, is to sell enough copies of your proprietary, slow, and limited " +
                "software that everyone else supports your formats.");

        List<String> third = new ArrayList<String>();
        third.add("Using fcntl(),lock the line or record in the file exclusively. Now using another thread, read the file, at each byte, " +
                "trying to write that byte back. Wherever you succeed, write that byte into another file. Then copy the new file over " +
                "the old file, releasing the lock first");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Start a counter at zero and one to it for each bit set. Some operating systems may provide a call to do this. " +
                "For values over INT_MAX/2, start the counter at CHAR_BIT*sizeof(int) and subtract one for each bit not set.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("Yes. About 10 ms per call. Only on machines which feature preincrement addressing.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("Code like this ought to work.\n" +
                "long int foo()\n" +
                "{\n" +
                "return 2L+3;\n" +
                "/*returns both values*/\n" +
                "}");

        List<String> seventh = new ArrayList<String>();
        seventh.add("You probably declared main as \"void main(void)\". It's also possible that the first statement in main is abort();- " +
                "by the as if rule, the compiler can abort at any time before then, too. Some compilers have bugs, and will produce buggy " +
                "code for any module which includes the letters \"a\",\"b\",\"o\",\"r\" and \"t\" in that order before the first " +
                "function declaration.");

        expandableListDetail.put("What can I safely assume about the initial value of variable which are not explicitly initialized? " +
                "if global variables start out as \"zero\", is that good enough for null pointers and floating - point zeroes?", first);
        expandableListDetail.put("How can I write data files which can be read on other machines with different word size, byte order, " +
                "or floating point formats?", second);
        expandableListDetail.put("How can I insert or delete a line(or record) in the middle of a file?", third);
        expandableListDetail.put("What is the most efficient way to count the number of bits which are set in a value?", fourth);
        expandableListDetail.put("Are pointers really faster than arrays? How much do function calls slow things down? Is ++i faster than i=i+1?", fifth);
        expandableListDetail.put("If I have a char*variable pointing to the name of a function as a string, how can I call that function?", sixth);
        expandableListDetail.put("This program crashes before it even runs!(When single-stepping with a debugger, it dies before the first statement in main.)?", seventh);
        return expandableListDetail;
    }
}