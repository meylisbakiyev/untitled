package practices.practice01;

import java.util.Scanner;

public class AverageOfStudents {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter The students name:");
        String student1 = input.nextLine();

        System.out.println("Enter the midterm score:");
        int midTerm1 = input.nextInt();


        System.out.println("Enter the students name:");
        String student2 = input.next();

        System.out.println("Enter the midterm score:");
        int midTerm2 = input.nextInt();


        System.out.println("Enter the students name:");
        String student3 = input.next();
        System.out.println("Enter the midterm score:");
        int midTerm3 = input.nextInt();


        System.out.println("The midterm average score is:" +(midTerm1+midTerm2+midTerm3)/3 );









    }



}
