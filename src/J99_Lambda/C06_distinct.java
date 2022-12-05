package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {

        // List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        List<String> menu = new ArrayList<String>(Arrays.asList("bicibici", "melemen", "cacix", "kokerec"));

        alfBkTkszPrint(menu);//ARABAŞI BÜRYAN BİCİBİCİ CACİX GÜVEÇ KOKERÇ KÜŞLEME MELEMEN SOĞANLI TANTUNİ TRİLEÇE YAĞLAMA
        System.out.println("\n   ***   ");
        chrSysTersSıraPrint(menu);//8 7 6 5
        System.out.println("\n   ***   ");
        chrSysBkSıraPrint(menu);
        System.out.println("\n   ***   ");
        sonHrfTrsPrint(menu);//
        System.out.println("\n   ***   ");
        charKaresiCiftElSirala(menu);
        System.out.println("\n   ***   ");


    }//main sonu

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

    public static void alfBkTkszPrint(List<String> menu) {

        menu.
                stream().
                map(String::toUpperCase).
                sorted().
                distinct().//akıs elemanları benzersiz-tekrarsız yapıldı
                // forEach(C01_LambdaExpression::yazdir);//CTE-> yazdır data type int
                        forEach(t -> System.out.print(t + " "));

        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
    }


    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

    public static void chrSysTersSıraPrint(List<String> menu) {
        menu.
                stream().
                map(String::length).//akısdaki string elemalr karakter sayısına update edildi
                sorted(Comparator.reverseOrder()).
                distinct().forEach(t -> System.out.print(t + " "));
    }

    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz...
    public static void chrSysBkSıraPrint(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.
                        comparing(String::length)).//akısdaki string elemanların lenght'ine göre doğal sıra yapıldı
                forEach(t -> System.out.print(t + " "));
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHrfTrsPrint(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.
                        comparing(t -> t.toString().charAt(t.toString().length() - 1)).
                        reversed()).
                forEach(t -> System.out.print(t + " "));
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    public static void charKaresiCiftElSirala(List<String> menu) {
        menu.
                stream().//akısa alndı
                map(t -> t.length() * t.length()).//akısdaki string elemanları boyutlarının karesine update edildi
                filter(C01_LambdaExpression::ciftMi).//cift elelmalar filtrelendi
                distinct().//tekrarsız yapıldı
                sorted(Comparator.reverseOrder()).//ters b->k sıra yapıldı
                forEach(C01_LambdaExpression::yazdir);// print edildi
    }
}
