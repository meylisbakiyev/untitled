package day06stringmanipulationsifstatement;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a given String is empty or not
        //           "Java" ==> false    -     "" ==> true

        String s = "Java";

        //1.Way: Used lenght();
        boolean r1= s.length()==0;
        System.out.println("Is the given String empty? " + r1);

        //2.Way: Recommended because if Java has a method for a specific task we always prefer to use it
        boolean r2 = s.isEmpty();
        System.out.println("Is the given String empty? " + r2);

        //Example 2: Type code to check if a given String is containing just "space character" or not
        //           "    "==> true     -       "a    b     " ==> false

        String t = "   ";

        //1,Way:

        boolean r3 = t.replaceAll("[ ]","").length()==0;
        System.out.println("Is it containig just space character? " + r3);

        //2.Way: isBlank(); checks if the String has any character different from space
        //       That is why isBlank(); method gives you true for "empty String" as well
        //       "" ==> true      -       "      " ==> true      -  "       x      " ==> false

        boolean r4= t.isBlank();
        System.out.println("Is it containing just space character? " + r4);









    }
}
