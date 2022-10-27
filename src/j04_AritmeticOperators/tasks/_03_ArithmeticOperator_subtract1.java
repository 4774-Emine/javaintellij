package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */
Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz: ");
        int num1=sc.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz: ");
        int num2=sc.nextInt();
       int fark=Math.abs(num1-num2);
        System.out.println("Girilen sayıların farkı=" + fark);
    }
}
