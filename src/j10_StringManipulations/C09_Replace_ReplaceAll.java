package j10_StringManipulations;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {


        /** replace()
         * Metin içerisindeki karakter ya da bir parçasının istenilen karakter ya da metin ile değiştirilmesini
         * (update-set) sağlar. Sonuç string dir..
         */

        String str = "javaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '@'));//j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer
        System.out.println(str.replace("can", "kan"));//javaCAN'lara selam olsun java ile bolkana offer
        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println(str.replaceFirst("a", "@"));//j@vaCAN'lara selam olsun java ile bolcana offer

// replaceAll() metho u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

        str = "    javaCAN'lara selam olsun :)  java ile 123455544 offer ***   ";
        System.out.println(str.replaceAll("\\s", "+"));//++++javaCAN'lara+selam+olsun+:)++java+ile+123455544+offer+***+++
        System.out.println(str.replaceAll("\\S", "+"));//++++++++++++ +++++ +++++ ++  ++++ +++ +++++++++ +++++ +++
        System.out.println(str.replaceAll("\\w", "+"));//+++++++'++++ +++++ +++++ :)  ++++ +++ +++++++++ +++++ ***
        System.out.println(str.replaceAll("\\W", "+"));//++++javaCAN+lara+selam+olsun+++++java+ile+123455544+offer+++++++
        System.out.println(str.replaceAll("\\d", "+"));//javaCAN'lara selam olsun :)  java ile +++++++++ offer ***
        System.out.println(str.replaceAll("\\D", "+"));//++++++++++++++++++++++++++++++++++++++++++123455544+++++++++++++


        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234

        String isim = "Çiğdem";
        String soyad = "Şen";
        String kartNo = "123456789123456";


        String yeniIsim = isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*");
        String yeniSoyIsim = soyad.charAt(0) + isim.substring(1).replaceAll("\\w", "*");

        String yeniKartNo = "**** **** **** ****" + kartNo.substring(12);

        System.out.println("isim-soyisim :" + yeniIsim + " " + yeniSoyIsim + " kart no : " + yeniKartNo);


    }
}
