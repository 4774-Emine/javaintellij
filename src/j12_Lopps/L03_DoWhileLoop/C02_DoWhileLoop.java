package j12_Lopps.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //task-> girilen sayı 17 den kucuk ise "kazandınız" print eden  değilse ise sayı girişi isteyen
        //  code create ediniz...

        Scanner sc =new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");

           sayi= sc.nextInt();

            sayi++;
        }while (sayi>=17);
        System.out.println(sayi+" için kazandınız... :) ");

    }
}
