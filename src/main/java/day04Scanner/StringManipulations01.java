package day04Scanner;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName= input.nextLine().toUpperCase();
        System.out.println(fullName);

        System.out.println("Enter your first name and last name");
        String name= input.nextLine().toUpperCase().trim();//method chain
        System.out.println(name);

        System.out.println("Enter a String:");
        String s = input.nextLine();
        int numOfChars = s.length();
        System.out.println(numOfChars);









    }



}
