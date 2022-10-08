package j12_Lopps.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        //Task-> girilen sayıdan 100 ekadar 4 un katı tamsayıları print eden code create ediniz..

        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz");
        int sayı = sc.nextInt();

        if (sayı > 100) {
            System.out.println("100 den küçük giriniz");
        } else {
            for (int i = sayı; i < 100; i++) {//100 değeri foru çalıştırmaz 98 foru çalıştırı ama for içindeki if çalışmaz
                if (i % 4 == 0) {
                    System.out.println(i);
                }
            }


        }
    }
}