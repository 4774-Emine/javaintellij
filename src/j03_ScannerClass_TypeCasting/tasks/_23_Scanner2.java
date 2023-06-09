package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

        /*   kullanıcının yasını print eden code create ediniz  */

        Scanner scan= new Scanner(System.in);
        System.out.println("Yasinizi Giriniz");

        int yas= scan.nextInt();
        System.out.println("Yasiniz: "+yas);
    }
}