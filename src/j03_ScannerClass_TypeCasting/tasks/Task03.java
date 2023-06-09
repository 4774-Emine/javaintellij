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

        Scanner scan = new Scanner(System.in);
        System.out.println("gunde ortalama kac saat uyursunuz?");

        int ortGunlukUykuSaati = scan.nextInt();
        System.out.println("Aylık uyku saatiniz: " + ortGunlukUykuSaati * 30);
        System.out.println("yillik uyku saatiniz: " + ortGunlukUykuSaati * 365
        );
        System.out.println("40 yillik uyku saatiniz: " + ortGunlukUykuSaati * 365 * 40);
    }
    }

