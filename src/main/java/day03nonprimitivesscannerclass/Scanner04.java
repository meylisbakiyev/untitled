package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        Scanner input=new  Scanner(System.in);
        System.out.println("Enter width and length and the height of rectangle, please...");
        double width = input.nextDouble();
        double length = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("Volume of rectangle is:" + (width*length*height));





    }
}
