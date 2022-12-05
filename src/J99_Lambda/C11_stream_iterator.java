package J99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {
    public static void main(String[] args) {

        System.out.println("TASK01--> amele topla : " + toplaAmele(10));//55
        System.out.println("   ***   ");
        System.out.println("TASK01--> cincix topla : " + toplaCincix(10));//55
        System.out.println("   ***   ");
        System.out.println("TASK02--> cincix çift topla : " + toplaCift(24));//156
        System.out.println("   ***   ");
        System.out.println("TASK03--> cincix ilk 10 çift topla : " + toplaİlkXCiftSayi(10));//110
        System.out.println("   ***   ");
        System.out.println("TASK04--> cincix ilk 10 tek topla : " + toplaİlkXTekSayi(10));//100
        System.out.println("   ***   ");
        System.out.println("TASK05-->");
        ikininİlkXKuvvetiPrint(7);//2 4 8 16 32 64 128
        System.out.println("   ***   ");
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(7, 5));
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(3, 5));//243
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(2, 3));//8
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(10, 2));//100
        System.out.println("   ***   ");


    }//main sonu

        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.

    //Structured Programming(Amele coding...)
    public static int toplaAmele(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }

    //Functional Programming(cincix code...)
    public static int toplaCincix(int x) {

        return IntStream.//manual akıs tanımlandı
                range(1, x + 1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir code create ediniz
    public static int toplaCift(int x) {

        return IntStream.//manual akıs tanımlandı
                // range(1,x+1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                        rangeClosed(1, x).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                        filter(C01_LambdaExpression::ciftMi).//akısdaki tamsayıların çift olanları akısa alındı
                        sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.
    }

    //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.
    public static int toplaİlkXCiftSayi(int x) {

        return IntStream.
                iterate(2, t -> t + 2).//2'den başlayıp 2 artırılan tekrar işlemi tanımlandı->2,4,6,8.....
                        limit(x).//akısdaki ilk x eleman akısa alınır
                        sum();//akısdaki ilk x eleman toplandı
        //iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa alır.
    }

    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int toplaİlkXTekSayi(int x) {

        return IntStream.
                iterate(1, t -> t + 2).//1'den başlayıp 2 artırılan tekrar işlemi tanımlandı->1,3,5...
                        limit(x).//akısdaki ilk x eleman akısa alındı.
                        sum();//akısdaki ilk x eleman toplandı
    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran code  create ediniz.
    public static void ikininİlkXKuvvetiPrint(int x){
        IntStream.
                iterate(2,t->t*2).//2'den başlayıp 2 ile çarpılarak tekrar işlemi tanımlandı->2,4,8...
                limit(x).//akısdaki ilk x eleman akısa alındı.
                forEach(C01_LambdaExpression::yazdir);

    }

        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.

        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.

    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.
    public static OptionalInt istenenSayiXKuvvet(int istenenSayi, int x){
        return  IntStream.
                iterate(istenenSayi,t->t*istenenSayi).//istenenSayi'den başlayıp istenenSayi ile çarpılarak tekrar işlemi tanımlandı
                        limit(x).//akısdaki ilk x eleman akısa alındı.
                        skip(x-1).//akısdaki x den önceki elelmanlar atlandı klanlar akısa alındı
                        findFirst();//akısdaki ilk eleman :x. elelman alındı

    }
}

