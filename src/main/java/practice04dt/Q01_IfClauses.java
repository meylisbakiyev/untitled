package practice04dt;

import java.util.Scanner;

public class Q01_IfClauses {
    public static void main(String[] args) {

        //Type a code to print its seeason after getting a month from the user

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month name: ");
        String monthName = input.next().toLowerCase();

        if (monthName.equals("march") || monthName.equals("april") || monthName.equals("may")){
            System.out.println("Spring");
        } else if(monthName.equals("june") || monthName.equals("july") || monthName.equals("august")){
            System.out.println("Summer");
        } else if (monthName.equals("september")|| monthName.equals("october") || monthName.equals("november")){
            System.out.println("Autumn");
        }else if (monthName.equals("december") || monthName.equals("january") || monthName.equals("february")){
            System.out.println("Winter");
        }else {
            System.out.println("Please enter valid month name!");
        }




    }
}
