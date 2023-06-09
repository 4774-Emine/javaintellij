package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

        Scanner scan= new Scanner(System.in);
        System.out.println("en sevdiginiz meyve nedir?");
         String meyveAdi= scan.next();
        System.out.println("en sevdiğiniz meyve: "+meyveAdi+ " öyle mi");
    }
}
