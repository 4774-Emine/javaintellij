package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

Scanner sc=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        int num1=sc.nextInt();
        System.out.println("2.sayıyı giriniz: ");
        int num2=sc.nextInt();
        System.out.println("Girdiğiniz sayıların toplamı= "+ (num1+num2));

    }
}
