package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        System.out.println("***********Clarusway spor salonuna hoşgeldiniz******");
        Scanner sc=new Scanner(System.in);
        System.out.println("İsim ve soyisim giriniz" );
        String isim = sc.nextLine();
        System.out.println("Kaç yaşındasınız?");
        int yas=sc.nextInt();
        System.out.println("kilonuzu giriniz");
        int kilo=sc.nextInt();
        System.out.println("boyunuzu giriniz:");
        double boy =sc.nextDouble();
        System.out.println("Salona kaç ay devam edeceksiniz?");
        int ay=sc.nextInt();
        System.out.println("Toplam ödeemniz gereken ücret: "+ (ay*20)+ "$");
    }
}
