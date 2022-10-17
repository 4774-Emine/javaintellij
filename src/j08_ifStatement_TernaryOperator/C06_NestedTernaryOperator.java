package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
         /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

       /*
       ahan da TRICK : Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
                Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.

        */
        Scanner sc = new Scanner(System.in);

        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi = sc.nextInt();
        System.out.println(agaSayisi >= 0 ? (agaSayisi < 10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi");


    }
}
