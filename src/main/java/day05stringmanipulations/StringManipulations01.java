package day05stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s="Alabama State";
        //1.way:
        boolean result1=s.charAt(6)=='a';
        System.out.println(result1);

        //2.way:
        boolean result2=s.startsWith("a",6);
        System.out.println(result2);





    }


}
