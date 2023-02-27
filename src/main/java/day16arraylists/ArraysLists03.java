package day16arraylists;

import java.util.Arrays;
import java.util.List;

public class ArraysLists03 {
    public static void main(String[] args) {

        //Example 1: Convert an Array to a List

        String a[] = new String[5];
        a[0] = "Tom";
        a[1] = "Ajda";
        a[2] = "Cuneyt";
        a[3] = "Angelina";
        a[4] = "Brad";

        System.out.println(Arrays.toString(a));//[Tom, Ajda, Cuneyt, Angelina, Brad]

        List<String> myList = Arrays.asList(a);

        System.out.println(myList);
        myList.remove("Ajda");//UnsupportedOperationException

        System.out.println(myList);

        myList.add("Rambo");
        System.out.println(myList);//UnsupportedOperationException

        /*
        When you need to convert an array object to a List, if you use asList() it is used to create a List object from an Array object.
        Arrays are fixed in length, when you create a List from an Array the List will be fixed like an Array in length aswell. Arrays gene/structure
        will be transferred to the List.

        So, if you are sure, you will not need to change the size of the List you create from an Array, you can use asList()
        otherwise do not use it.
         */


    }
}
