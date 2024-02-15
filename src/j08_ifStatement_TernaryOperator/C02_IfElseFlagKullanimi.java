package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_IfElseFlagKullanimi {
    public static void main(String[] args) {

        //********AHMET HOCA****************
    /*
    Kullanıcıdan bir sayı girmesini isteyin
    Sayi aşağıdaki 4 şartı sağlıyorsa "Mükemmel Sayı" yazdırın
    Sağlanmayan şartların tamamını kullanıcıya söyleyin

    1- sayı 4 basamaklı olmalıdır
    2- sayı 3 ile bölünebilmeldir
    3- sayı 5 ile bölünememelidir.
    4- sayının birler basamağı tek sayı olmalıdır.
     */

        /*
         * Burada birden fazla kontrol etmemiz gereken bir durum varsa 2 yol seçebiliriz,ilki Flag yöntemi. Flagı başta true seçip if bittiğinde flag hala baştaki gibi true ise şartlar sağlanmış demektir.
         * ikinci seçenek ise sayaç kullanmadır. sayacı başta 0 alıp istenen şartlar sağlandıkıça sayacı arrttırmasını isteriz. kaç şart varsa o kadar olmalıdır.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı girin: ");
        int sayi = sc.nextInt();

        boolean sayiMükemmelMi = true;
        // 1- sayı 4 basamaklı olmalıdır
        if (sayi < 1000 || sayi > 9999) {
            System.out.println("sayı 4 basamaklı olmalıdır.");
            sayiMükemmelMi = false;
        }
        // 2- sayı 3 ile bölünebilmeldir

        if (sayi % 3 != 0) {
            sayiMükemmelMi = false;
        }
        //  3- sayı 5 ile bölünememelidir.
        if (sayi % 5 == 0) {
            System.out.println("sayı 5 ile bölünememelidir.");
            sayiMükemmelMi = false;
        }

        //4- sayının birler basamağı tek sayı olmalıdır.
        if ((sayi % 10) % 2 == 0) {
            System.out.println("sayinin birler basamağı tek sayı olmalıdır");
            sayiMükemmelMi = false;
        }
        if (sayiMükemmelMi) System.out.println("Mükemmel Sayı");
    }

}
