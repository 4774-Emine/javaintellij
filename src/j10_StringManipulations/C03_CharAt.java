package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        index değeri 0'dan başlar
         */
        String sehir = "Istanbul";
        System.out.println("sehir.charAt(5) = " + sehir.charAt(5));//sehir.charAt(5) = b
        char besinciİndexKrkt = sehir.charAt(5);
        System.out.println(besinciİndexKrkt);//b
        //son index karakteri --> length()-1

        System.out.println(sehir.charAt(sehir.length() - 1));//l
        //ilk index karakter --> charAt(0)

        System.out.println(sehir.charAt(0));//I

       // System.out.println(sehir.charAt(18));// rte
        //TRICK-> charAt() index boyutunu geçerse rte verir

        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri print eden code create ediniz...
        Scanner sc =new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime= sc.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()) / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");


    }
}
