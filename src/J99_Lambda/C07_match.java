package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        hrfSys7DenAzKontrol( menu);
        System.out.println("\n   ***   ");
        wİleBaslayanKontrol(menu);
        System.out.println("\n   ***   ");
        xİleBitenKontrol( menu);
        System.out.println("\n   ***   ");



    }//main sonu


    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    // Task : List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.->

    public static void hrfSys7DenAzKontrol(List<String> menu){


       boolean kontrol= menu.stream().allMatch(t->t.length()<=7);
       if (kontrol){//amele code
           System.out.println(  "agam menudekiler 7 ve daha az  karakterden oluşuyor : )");
       }else System.out.println(  "agam menudekiler 7 karakterden fazla :( ");
       //cincix code
        System.out.println( menu.stream().allMatch(t->t.length()<=7)?"agam menudekiler 7 ve daha az  karakterden oluşuyor : )":"agam menudekiler 7 karakterden fazla :( ");


    }
    // Task : List elemanlarinin "W" ile baslamasını kontrol ediniz.->noneMatch

    public static void wİleBaslayanKontrol(List<String> menu){

        System.out.println(
                menu.
                stream().
                noneMatch(t -> t.toLowerCase().startsWith("w")) //akısdaki hiç bir eleman w ile başlamaz kontrolu yapıldı->sart
                ? "agam w ile başlayan yemahh olur mu :(" //sart true ise print edilecek
                : "agam wenemen ne menem bişey");//sart false ise print eder

    }
    // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void xİleBitenKontrol(List<String> menu){

        System.out.println(
                menu.
                        stream().
                        anyMatch(t -> t.toLowerCase().endsWith("x")) //akısdaki enaz bir eleman x ile biter kontrolu yapıldı->sart
                        ? "agam senden bir cacix olmaz o-la-mazzz :(" //sart true ise print edilecek
                        : "agam senin yemahhh bu torpaklarda yoğğğ :) ");//sart false ise print eder

    }

}
