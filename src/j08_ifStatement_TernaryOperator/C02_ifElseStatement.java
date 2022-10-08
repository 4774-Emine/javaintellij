package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /*
        TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("yasınızı giriniz :");
        int yas = sc.nextInt();
        // if (yas>18){
        //     System.out.println("yasınınz 18 den buyuk");
        // }
         /*
        TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
            18 den kuçuk ise ehliyet alamazsınız print ediniz
                    */
        if (yas >= 18) {//girilen yasın 18den buyuk ve esit olmasını kontrol eder
            System.out.println("yasınız 18 den kucuk değil");
        } else {
            System.out.println("ehliyet alamazsınız");//if sartı sağlamazsa->yas 18den buyuk ve eşit değil
        } //yasın 18 den küçük olması

    }
}
