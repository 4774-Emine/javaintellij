package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

      /*
      Kullanıcıdan cinsiyetini ve yaşını alın
      Kadın 60 yaş ve üzeri,
      Erkek 65 yaş ve üzeri emekli olabilir.
      Cinsiyet ve yaşını dikkate alarak "Ememkli olabilirsin" veya Emekli olmak için... yıl çalışman gerekir" yazdırın

      önce yaş ve cinsiyetten birini ana değişken seçip
      ona göre bir if else oluşturun

      cinsiyet ana değişken olsun
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E, Kadin icin K");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') { //burada sadece erkekler var
            //buraya erkekler için ikinci değişken yaş'a göre if else oluşturalım
            if (yas <10 || yas>80) {
                System.out.println("Geçersiz yaş");
            } else if(yas<65){
                System.out.println("Erkek 65 yaşına kadar çalışmaşlıdır, daha "+(65-yas)+" sene çalışmalısın.");
            }else{
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet == 'K') {//burada sadece kadınlar var
            //buraya kadınlar için ikinci değişken yaş'a göre if else oluşturalım
            if (yas <10 || yas>80) {
                System.out.println("Geçersiz yaş");
            } else if(yas<60){
                System.out.println("Erkek 60 yaşına kadar çalışmaşlıdır, daha "+(60-yas)+" sene çalışmalısın.");
            }else{
                System.out.println("Emekli olabilirsin");
            }

        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf secin");
        }

        scan.close();
    }


}








