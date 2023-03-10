package practice04dt;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q03_Arrays {
    public static void main(String[] args) {

        //Type code to check if a specific element in an Array or not

        //String str=new String[6];

        String[] str = {"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};

        String name = "Monnie";
        int counter = 0;

        for (String w : str) {

            if (w.equals(name)) {
                counter++;
            }
        }


            if (counter > 0) {
                System.out.println(name + " Exists in the Array");
            } else {
                System.out.println(name + " Does not exist in the Array");
            }

        //2.Way: using binarySearch
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[Ali, Brad, Ellie, Susan, Tom, Veli]

        int idx = Arrays.binarySearch(str,name);
        System.out.println(idx);




    }





    }

