package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplami {
    public static void main(String[] args) {
        // kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz : ");
        int sayi = scan.nextInt();
       // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
        int birler = sayi % 10;//sayının birler basamagı
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

       //int rakamToplamı = birler + onlar + yüzler;
       //System.out.println("rakamToplamı = " + rakamToplamı);
        System.out.println(birler+onlar+yüzler);

        /*int x = 12345;
        int birler = x%10; //5
        int onlar = (x/10) %10; //4;
        int yuzler =(x/100) %10 ; //3
        int binler = (x/1000) %10; //2
        int onBinler = (x/10000); //1

        System.out.println(onBinler + "\n" + binler + "\n" +yuzler + "\n" + onlar + "\n" + birler );*/




    }
}
