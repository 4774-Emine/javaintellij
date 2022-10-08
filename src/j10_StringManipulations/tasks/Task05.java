package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
/* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
  Scanner sc=new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz : ");
        String ad=sc.next();
        System.out.println("lütfen saoadınızı giriniz : ");
        String soyad=sc.next();

        System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1));
        System.out.println(soyad.substring(0,1).toUpperCase()+soyad.substring(1));


    }
}
