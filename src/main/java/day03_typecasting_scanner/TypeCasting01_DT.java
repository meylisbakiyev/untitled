package day03_typecasting_scanner;

public class TypeCasting01_DT {
    public static void main(String[] args) {

        /*
        There are 2 types of data type in Java:
        1)Primitive Data Types ==> byte < short <  int < long < float < double
                                boolean==> true or false
                                char ==> for a single data

        2)Non-Primitive data types ==> String ==> used for multiple different characters storage

        String str = "Tom Hanks123)?";


         */
        int a=23, i=12;
        String str = "Tom";
        System.out.println(a + i + str);
        System.out.println(str +(a+i));
    }


}
