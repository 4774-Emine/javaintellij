package day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isim = scan.next();
        String soyIsim = scan.next();


        if(isim.length()>soyIsim.length())
            System.out.println("isminiz daha uzun");
        else if(isim.length()==soyIsim.length())
            System.out.println("isim ve soyisim uzunluklari esit");
        else System.out.println("soyisminiz daha uzun");

    }

}