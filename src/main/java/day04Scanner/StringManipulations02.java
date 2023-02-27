package day04Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s="GERMANY";
        String t= s.substring(0,4).toLowerCase();
        System.out.println(t);

        String r="Java";
        String u="java";
        boolean same=r.equals(u);
        System.out.println(same);
        boolean sameIgnoreCase = r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCase);
        String s1="TechPro";
        String s2="TechPro";
         boolean r1=s1.equals(s2);
        System.out.println(r1);

        boolean r2= s1==s2;
        System.out.println(r2);


        String t1= "Python";
        String t2= new String("Python");

        boolean d1= t1==t2;
        System.out.println(d1);

        boolean d2= t1.equals(t2);
        System.out.println(d2);
        /*
What we learned so far
1)charAt()=> find the character at given index ==> return type -> char
2)toUpperCase()==> String
3)toLowerCase()==> String
4)trim()==> used for deleting the extra spaces from the beginning and ending of a String value->String
5)Split()==> to break a String value from the given character ->String
6)Length()==> is used to find the total number of the characters of a String-> int
7)substring(beginning index, ending index)==> used to get the required part of a String-> String
8)substring(beginning index)==> will start getting the characters from the given value to the last index
9)equals()==> boolean
10)equalsIgnoreCase=>String
11)startsWith()==>boolean

 */








    }
}
