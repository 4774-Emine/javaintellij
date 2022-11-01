package day10.random;

import java.util.Scanner;

public class C5_ConsoleMinMax {

    public static void main(String[] args) {

        // Console uzerinden maximum ve minimum degeri saglayiniz
        // ve buradan gelen rakamlari Math.random() da olmasini istediginiz araliga getiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi1 :"); int sayi1 = scan.nextInt();
        System.out.println("sayi2 :"); int sayi2 = scan.nextInt();

        System.out.println(Math.max(sayi1, sayi2));

        if(sayi1>sayi2){
           int random =  (int) (Math.random() * sayi1);
            System.out.println("random = " + random);
        }else {
            int random =  (int) (Math.random() * sayi2);
            System.out.println("random = " + random);
        }



        //2.yol
        int randomNum =(int) (Math.random() * ((Math.max(sayi1,sayi2) - Math.min(sayi1,sayi2)) + 1)) + Math.min(sayi1,sayi2);
        System.out.println("randomNum = " + randomNum);
    }
}
