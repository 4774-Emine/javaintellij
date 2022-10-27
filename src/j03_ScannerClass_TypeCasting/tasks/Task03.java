package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */


   Scanner sc=new  Scanner(System.in);
        System.out.println("Günde kaç saat uyuyorsunuz? ");
   int uyku=sc.nextInt();
int aydagün=(uyku*30)/24;
        System.out.println("Ayda uykuda geçen gün miktarı: "+ aydagün + "gün");
        int yıldagün=(uyku*365)/24;
        System.out.println("Yılda uykuda geçen gün miktarı:"+yıldagün+"gün");
int kırk=yıldagün*40;
        System.out.println("40 yıllık uyku süreniz: "+ kırk+"gün");//4840 çıkıyor
    }
}
