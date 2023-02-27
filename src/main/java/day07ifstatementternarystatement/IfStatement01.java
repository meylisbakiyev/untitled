package day07ifstatementternarystatement;

public class IfStatement01 {
    public static void main(String[] args) {
        // Ex1: Type code to check if a given character is a upper case or lower case or others
        char ch='5';

        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case...");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Lower case...");
        } else {
            System.out.println("Others...");
        }

        // Ex2: If a number is less than 300 or greater than 3000
        //      print "Perfect Number" on the console, otherwise
        //      print "Regular number" on the console.
        int num = 300;

        if (num<300 || num>3000){
            System.out.println("Perfect Number...");
        } else {
            System.out.println("Regular Number...");
        }

        // Ex3: Type code to check if a number is "Even" or "Odd"

        int a=3;
        if (a%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //Ex4: Type code to print the number of month for the given month name
        //     February-->2     May-->5     December-->12

        String monthName = "Meylis";

        if (monthName.equals("January")){
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        }else {
            System.out.println("Invalid month name");
        }


    }
}
