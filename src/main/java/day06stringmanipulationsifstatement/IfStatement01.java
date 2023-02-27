package day06stringmanipulationsifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*
        If you study hard you will get offer soon
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your midterm result: ");
        double midterm = input.nextDouble();
         if (midterm<40 ){
             System.out.println("Unsatisfactory!");

         } else if (midterm==40){
             System.out.println("Zordan Yubanny!");
         }
         else if (midterm>40 && midterm<60) {
             System.out.println("Boka gora tezegirak!");


         } else if (midterm==60) {
             System.out.println("Tykyrdy bar");
         } else if (midterm>60 && midterm<=80) {
             System.out.println("Molodes!");

         } else if (midterm>80 && midterm<=99) {
             System.out.println("Otlichnik!");

         } else if (midterm==100) {
             System.out.println("Haywan!!!");

         }


    }



}
