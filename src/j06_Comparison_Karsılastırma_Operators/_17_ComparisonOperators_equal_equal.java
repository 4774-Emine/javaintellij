package j06_Comparison_Karsılastırma_Operators;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

Scanner sc=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        int sayi1=sc.nextInt();
        System.out.println("2.sayıyı giriniz: ");
        int sayi2=sc.nextInt();
if(sayi1==sayi2){
    System.out.println("true");
}else System.out.println("false");

    }
}
