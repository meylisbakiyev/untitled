package practices.practice01;

public class Q05_PrintingNumOneByOne {
    public static void main(String[] args) {
        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // x: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5
        int num=12345;
        int a=num%10;
        System.out.println("a = " + a);
        System.out.println("num = " + num);


    }
}
