package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        int sayi1=sc.nextInt();
        System.out.println("2.sayıyı giriniz: ");
        int sayi2=sc.nextInt();
        System.out.println("3.sayıyı giriniz: ");
        int sayi3=sc.nextInt();
        System.out.println("4.sayıyı giriniz: ");
        int sayi4=sc.nextInt();

        System.out.println("Girilen 4 sayının toplam değeri= " + (sayi1+sayi2+sayi3+sayi4));


    }
}
