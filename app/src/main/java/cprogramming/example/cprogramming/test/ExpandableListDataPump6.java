package cprogramming.example.cprogramming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump6{
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> first = new ArrayList<String>();
        first.add("Compiler allocates memory space for a declared variable. By using the address of operator, the reserved address is obtained and " +
                "this address is assigned to a pointer variable. This wy of assigning pointer value to a pointer variable at compilation" +
                " time is know as ststic memory allocation. ");

        List<String> second = new ArrayList<String>();
        second.add("A dynamic memory allocation uses functions such as malloc() or calloc() to get memory dynamically. If these functions are " +
                "used to get memory dynamically and the value returned by these function are assigned to pointer variable, such a way " +
                "of allocating memory at run time is known as dynamic memory allocation.");

        List<String> third = new ArrayList<String>();
        third.add("The ANSI C standaed defines a \"modifiable lvalue\",which an array is not.");

        List<String> fourth = new ArrayList<String>();
        fourth.add("Arrays automatically allocate space, but can't be relocated or resized. Pointers must be explicitly assigned to point to " +
                "allocated space (perhaps using malloc), but can be reassigned (i.e. pointer at different objects) at will, and have many other " +
                "uses besides serving as the base of block of memory. Due to the so-called equivalence of arrays and pointers, arrays and pointers often " +
                "seem and in particular a pointer to a block of memory assigned by malloc is frequently treated(and can be referenced using []) " +
                "exactly as if it were a true array.");

        List<String> fifth = new ArrayList<String>();
        fifth.add("In interrupt-riddled code, it may be necessary to cast values to force the CPU to resolve pointer types.");

        List<String> sixth = new ArrayList<String>();
        fifth.add("Yes. However, what happens when you do is not clearly defined.");

        List<String> seventh = new ArrayList<String>();
        fifth.add("Using interrupt 41h. On macs, amigas, and other \"big-endian\" processors, that would be interrupt 14h; be wary of " +
                "portability problems.");

        List<String> eighth = new ArrayList<String>();
        fifth.add("No exactly; because the objects are dynamically allocated, their size can change at run time, so this will not be reliable\n" +
                "If you restrict your allocation to allocating sizeof(void*) bytes at a time, you will find that you can use sizeof() to get " +
                "the size of a block, in the obvious way.");

        List<String> ninth = new ArrayList<String>();
        fifth.add("No. You just have to keep track of them somewhere else also.");



        expandableListDetail.put("What is static memory allocation?", first);
        expandableListDetail.put("What is dynamic memory allocation?", second);
        expandableListDetail.put("How can an array be an lvalue, if you can't assign to it?", third);
        expandableListDetail.put("Practically speaking, what is the difference between array and pointers?", fourth);
        expandableListDetail.put("Why does some code carefully cast the value returned by malloc to the pointer type being allocated?", fifth);
        expandableListDetail.put("You can't use dynamically- allocated memory after you free it, can you?", sixth);
        expandableListDetail.put("How does free() know how many bytes to free?", seventh);
        expandableListDetail.put("Can I query the malloc package to find out how big an allocated block is?", eighth);
        expandableListDetail.put("I'm allocating structure which contain pointer to other dynamically- allocated objects. When I free a " +
                "structure, do I have to free each subsidiary pointer first?", ninth);
        return expandableListDetail;
    }
}