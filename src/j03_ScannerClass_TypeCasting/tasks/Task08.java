package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

Scanner sc=new Scanner(System.in);
        System.out.println("1. vize notunuzu giriniz:");
      double v1=sc.nextDouble();
        System.out.println("2. vize notunuzu giriniz:");
       double v2=sc.nextDouble();
        System.out.println("Final notunuzu giriniz: ");
      double fnl=sc.nextDouble();


double vizeOrt=(v1+v2)/2;

        System.out.println("Geçme notunuz: "+ ((vizeOrt*0.30)+(fnl*0.70)));

    }
}
