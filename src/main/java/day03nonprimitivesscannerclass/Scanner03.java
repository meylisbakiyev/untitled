package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Example 1: Ask user to enter width snd the length of a rectangle, then calculate
        //perimeter and the area of the rectangle.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter width and length of the rectangle, please...");
        double width = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("Perimeter:" + (2*width+2*height));
        System.out.println("Area:"+ width*height);




    }
}
