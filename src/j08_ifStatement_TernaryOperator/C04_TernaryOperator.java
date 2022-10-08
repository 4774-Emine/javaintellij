package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
// TASK-> girilen  bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.

        Scanner sc = new Scanner(System.in);

        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi = sc.nextInt();
        System.out.println(agaSayisi > 9 ? " sayı iki veya daha fazla basamaklı  " : "sayı tek basamaklı");

      String sonuc =( agaSayisi > 9 ||agaSayisi<-9)? " sayı iki veya daha fazla basamaklı  " : "sayı tek basamaklı";
        System.out.println(sonuc);



    }
}
