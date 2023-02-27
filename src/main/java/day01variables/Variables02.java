package day01variables;

public class Variables02 {
    public static void main(String[] args) {
        short populationInAnApartment = 785;
        System.out.println(populationInAnApartment);
        char initial = 'S';
        System.out.println(initial);

        int num1= 32636;
        short num2 = (short)num1;
        System.out.println(num2);

        int j=1;
        int sum=0;
        while(j<1) {
            sum = sum + j;
            j++;
        }
        System.out.println(sum);

        for(int i=1; i<=5; i++) {
            for(int j1=(5-i); j1>1; j1--) {
                System.out.print(i+j1);
            }
            System.out.println();
        }



    }
    // What is data?

    byte stdAge = 127;


 int populationInCity = 2000000;
 long populationOfTheWorld = 7200000000l;
float shirtPrice  = 12.99F;

char punctuationMark = '!';
boolean isRetired = true;
boolean isOld = false;
//

}
