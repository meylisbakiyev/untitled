package practice04dt;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_NumberOfWords {
    public static void main(String[] args) {

        //Type code to count the number of words that starts with "s" in the String.
        //String str= "Sam is scared so much";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentece, please: ");

        String str = input.nextLine().toLowerCase();

        String[] strARR = str.split(" ");
        System.out.println(Arrays.toString(strARR));//[Sam, is, scared, so, much]

        int counter = 0;

        for (String w: strARR){

            if (w.startsWith("s")){

                counter++;

            }
        }


        if (counter==0){
            System.out.println("There is no word starting with 's'");
        }else {
            System.out.println(counter + " words are in the sentence");
        }

    }
}
