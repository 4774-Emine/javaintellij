package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen  saat giriniz: ");
        int saat=sc.nextInt();
        System.out.println("Dakika giriniz: ");
        int dakika=sc.nextInt();
        System.out.println("saniye giriniz: ");
        int saniye=sc.nextInt();
        int topsaniye=(saat*3600)+(dakika*60)+saniye;
        System.out.println("Toplam saniye= "+ topsaniye);

    }

}
