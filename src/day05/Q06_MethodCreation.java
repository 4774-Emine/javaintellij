package day05;

import java.util.Scanner;

public class Q06_MethodCreation {

    /*
     Kullanıcıdan isim ve soyismini alın.
     Kullanıcının isim ve soyisminin ilk harflerini büyük
     diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz");
        String ilkIsim = scan.next().toLowerCase();
        System.out.println("Soy isminizi giriniz");
        String soyIsim = scan.next().toLowerCase();

        isimYazma(ilkIsim, soyIsim);
        System.out.println("isimYazma2(ilkIsim, soyIsim) = " + isimYazma2(ilkIsim, soyIsim));


    }

    //1.yol void method
    public static void isimYazma(String ilkIsim, String soyIsim) {
        ilkIsim = ilkIsim.substring(0, 1).toUpperCase() + ilkIsim.substring(1);
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1);

        System.out.println(ilkIsim + " " + soyIsim);
    }
    // Java da ayni isimle birden fazla method olusturulmasına overloading denir.
    // Overloading icin Method Signature'larinin farkli olmasi gerekir
    // Method Signature = isim + parametre sayisi + parametre data type


    //2.yol return method
    public static String isimYazma2(String ilkIsim, String soyIsim) {
        ilkIsim = ilkIsim.substring(0, 1).toUpperCase() + ilkIsim.substring(1);
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1);

        return ilkIsim.concat(" " + soyIsim);
    }


}
