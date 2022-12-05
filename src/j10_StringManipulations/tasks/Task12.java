package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        Scanner sc=new Scanner (System.in);
        System.out.println("1.adınızı giriniz:");
        String str1=sc.nextLine();
        System.out.println("2.adınızı giriniz:");
        String str2=sc.nextLine();
        System.out.println("soyadınızı giriniz:");
          String soyAd=sc.nextLine();
        System.out.print(str1.toUpperCase().charAt(0)+".");
        System.out.print(str2.toUpperCase().charAt(0)+".");
        System.out.print(soyAd.toUpperCase().charAt(0)+".");





    }
}
