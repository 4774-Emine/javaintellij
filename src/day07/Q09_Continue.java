package day07;

import java.util.Scanner;

public class Q09_Continue {
    /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */

    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cumle giriniz = ");  //ah su java
        String cumle=oku.nextLine();

        for(int i=0; i< cumle.length() ; i++)
        {
            if (cumle.charAt(i) == 'a' || cumle.charAt(i)==' ')
                continue; // continue calistigi anda artısa direk gider, yani döngünün devami
            // bu adım çalışmaz.(atla devamet)

            System.out.println(cumle.charAt(i));
            //  h
            //  s
            //  u
            //  j
            //  v
        }
    }

}
