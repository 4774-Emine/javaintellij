package j04_AritmeticOperators;

import java.util.Scanner;

public class C05_Modulus {
    public static void main(String[] args) {

        System.out.println((20 % 8));//4
        System.out.println((625872538 % 3));//1 eğer sonuç 0 ise sayı 3 e tam bölünür.
         //TASK

        //kullanıcıdan bir pozitif tam sayı alıp
        //birler basamağının karesini yazdırın.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");
        int girilenSayi=sc.nextInt();
        System.out.println(((girilenSayi % 10) * (girilenSayi % 10)));

        //girilen sayıdan birler basamağını silip kalan sayıyı yazdırın
        System.out.println((girilenSayi / 10));//213/10---> 21


    }



}
