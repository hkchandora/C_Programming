package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump4 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Sort of. You can use \";\",\"0;\", or \"1;\" - they will all act like a null statement. Only the first is a \"true\" " +
                "null statement (all bits zero). They are basically equivalent. Note that (void *) 0; is a null statement of type pointer" +
                "to void, for instance. ");

        List<String> second = new ArrayList<String>();
        second.add("No.{statement-list[opt]} is a compound statement. An empty block is not the same as a null statement, however, " +
                "although it can be used in many of the same places. It's really a null block.");

        List<String> third = new ArrayList<String>();
        third.add("This trick, though popular in some circles, does not buy much. the resulting code is invalid, and will not " +
                "compile. This (in the author's opinion) outweighs any arguable type consistency. It may be more common in industrial " +
                "code. If it become common practice, C++ will probably legalize it.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("No. A null pointer is a pointer where all of the aaddress bits are zero(no matter what the segment bits are), " +
                "and can be obtained by typing '(char *)(int)0'. A null statement is not a pointer to anything. They are not " +
                "interchangeable, although you can combine them to get an effectively-null statement, such as NULL;." +
                "This does not but you anything.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("There are times when it's necessary to have a pointer that doesn't point to anything. The macro NULL, defined " +
                "in, has a value that's guaranteed to be different from any valid pointer. NULL is a literal zero," +
                "possibly cast to void* or char*.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("After a pointer has been freed, you can no longer use the pointed-to data. The pointer is said to dangle; it doesn't " +
                "point at anything useful.");

        expandableListDetail.put("Is there more than one null statement?", first);
        expandableListDetail.put("Is {} a null statement?", second);
        expandableListDetail.put("I use the statement #define NULLSTMT(F)(F); to allow me to cast a null statement to an appropriate type.", third);
        expandableListDetail.put("Is a null statement a null pointer?", fourth);
        expandableListDetail.put("What is a null pointer?", fifth);
        expandableListDetail.put("Why should we assign NULL to the elements(pointer) after freeing them?", sixth);
        return expandableListDetail;
    }
}