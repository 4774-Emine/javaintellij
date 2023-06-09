package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

    /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */

        Scanner scan= new Scanner(System.in);
        System.out.println("arabanızda kaç kapı vardir?");

        int kapisayisi= scan.nextInt();
        System.out.println("araç kapi sayiniz: "+kapisayisi);

    }
}


