package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump8 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("There are 3 main uses for the static.\n" +
                "1) if it is declare within a function: it retains the value between function calls.\n" +
                "2) If it is declared for a function name: By default function is extern. so it will be visible form other files " +
                "if the function declaration is as static . it is invisible for the outer files.\n" +
                "3) Static for global variables: By default we can use the global variable from outside files If it is static global, that " +
                "variable is limited to with in the file.");

        List<String> second = new ArrayList<String>();
        second.add("You can declare a static variable without defining it as well(this is because the storage class modifiers static and " +
                "extern are mutually exclusive). A static variable can be defined in a header file, but this would cause each source file " +
                "that included the header file to have its own private copy of the variable, which is probably not what was intended.");

        List<String> third = new ArrayList<String>();
        third.add("Yes.\n" +
                "The const modifier means that this code cannot change the value of the variable, but that does not mean that the " +
                "value cannot be changed by means outside this code.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Auto variable are stored in main memory and their default value is a garbage value");

        List<String> fifth = new ArrayList<String>();
        fifth.add("An ordinary variable is like a container it can hold any value and we can change the value of ordinary variable " +
                "at a time throughout the program.\n" +
                "A pointer is a variable that stores the address of another variable.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("auto variables are defined inside a function. A variable declared inside the function without storage class name is, by " +
                "default, an auto variable. These functions are declared on the stack. The stack provides temporary storage.");

        expandableListDetail.put("What does ststic variable mean?", first);
        expandableListDetail.put("Can static variable be declared in a header file?", second);
        expandableListDetail.put("Can a variable be both constant and volatile", third);
        expandableListDetail.put("Where are the auto variables stored?", fourth);
        expandableListDetail.put("What is the difference between ordinary variable and pointer in C?", fifth);
        expandableListDetail.put("Tell any five properties of auto variables?", sixth);
        return expandableListDetail;
    }
}