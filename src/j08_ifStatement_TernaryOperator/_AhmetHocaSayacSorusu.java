package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class _AhmetHocaSayacSorusu {

    public static void main(String[] args) {
        //Kullanıcıdan bir şifre isteyip aşağıdaki şartları kontrol edin ve kullanıcıya düzeltmesi gereken tüm eksikleri söyleyin.
        //Eğer tüm şartları sağlarsa "Şifre başarıyla kaydedildi! yazdırın.
        // -İlk harf küçük olmalı
        // -Son karakter rakam olmalı
        //sifre boşluk içermemeli
        // uzunluğu en az 10 karakter olmalı

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz : ");
        String sifre = sc.nextLine();

        // TÜM HATALARI RAPORLAMAM İSTENDİĞİ İÇİN BAĞIMSIZ İF CÜMLESİ KULLANMALIYIM.
        //tÜM ŞARTLARI SAĞLADIĞINI KONTROL ETMEK İÇİN SAYAÇ KULLANALIM.

        int sayac = 0;

        // -İlk harf küçük olmalı
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("İlk harf küçük olmalı");
            sayac++;
        }

        //  -Son karakter rakam olmalı
        char sonHarf = sifre.charAt(sifre.length() - 1);
        if (!(sonHarf >= '0' && sonHarf <= '9')) {
            System.out.println("Son karakter rakam olmalı");
            sayac++;
        }
        //sifre boşluk içermemeli
        if (sifre.contains(" ")) {
            System.out.println("sifre boşluk içermemeli");
            sayac++;
        }
        //uzunluğu en az 10 karakter olmalı
        if (sifre.length() < 10) {
            System.out.println("uzunluğu en az 10 karakter olmalı");
            sayac++;
        }
        if (sayac == 0) {
            System.out.println("Şifre başarıyla kaydedildi!");
        }
    }

}
