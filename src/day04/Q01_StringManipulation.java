package day04;

import java.util.Scanner;

public class Q01_StringManipulation {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminiz ve soyisminizi giriniz :");
        String firstName = scan.nextLine(), lastName = scan.nextLine();
        
        String fulName = firstName.concat(" " + lastName).toUpperCase();
        System.out.println("fulName = " + fulName);
    }

}
