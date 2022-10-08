package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz
        Scanner sc = new Scanner(System.in);

        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi = sc.nextInt();
    //int sonuc=agaSayisi%2==0 ? agaSayisi/2 : "girilen sayı tek oldugu için yarısı tamsayı değildir";

        /*
        ahan da TRICK -> ternary iki durum(T/F) için farklı data type çıktısı veriyorsa variable atama yapmadan sout yapılmalı
        ya da ternary çıktısı aynı data type serializable edilmeli...

         */
        System.out.println(agaSayisi % 2 == 0 ? agaSayisi / 2 : "girilen sayı tek oldugu için yarısı tamsayı değildir");

    }
}
