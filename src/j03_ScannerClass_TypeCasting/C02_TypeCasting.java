package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {


	/*
		 byte < short < int < long < float < double
			Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina Java  otomatik olarak yapar.

		 */
        //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
        //              byte < short < int < long < float < double
        //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

        boolean basarılı = true;
        //String basarı=basarılı; -> dogal uyum olmayan variable'larda castşng yapılamaz CTE
        // System.out.println("basarılı = " + basarılı);-> true
        // System.out.println("basarı = " + basarı);->true


        double d = 17;// double variable'a int 17 atandı k->b
        System.out.println("d = " + d);//d = 17.0 auto widding
        int sayi1 = 33;
        int sayi2 = 7;

        System.out.println(sayi1 / sayi2);// 4
        /*
        java iki int sayiyi biribirine böldugunuzde sonucu int verir
         eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */
        byte b = 127;
        int i = b;//k->b aw
        System.out.println("i = " + i);//127

        int num = 1453;
        double d1 = 17; //num;//k->b aw
        System.out.println("d1 = " + d1);//1453.0
        // double->b     int->k
        double db = d1 / num;//TRICK-> iki farklı data type sayi işleme girerse java
        // kucuk olan data type turu için aw yapar sonucu buyuk olan data type  olarak verir

        System.out.println("db = " + db);//db = 0.01169993117687543

        /*
		 byte < short < int < long < float < double
		 Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
		 Java otomatik olarak yapmaz. kod ile teyit ister...

		 */
        double d2 = 14.53;
        int num2 = (int) d2;//b->k
        System.out.println("num2 = " + num2);//14

        int num3 = 150;
        byte b1 = (byte) num3;
        System.out.println("b1 = " + b1);//b1 = -106

        double d3 = 333;
        long l = (long) d3;
        System.out.println("l= " + l);//333

        double d4 = 571.9444;
        long l2 = (long) d4;
        System.out.println("l2 = " + l2);//l2 = 571



        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         */
        Scanner sc = new Scanner(System.in);//1 adım
        System.out.println("ascii değeri istediğin karakteri gir : ");//2 adım
        char ch = sc.nextLine().charAt(0);


        int chasciiDegeri = ch;
        System.out.println(ch + "'ın chasciiDegeri = " + chasciiDegeri);//$'ın chasciiDegeri = 36

//******************AHMET HOCA***************************
        /*bir data türündeki variable ya başka data türünden değer atanabilir mi?
      bazı data türleri değer olarak başka data türündeki değerleri ASLA KABUL ETMEZ.

      Sayısal değer alan primitive data türlerinde ise daha kapsamlı olan  data türündeki variable,daha dar
      kapsamlı data türündeki değeri otomatik olarak kabul eder.

*/
        byte x = 12;
        int z = x; //byte değerini int değerine genişlettik. JAVA BU ŞEKİLDE KÜÇÜKTEN BÜYÜĞE GEÇİŞİ OTOMATİK OLARAK YAPAR.
        double y = z;


        // Data Casting
        int in1 = 10;
        int in2 = 140;

        //short sh1=in1; -->hata verir.büyük kovadaki su küçük kovaya sığmaz. Burada kendimiz elle yazıyoruz.
        byte sh1 = (byte) in1;
        System.out.println("sh1 = " + sh1);
        byte sh2 = (byte) in2;
        System.out.println("sh2 = " + sh2); // -116  (byte -128 ile 128 arasını alıyor)


        double dbl1 = 99.99;
        double dbl2 = 14.01;

        int sayi= (int) dbl1; //int e çevrilirken ondalık kısım atılır.
        System.out.println("99.99 int olarak  = " + sayi);



        char ch1='a';
        char ch2='b';
        System.out.println(ch1+ch2);//195--> cjhar data türü ascii tablosu ile ortak çalışır.

        //kullanıcıdan bir karakter alın.
        //ascii tablosuna göre o karakterden sonraki 3 karakteri girin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz:");
        char girilenchar=scan.next().charAt(0);
        System.out.println("girilen karakter sonraki 3 karakter: " + (girilenchar+1)+ (girilenchar+2)+ (girilenchar+3));
        //sonuçları bana char olarak vermesini istersem;
        System.out.println("girilen karakter sonraki 3 karakter: " + (char)(girilenchar+1)+ (char)(girilenchar+2)+ (char) (girilenchar+3));


    }
}
