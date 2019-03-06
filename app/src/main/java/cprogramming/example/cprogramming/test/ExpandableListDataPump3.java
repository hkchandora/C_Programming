package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump3 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("goto statement implements a local jump of program execution, and the longjmp() and setjmp() function implement " +
                "a nonlocal, or far, jump of program execution.");

        List<String> second = new ArrayList<String>();
        second.add("The bitwise AND operator");

        List<String> third = new ArrayList<String>();
        third.add("The bitwise OR operator. In the following code snippet, the bit number 24 is turned ON:some_int = some_int |KBit24;");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Operator are symbols which take one or more operands or expressions and perform arithmetic or logical computations.\n" +
                "Operands are variables or expressions which are used in operators to evaluate the expression.\n" +
                "Combination of operands and operators from an expression.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("There are a very real difference between characters and string, and strcat() concatenates *strings*. Characters in C are " +
                "represented by small integers corresponding to their character set values Strings are represented by arrays of characters; " +
                "you usually manipulate a pointer to the first character of the array. It is never correct to use one when the other is " +
                "expected. To append a ! to a string, use strcat(string,\"!\");");

        List<String> sixth = new ArrayList<String>();
        sixth.add("String in C are represented as arrays of charaters, and C never manipulates(assigns, compares, etc.) arrays as a whole. " +
                "The == operator in the code fragment above compare two pointers - the value of the pointer variable string and a pointer " +
                "to the string literal \"value\" -- to see if they are equal, that is, if they point to the same place. the probably don't, " +
                "so compare two strings, you generally use the library function strcmp(): \nif(strcmp(string,\"value\") == 0) \n{  \n//*string matches \"value\" *// \n...}");

        expandableListDetail.put("What is the difference between goto and longjmp() and strjmp()?", first);
        expandableListDetail.put("Which bitwise operator is sutablefor checking whether a particular bit is on or off?", second);
        expandableListDetail.put("Which bitwise operator is sutable for putting on a particular bit in a number?", third);
        expandableListDetail.put("Define Operator, Operand, and Expression in 'C'?", fourth);
        expandableListDetail.put("Why doesn't strcat(string,'!'); work?", fifth);
        expandableListDetail.put("I'm checking a string to see if it matches a particular value. Why isn't this code working? \nchar " +
                "*string; \n...if(string  == \"value\")\n{\n//* string matches \"value\" *// \n...?", sixth);
        return expandableListDetail;
    }
}