package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = input.nextInt();
        System.out.println("age = " + age);


    }
}
