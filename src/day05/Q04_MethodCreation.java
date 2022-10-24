package day05;

import java.util.Scanner;

public class Q04_MethodCreation {


    /*
    Kullanicidan bir tam sayi alin.
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini yazdirin.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz :");
        int sayi= sc.nextInt();

        pozitifNegatif(sayi);
        System.out.println("sayi cift -> " +Q02_MethodCreation.isEven(sayi));
        System.out.println(  sayi >= 100 ? (yuzdenBuyuk(sayi)) : (yuzdenKucuk(sayi)));

    }

    private static int yuzdenKucuk(int sayi) {

        return sayi%10;
    }

    private static int yuzdenBuyuk(int sayi) {

        int birler = sayi%10, onlar =(sayi/10) %10, yuzler = sayi/100;
        int toplam =0;
        toplam = birler + onlar+ yuzler;
        return toplam;
    }
    private static void pozitifNegatif(int sayi) {
        System.out.println(sayi >0 && sayi!=0 ? "pozitif":"negatif");
    }
}