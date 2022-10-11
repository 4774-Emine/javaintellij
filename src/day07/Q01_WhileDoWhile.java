package day07;

import java.util.Scanner;

public class Q01_WhileDoWhile {

    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
     Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz :");
        int sayi=sc.nextInt();
        System.out.println(basamakToplamı(sayi));





    }

    private static int basamakToplamı(int sayi) {
        int toplam=0;
        while(sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
return toplam;
    }


}
//dowhile
//for ile çözüm yapın
