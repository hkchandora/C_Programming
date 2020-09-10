package cprogramming.example.cprogramming.test.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump13 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("You forgot to define the sin() function. Most math texts should cover it in some detail. The easiest way to fix " +
                "this should be:\n" +
                "double sin(double x)\n" +
                "{\n " +
                "return sqrt(1-cos(x)*cos(x));\n" +
                "}");

        List<String> second = new ArrayList<String>();
        second.add("It does. It looks like the multiplication operator, but you use it more. For instance, the C way of expressing \n" +
                "\"x squared\" is \"x*x\".\n" +
                "\"x cubed\" would be \"x*x*x\".");

        List<String> third = new ArrayList<String>();
        third.add("Multiply by 10. Numerical Recipies in C has a section on this, but there's reputedly a bug in their algoritham.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Turbo C is notoriously buggy. Get a compiler with floating point support.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("strcpy(string_var, float_var);");

        List<String> sixth = new ArrayList<String>();
        sixth.add("The term \"float variable\" is actually redundant; they are simply variables whose value can \"float\" during " +
                "execution. For instance: float f,g=3; f=g;/*f\"floats\" to g*/");

        expandableListDetail.put("I'm trying to do some simple trig, and I am #including <math.h>, but I keep getting \"undefined: " +
                "_sin\" compilation errors?", first);
        expandableListDetail.put("Why doesn't C have an exponentiation operator?", second);
        expandableListDetail.put("How do I round numbers?", third);
        expandableListDetail.put("I'm having trouble with a Turbo C program which crashes and says something like " +
                "\"floating point formats not linked.\"?", fourth);
        expandableListDetail.put("How can I copy a float into a string?", fifth);
        expandableListDetail.put("What are float variables, anyway?", sixth);
        return expandableListDetail;
    }
}