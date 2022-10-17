package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
        ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
        Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
        daha basic code'lar bulunur.

        */
        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz
        //1.Way: if-else
        int a = 0;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degil");
        }
        //2.Yol: ternary
        //Condition   ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc =     a>0      ?           "Pozitif"                    :            "Pozitif degil";
        System.out.println(sonuc);

        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz
        int b = 23;
        int c = 23;
        int min = b<c ? b : c;
        System.out.println(min);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.
        int d = 0;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "Islem yapamam" mesaji veriniz
        int e = 12;
        int f = 10;

        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "Object" yapiniz.
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam";
        System.out.println(islem);

        //Note: Java'da her class'in en az bir tane "parent" class'i vardir.
        //      Sadece "Object" class'in "parent" class'i yoktur.
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner sc = new Scanner(System.in);

        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi = sc.nextInt();

        System.out.println("   ***  if-else   ***   ");

        if (agaSayisi % 2 == 0) {

            System.out.println("agam sayi ÇİFT");

        } else System.out.println("agam sayi TEK ");


        System.out.println("   ***  ternary   ***   ");
     // String sonuc  =(agaSayisi%2==0 ? "agam sayı ÇİFT" :"agam sayi TEK");//komut cıktısı String  type variable
     //   System.out.println("sonuc = " + sonuc);

        System.out.println(agaSayisi % 2 == 0 ? "agam sayı ÇİFT" : "agam sayi TEK");

        /*
        ahan da TRICK->  ternary operator işlem sonucunda true veya false göre bir cıktı verir.
        eger bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edlimeli.
         */

        // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.

        System.out.println("   ***   TASK02   ***   ");
        System.out.println(agaSayisi < 0 ? "agam sayı NEGATİF" : "agam sayı nagatif değil");

    }


}
