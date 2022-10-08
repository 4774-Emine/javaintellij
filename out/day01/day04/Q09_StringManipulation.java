package day01.day04;

import java.util.Scanner;

public class Q09_StringManipulation {
    public static void main(String[] args) {


           /*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */


      Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String s =scan.nextLine();
        char ortancaKrk=s.charAt((s.length()-1)/2);
        if (s.length()%2==1 && s.length()>=3) {

        System.out.println("ortanca karakter:" + ortancaKrk);
        }else {
            System.out.println("kelimeyi tek sayılı girin");}








    }


}
