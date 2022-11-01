package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_Arrays {

    //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz ");
        String verilenCumle= scan.nextLine().trim();

        int kelimeSayisi=0;


        String[]ArrayCumle=verilenCumle.split(" ");
        kelimeSayisi=ArrayCumle.length;
        System.out.println(kelimeSayisi);

        //2.yol

        System.out.println("lütfen bir cümle giriniz");
        String cumle = scan.nextLine().trim();

        String[] kelimeSayisi2= cumle.split("\\s");
        System.out.println(Arrays.toString(kelimeSayisi2));

        int kelimeSayisinum = kelimeSayisi2.length;
        System.out.println("kelimeSayisi = " + kelimeSayisinum);

    }
}
