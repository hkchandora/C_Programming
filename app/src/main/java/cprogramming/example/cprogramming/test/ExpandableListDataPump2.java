package cprogramming.example.cprogramming.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump2 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Structure is a collection of heterogeneous(i.e. related data items which can be of different types) held together " +
                "to a single unit. The data items enclosed within a structure are called its members which may be of data type int, float," +
                "char,array etc.");

        List<String> second = new ArrayList<String>();
        second.add("(i) In structure every member has its own member whereas in union its members share the same member space.\n" +
                "(ii) In structure, it is possible to initialize all the members at the same time which is not possible in case of union.\n" +
                "(iii) A structure requires more space than union(for the same type of members).\n" +
                "(iv) In union different interpretation of the same memory space are possible which is not so in case of structures.");

        List<String> third = new ArrayList<String>();
        third.add("(i) Efficient use of memory as it it does not demand memory rather it require memory space for its largest member only\n" +
                "(ii) Same memory space can be interpreted differently for different members of the union.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("A structure is a collection of one or more variable, possibly of different data types, grouped together under a single" +
                " name for convenient handling. Structure can contain other structure as members; in other words, structures can nest.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("Loop with putchar. Be careful; if your machine uses signed chars be default, all of the sign bits in your structure" +
                "elements will be reversed.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("It's generally 4 times the number of members of structure. It may be more or less on some machines.");

        List<String> seventh = new ArrayList<String>();
        seventh.add("foo\"name\" should work. You may need to overload the. operator, which , in trun, may overload your C compiler.");


        expandableListDetail.put("What is a structure?", first);
        expandableListDetail.put("What is difference between Structure and Unions?", second);
        expandableListDetail.put("What are the advantages of using Unions?", third);
        expandableListDetail.put("What is nested structure?", fourth);
        expandableListDetail.put("How can I read/write struct from/ to data files?", fifth);
        expandableListDetail.put("How can I determine the byte offset of a field within a structure?", sixth);
        expandableListDetail.put("How can I access structure fields by name at run time?", seventh);
        return expandableListDetail;

    }
}

