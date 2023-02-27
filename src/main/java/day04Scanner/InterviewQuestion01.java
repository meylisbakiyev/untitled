package day04Scanner;

import java.util.Scanner;

public class InterviewQuestion01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter number:");
        int dayNum=input.nextInt();
        if (dayNum==1){
            System.out.println("Monday");
        } else if (dayNum == 2) {
            System.out.println("Tuesday");
        } else if (dayNum == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("You entered wrong number");
        }


    }



}
