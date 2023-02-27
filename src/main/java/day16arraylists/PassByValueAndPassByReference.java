package day16arraylists;

public class PassByValueAndPassByReference {

    public static void main(String[] args) {

        /*
        1)PassByValue creates a copy of the value and uses the copy in the method.
        That is why methods can change just the copy not the original value.
        Java uses PassByValue to protect original values.

        2)Some programming languages  like C# use PassByReference.
        PassByReference creates the copy of the reference (address of the object) and use the copy as if a real assigned value
        in methods.
        Copy reference and Original reference point the original value that is why original value is updated by the methods.
        If you use PassByReference, you can not protect original values.
         */
        int shirtPrice=100;
        studentShirtPrice(shirtPrice, 10 );//90
        System.out.println(shirtPrice);
        veteransDiscount(shirtPrice, 20);
        System.out.println(shirtPrice);

        String name= "Ajda";

        String result= putExclamationMark(name);
        System.out.println(result);
        System.out.println(name);

        int salary=20000;
        double newSalary= increaseSalary(salary);

        System.out.println("The increased salary is : " + newSalary);
        System.out.println(salary);

        //System.out.println(getAbsoluteValue(-5));

        int abs= getAbsoluteValue(-5);
        System.out.println(abs);








        int r1 = addTwoInt(3,5);
        System.out.println(r1);


        String r2 = getFirstLastChar("Angelina Jolie");
        System.out.println(r2);//Ae

        int r3 = getSumOfAsciisOfAllChars("Ajda");
        System.out.println(r3);


        }

        //Ex1: Create a method adds two integers
        //Ex2:Create a method prints the first and the last character on the console
        //Ex3:Create a method prints the sum of the ASCII values of characters in a String

    //Ex1:
    public static int addTwoInt(int a, int b){

        return a+b;
    }

    //Ex2:
    public static String getFirstLastChar(String s){
//        String result = "" + s.charAt(0) + s.charAt(s.length()-1);
//        *This works aswell
//        return result;
        return "" + s.charAt(0) + s.charAt(s.length()-1);


    }

    //Ex3:


    public  static int getSumOfAsciisOfAllChars(String s) {
        int sumOfAsciis = 0;

        for (int i=0; i<s.length(); i++){

            sumOfAsciis = sumOfAsciis + s.charAt(i);
        }
        return sumOfAsciis;
    }




    public static void studentShirtPrice(int shirtPrice, int discount){
        int discountedPrice= shirtPrice- discount;
        System.out.println(discountedPrice);
    }
    public static void veteransDiscount(int shirtPrice, int discount){
        int discountedPrice= shirtPrice - discount;
        System.out.println(discountedPrice+"!!!!!");
    }
    public static String putExclamationMark(String name){
        return name + "!";
    }
    //Create a method that increases the salary by 20%

    public static double increaseSalary(double salary){

        return salary*1.2;

    }
    //Create a method that calculates the absolute value of an integer
    //   - 5 ==> 5   -   0==> 0

    public static int getAbsoluteValue(int n){

        if (n<0){
            return   n*-1;
        }else {
            return n;
        }

    }










}