package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


Scanner sc=new Scanner(System.in);
        System.out.println("üçgenin 1.kenarını giriniz: ");
        int ilkke=sc.nextInt();
        System.out.println("üçgenin 2.kenarını giriniz: ");
        int sonke=sc.nextInt();
        double h=((ilkke*ilkke)+(sonke*sonke));

        System.out.println("Hipotenüs uzunluğu= "+ Math.sqrt(h));


    }
}
