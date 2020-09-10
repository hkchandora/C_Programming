package cprogramming.example.cprogramming.test.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump10 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("As a general rule, you should put these things in header (.h) files: marco definitions (preprocessor #defines) " +
                "structure, union, and enumeration declarations global variable declarations it's especially important to put a " +
                "declaration or definition in a header file when it will be shared between several other files.(Im particular, never " +
                "put external function prototypes in .c files.)");

        List<String> second = new ArrayList<String>();
        second.add("The < > syntax is typically used with Standard or system-supplied headers, while \"\" is typically used for a " +
                "program's own header files.");

        List<String> third = new ArrayList<String>();
        third.add("Perhaps there's missing semicolon at the end of the last declaration in the last header file you're #including.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("You can't do it directly; preprocessor #if arithmetic uses only integers. An alternative is to #define several " +
                "macros with symbolic names and distinct integer values, and implement conditional on those.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("No. Preprocessing happens during an earlier phase of compilation, before type names have been parsed. Instead of " +
                "sizeof consider using the predefined constants in ANSI's, if applicable, or perhaps a \"configure\" script.(Better yet, " +
                "try to write code which is inherently insensitive to type sizes)");


        expandableListDetail.put("I'm splitting up a program into multiple source files for the first time, and I'm wondering what " +
                "to put in .c files and what to put in .h files. (What does \".h\" mean, anyway)?", first);
        expandableListDetail.put("What's the difference between #include <> and #include \"\"?", second);
        expandableListDetail.put("I'm getting strange syntax errors on the very first declaration in a file, but it look fine?", third);
        expandableListDetail.put("How can I construct preprocessor #if expressions which compare strings?", fourth);
        expandableListDetail.put("Does the sizeof operator work in preprocessor?", fifth);
        return expandableListDetail;
    }
}