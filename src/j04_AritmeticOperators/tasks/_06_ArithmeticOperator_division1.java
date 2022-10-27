package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*     kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz.   */
Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz: ");
        int num1=sc.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz: ");
        int num2=sc.nextInt();
        System.out.println("Girilen sayıların bölümü=" + (num1/num2));

    }
}
