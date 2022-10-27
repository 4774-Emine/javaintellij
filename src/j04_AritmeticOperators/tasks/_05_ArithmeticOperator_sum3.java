package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz: ");
        int num1=sc.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz: ");
        int num2=sc.nextInt();
        System.out.println("lütfen 3.sayıyı giriniz: ");
        int num3=sc.nextInt();
        System.out.println("Girilen sayıların toplamı= "+ (num1+num2+num3));
    }
}
