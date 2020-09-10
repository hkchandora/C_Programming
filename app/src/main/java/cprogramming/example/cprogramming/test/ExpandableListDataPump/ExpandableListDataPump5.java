package cprogramming.example.cprogramming.test.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump5 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("The declaration extern char a[] simply matches the actual definition. The type \"array-of-type-T\" is the same " +
                "as \"array-of-type-T\". Go ahead and use extern char a[].\n" +
                "(For greater portability, use it in both files, not only in one of them.)");

        List<String> second = new ArrayList<String>();
        second.add("This is true. However, the declaration a[] is compatible with the definition a[6].");

        List<String> third = new ArrayList<String>();
        third.add("Part of the ANSI conspiracy to restrict people to passing pointers; this was undertaken after the first discovery " +
                "that passing large arrays recursively could cause crashes. Since then, with the passing of MS-DOS, it has become a non-issue; " +
                "since all serious machines have virtual memory, you can pass as much data as you want on the stack without detectable problems.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("An lvalue is an expression to which a value can be assigned. The lvalue expression is located on the left side " +
                "of an assignment statement.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("An lvalue was defined as an expression to which a value can be assigned. Is an array an expression to which we " +
                "can assign a value? The answer to this question is no.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("The ANSI C Standard defines a \"modifiable lvalue,\" which an array is not.");

        List<String> seventh = new ArrayList<String>();
        seventh.add("Array automatically allocate space, but can't relocated or resized. Pointers must be explicitly assigned to point " +
                "to allocated space (perhaps using malloc), but can be reassigned (i.e. pointed at different objects) at will, and have " +
                "many other uses besides serving as the base of blocks of memory. Due to the so-called equivalence of array and pointers, " +
                "arrays and pointers, arrays and pointers often seem and in particular a pointer to a block of memory assigned by malloc is frequently " +
                "treated (and can be reference using []) exactly as if it ware a true array.");

        List<String> eighth = new ArrayList<String>();
        eighth.add("Major differences between arrays and linked lists are:\n" +
                "(i) In array consecutive elements are stored in consecutive memory locations whereas in linked list it not so.\n" +
                "(ii) In array address of next element is consecutive and whereas in linked list it is specified in the address part of each node.\n" +
                "(iii) Linked List makes better use of memory than arrays.\n" +
                "(iv) Insertion or deletion of an element in array if difficult than insertion or deletion in lined list");

        List<String> ninth = new ArrayList<String>();
        ninth.add("The access modifier keyword const is a promise the programmer makes to the compiler that the value of a variable " +
                "will not be changed after it is initialized.");

        expandableListDetail.put("I had the definition char a[6] in one source file, and in another I declared extern char a[]. Why did it work?", first);
        expandableListDetail.put("I heard that char a[] was different from char a[6].", second);
        expandableListDetail.put("Why doesn't sizeof properly report the size of an array which is a parameter to a function?", third);
        expandableListDetail.put("What is an lvalue?", fourth);
        expandableListDetail.put("Array is an lvalue or not?", fifth);
        expandableListDetail.put("How can an array be an lvalue, if you can't assign to it?", sixth);
        expandableListDetail.put("What is the difference between arrays and pointers?", seventh);
        expandableListDetail.put("What is the difference between array and linked list", eighth);
        expandableListDetail.put("What is a const pointer?", ninth);
        return expandableListDetail;
    }
}