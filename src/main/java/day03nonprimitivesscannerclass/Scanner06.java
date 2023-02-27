package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        Scanner input=new  Scanner(System.in);

        System.out.println("Please enter your adress:");
        String address=input.nextLine();

        System.out.println("Please enter your first name:");
        String firstName=input.next();

        System.out.println("Please enter your last name:");
        String lastName=input.next();



        System.out.println(firstName+(" ")+lastName);
        System.out.println(address);





    }
}
