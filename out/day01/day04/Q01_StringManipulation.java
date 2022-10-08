package day01.day04;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        
     Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi giriniz : ");
        String firstname=scan.nextLine(),lastName=scan.nextLine();
        String fulName=firstname.concat(" "+lastName).toUpperCase();
        System.out.println("fulName = " + fulName);


    }

  


}
