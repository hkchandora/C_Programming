package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump17 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Turbo C is an IDE of c programming language creates by Borland. Turbo C 3.0 is based on MS DOS operation system. " +
                "It is one of the most popular c compilers. It uses 8086 microprocessor which is 16 bits microprocessor. It has 20 " +
                "address buses and 16 data buses. It's word length is two byte.");

        List<String> second = new ArrayList<String>();
        second.add("Try 'stty eol^M^ to wait for a carriage return.");

        List<String> third = new ArrayList<String>();
        third.add("The buffer if normally at \"&main - 0100\". Lower if you have more than 256 characters of type ahead.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("You can clear the screen by sending several form feed characters. Additionally some operating systems (like NetBSD)" +
                " support a feature called \"whiteouts\".");

        List<String> fifth = new ArrayList<String>();
        fifth.add("Time an attempt to truncate it to zero legth; if it takes more than 20-30 ms, the file existed. the exact value will " +
                "depend on the system and the load; before testing, create several large files and time attempts to truncate them, for " +
                "calibration. Time an attempt to truncate it to zero length; if it takes more than 20-30 ms, the file existed. The exact value " +
                "will depend on the system and the load; before testing, create several large files and time attempts to truncate them, for calibration.");

        List<String> sixth = new ArrayList<String>();
        sixth.add("mmap() the file, then use sizeof().");

        List<String> seventh = new ArrayList<String>();
        seventh.add("fopen and goto.");

        expandableListDetail.put("Describe Turbo C compiler?", first);
        expandableListDetail.put("How can i read a single character from the keyboard without waiting for a new line?", second);
        expandableListDetail.put("How can i find out if there are characters available for reading(and if so, how many)? Alternatively, " +
                "how can I do a read that will not block if there are no characters available?", third);
        expandableListDetail.put("How can I clear the screen? How can I print thing in inverse video?", fourth);
        expandableListDetail.put("How can i check whether a file exists? I want to query the user before overwriting existing files?", fifth);
        expandableListDetail.put("How can I find out the size of a file,prior to reading it in?", sixth);
        expandableListDetail.put("How can I read in an object file and jump to routines in it?", seventh);
        return expandableListDetail;
    }
}