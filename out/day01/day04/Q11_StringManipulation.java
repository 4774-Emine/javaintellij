package day01.day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

Scanner scan=new Scanner(System.in);
String isim=scan.next();
String soyIsim=scan.next();

if(isim.length()>soyIsim.length())
    System.out.println("isminiz soyisminizden büyük");
else if(isim.length()==soyIsim.length())
    System.out.println("isim ve soyisim uzunlukları eşit");
else System.out.println("soyIsminiz daha uzun");


    }
    }
