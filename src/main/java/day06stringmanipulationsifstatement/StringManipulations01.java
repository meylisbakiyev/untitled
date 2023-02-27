package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1: Type code to find the index of the first occurance of 'a' in a given String
        //           Alabama ==> should print 2 on the console


        String s="Alabama";

        //indexOf('a') will give you the index of first occurance of 'a'
        int idxA=s.indexOf('a');
        System.out.println("idxA = " + idxA);

        //Example 2: Type code to find the index of the first occurance of 'java' in a given String
        // "java is easy to learn, java is common in the market, java is OOP" ==> 2

        String t="java is easy to learn, java is common in the market, java is OOP";

        //indexOf("java"); will give you the index of first character of the first occurance of "java"

        int idxT= t.indexOf("java");
        System.out.println("idxT = " + idxT);

        //Note1: If you use "non-existing character or characters" in indexOf() method, will give you "-1"
        //Note2: indexOf() nethod can be used with "char" and "String" data types

        //Example 3: Type code to find the index of the last occurance of 'm' in a given String
        //           miami ==> 3

        String m="miami";

        //lastIndexOf('m');  will give you the index of the last occurence of 'm'
        int lastIdx= m.lastIndexOf('m');
        System.out.println("lastIdx = " + lastIdx);


        //Example 4: Type code to find the index of the last occurence of 'earn' in a given String
        //           Learn Java earn money ==> 11

        String v="Learn Java earn money";
        int vIdx= v.lastIndexOf("earn");
        System.out.println("vIdx = " + vIdx);//11


        //Note1: If you use "non-existing character or characters" in lastIndexOf() method, will give you "-1"
        //Note2: LastIndexOf() nethod can be used with "char" and "String" data types


        //Example 5: Type code to check if a given character is unique or not in agiven String
        //           miami ==> 'a' --> Unique - 'i'--> Not uunique

        String y = "miami";
        char ch = 'a';

        boolean r1 = y.indexOf(ch) == y.lastIndexOf(ch);
        System.out.println("Is the character unique? " + r1);

        /*
            Note: When you type code you should be careful about  "coding standarts"
            i) Seperate "data" and the "main code"
         */



















    }
}
