package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("ad soyad giriniz");
        String adSoyad = sc.nextLine();
        String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        String soyad = adSoyad.substring(adSoyad.indexOf(" "));
        System.out.println("ad" + ad);
        System.out.println("soyad" + soyad);


    }
}
