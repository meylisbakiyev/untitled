package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        Scanner input=new  Scanner(System.in);
        System.out.println("Enter the radius of circle, please...");
        float radius = input.nextFloat();
        float piNumber = 3.14159f;

        System.out.println("Area of a circle is:" + (piNumber*radius*radius));
        System.out.println("Perimeter of a circle is:" + (2*piNumber*radius));




    }
}
