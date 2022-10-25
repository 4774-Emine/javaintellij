package random;

import java.util.Scanner;

public class C5_ConsoleMinMax {
    public static void main(String[] args) {

    //console üzerinden max ve min değeri sağlayınız
    //ve buradan gelen rakamları Math.random() da olmasını istediğiniz aralığa getiriniz

    Scanner sc=new Scanner (System.in);
        System.out.println("sayi1 : "); int sayi1=sc.nextInt();
        System.out.println("sayi2 : "); int sayi2=sc.nextInt();


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

















