package day03_typecasting_scanner;

public class WrapperClass01 {

    public static void main(String[] args) {




byte b=23;
Byte wb=b;
long numberLong= 32544686;



        int n=27;
        byte t= (byte) n;


short numberShort= (short) numberLong;

        System.out.println(b);
        System.out.println(wb.floatValue());
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Short.MAX_VALUE); //32767

        System.out.println(Character.MAX_VALUE);  //?
        System.out.println(Character.MIN_VALUE);    //

    }


}
