package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the Shirt price:");
        double shirtPrice=input.nextDouble();
        System.out.println("Please enter the Shoe price:");
        double shoePrice=input.nextDouble();
        System.out.println("Total ="+(shoePrice+shirtPrice));




    }
}
