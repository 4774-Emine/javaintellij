package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("isminiz");
        String isiminiz= scan.next();

        System.out.println("soy isminiz");
        String soyisminiz=scan.next();

        System.out.println("yasiniz");
        int yasiniz= scan.nextInt();

        System.out.println("kilonuz");
        int kilonuz= scan.nextInt();

        System.out.println("boyunuz");
        int byunuz= scan.nextInt();

        System.out.println("salona devam edeceginiz ay suresi");
        int sure= scan.nextInt();

        System.out.println("odemeniz gereken ucret: "+sure*20+"$");

    }
}
