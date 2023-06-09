package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */
        Scanner scan= new Scanner(System.in);
        System.out.println("10 yil once yasadiginiz sehir?");

        String sehirIsmi= scan.next();
        System.out.println("10 yil once yasadiginiz sehir: "+sehirIsmi);

    }
}
