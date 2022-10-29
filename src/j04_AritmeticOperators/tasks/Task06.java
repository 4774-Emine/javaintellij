package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */

      Scanner sc=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
      int sayi=sc.nextInt();
      int birler=sayi%10;
      sayi/=10;
      int onlar=sayi%10;
      int yuzler=sayi/10;
        System.out.println("Girdiğiniz sayının birler basamağı: "+birler);
        System.out.println("Girdiğiniz sayının onlar basamağı: "+ onlar);
        System.out.println("Girdiğiniz sayının yüzler basamağı:"+ yuzler);

    }
}
