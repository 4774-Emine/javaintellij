package j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {
        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var

        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        int bolenSayi = 1;
        int tamBolenAdedi = 0;

        while (bolenSayi <= sayi) {

            if (sayi % bolenSayi == 0) {//sayi bolenSayıya tam bölünme şartı
                tamBolenAdedi++;

            }
            bolenSayi++;//lopp sonsuza düşmemesi için ve diğer sayılarun böldüğü kontrol edilmesi için yazıldı
        }

        System.out.println("agam girdiğin " + sayi + " nın " + tamBolenAdedi + " kadar tam boleni var :)");


    }
}
