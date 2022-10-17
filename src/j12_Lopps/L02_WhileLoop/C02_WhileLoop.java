package j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();

        System.out.println(rakamTopla(sayi));//method call
    }//main sonu

    private static int rakamTopla(int sayi) {

        int rakamToplamı=0;
        while (sayi>0) {//sayı 1 olana dek body action çalış

        rakamToplamı+=sayi%10;// sayının birler basamağı rakamToplamına eklendi
            sayi/=10;// sayı 1 basamak eksiltildi
        }
   return rakamToplamı;
    }


}
