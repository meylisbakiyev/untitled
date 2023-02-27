package day08ternary_switch;

public class Ternary01 {
    public static void main(String[] args) {

        //Ex1: Type code to select the minimum one of two integers

        int a = 12;
        int b = 7;

        int c = a<b ? a : b;
        System.out.println(c);

        //Ex2: Type code to calculate absolute value of an integer
        // 5 ==> 5    0 ==> 0    -5 ==> -1* -5 ==> 5

        int d= -5;
        int r1 = d<0 ? -1*d : d ;
        System.out.println(r1);

        //Ex3: If two integers are positive return the multiplication
        //     Otherwise, give a message like "I do not know how to multiply"
        //     3 and 4 ==> 12    -     -3 and -4 ==> "I do not know how to multiply"

        int x = 3;
        int y = 4;
        Object r2 = x>0 && y>0 ? x*y : "I do not know how to multiply";
        System.out.println(r2);




    }
}
