package j12_Lopps.L02_WhileLoops;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda for loop ama
         adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda while loop kullanılmalı*/

        //Task01->11 den 20 ye kadar olan tamsayıları print eden code create ediniz...
        System.out.println("  *****for çözüm*****  ");
        for (int i = 11; i < 21; i++) {
            System.out.println(i);
        }

        System.out.println("  *****While çözüm ******");
        int basla = 11;//while başlangıç değeri


        while (basla < 21) {//basla 21 den küçük olduğu sürece (iken)body action uygula
            System.out.println(basla + " ");
            basla++;//while döngü değişim komutu basla+=1;


        }
    //Task->7 kere javaCAN print eden code create ediniz...
        System.out.println("******task02*****");
    int b=1;
        while(b<8){
            System.out.println(b+". javaCAN");
          b++;//burası olmazsa sonsuz döngüye girer
        }


//Task03-> 2 basamaklı tek sayıları yanayana print eden code create ediniz...
        System.out.println("****task03******");
        b=11;
        while (b<100){
            System.out.println(b+" ");
            b+=2;//her iki arttırmada b=11,13,15,....99sürekli tek sayı verir

        }



        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin=sc.nextLine();
        int metinUzunluk=metin.length();

        while(metinUzunluk>=1){//metnin uzunluğu 0 a eşit ve büyük iken
            System.out.print(metin.charAt(metinUzunluk-1));//
            metinUzunluk--;
        }


//Task->girilen tamsayıya kadar olan tamsayıların toplamını print eden code create ediniz...
        System.out.println("*****task05*****");
        System.out.println("bir tamsayı giriniz");
        int sayi=sc.nextInt();
        int toplam=0;//döngü actiondan oluşacak toplam için bir int oluşturuldu
        while(sayi>0){//sayı 1 olana dek
            System.out.println((toplam += sayi));//her döngüde sayıyı toplama ekle
            sayi--;//her döngüde sayıyı bir azalt ki dünya döndükçe dönmesin.!!


            //Task06->.Girilen tamsayının faktöriyelini print eden code create ediniz..

            System.out.println("******task06******");

            int faktoriyel=1;
            while (sayi > 0) {//sayı 1 olana dek body de ne varsa yap
                faktoriyel*=sayi;
                sayi--;
            }
            System.out.println("girdiğin sayını faktoriyeli:" + faktoriyel);

            }











    }
}