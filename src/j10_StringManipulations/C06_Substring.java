package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {

    public static void main(String[] args) {

/**
 substring()
 Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
 substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
 substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
 indexi'e kadar parçayı return eder
 baslangic indexi ==> inclusive/dahil
 bitis indexi ==> eclusive/haric
 */
    /*    String str = "Java bilen sırtı yere gelmez";
        System.out.println(str.substring(10));//sırtı yere gelmez
        //str datasının son 10 karakterini print ediniz
        System.out.println(str.substring(str.length() - 10));

//str datasının ilk 10 karakterini print ediniz
        System.out.println(str.substring(0, 10));
        //str datasının ilk karakterini print ediniz
        System.out.println(str.substring(0, 1));//j-> alır 1 almaz yani0.karakter ilk karakteri verir


        //TASL->girilen 4 harfli kelimeyi tersten print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("dört harfli kelime giriniz : ");
        String kelime = sc.next();
        if (kelime.length() != 4) {
            System.out.println("agam 4 harfli gir");
        } else


            System.out.println(kelime.substring(kelime.length() - 1));//e
        System.out.println(kelime.substring(2, 3));//l
        System.out.println(kelime.substring(1, 2));//a
        System.out.println(kelime.substring(0, 1));//k
*/

       String str="java bilen sırtı yere gelmez :) ";
        System.out.println(str.substring(5 ));
        //str datasının son 10 karakterini print ediniz
        System.out.println(str.substring(str.length() - 10));


      //  str datasının ilk 8 karakterini yazınız
        System.out.println(str.substring(0, 8));

        //str datasının ilk karakterinin print ediniz
        System.out.println(str.substring(0, 1));
        //TASK-> GİRİLEN 4 HARFLİ KELİMEYŞ TERSTEN PRİNT EDEN CODE CREATE EDİNİZ

        Scanner sc=new Scanner(System.in);
        System.out.println("Dört harfli kelime giriniz : ");
        String kelime=sc.next();
        if(kelime.length()!=4){
            System.out.println("4 harfli giriniz : ");
        }else {
            System.out.print(kelime.substring(kelime.length()-1));
            System.out.print(kelime.substring(2,3));
            System.out.print(kelime.substring(1,2));
            System.out.print(kelime.substring(0,1));
        }





    }
}
