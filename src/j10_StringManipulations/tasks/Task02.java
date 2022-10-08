package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

/** Girilen passwordun aşağıdaki şartları sağlamasını kontrol eden code create ediniz
 * a)ilk karakteri büyük harf olmalı
 * b)son karakteri sayı olmalı
 * c)en az 6 karakter uzunluğunda olmalı
 */

   Scanner sc=new Scanner(System.in);

        System.out.println("password girişi yapınız: ");
        String password=sc.next();


        if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&//a şartı
                (password.charAt(password.length()-1)>='0'&& password.charAt(password.length()-1)<='9')&&//b şartı
                (password.length()>=6)) {//c şartı
            System.out.println("password geçerli");
        }else System.out.println("password geçersiz");

    }
}
