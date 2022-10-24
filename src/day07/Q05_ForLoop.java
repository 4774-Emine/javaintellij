package day07;

import java.util.Scanner;

public class Q05_ForLoop {

    /* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int toplam =0;
        int count =0;


        for (int i = 0; i < 100; i++) {
            System.out.print("sayi giriniz : ");
            count++;
            int sayi = scan.nextInt();
            toplam+=sayi;

            if (toplam>100){
                System.out.println(count + " kere sayi girdin. Bu kadar sayi yeter ");
                System.out.println("toplam = " + toplam);
                break;
            }
            System.out.println("toplam = " + toplam);

        }
    }

}
