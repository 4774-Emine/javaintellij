package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *

        */
 Scanner sc=new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz:");
        double boy = sc.nextDouble()/100;
        System.out.println("Kilonuzu kg olarak giriniz: ");
        double  kilo=sc.nextDouble();

        //int vke=kilo/(boy*boy);
        System.out.println("vücut kütle endeksiniz = " + (kilo/(boy*boy)));


    }
}
