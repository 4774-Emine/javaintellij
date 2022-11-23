package j36_Map;

import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {

/*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HasMap key-value yapisini kullanir. Key ve value
            programci tarafindan yazilir.
            Key ve value'da null degeri kullanilabilir. Key'de
            1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri
            kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de
            value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler ekrana yazdirirken rastgele siralama yapar
            HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */

HashMap<String,String>hm=new HashMap<>();
//map.put();-->girilen key,value datayı map'e eleman olarak ekler.
        hm.put("Amazon","296 Euro");
        hm.put(null,"200 Euro");//key null değer kabul eder.
        hm.put(null,"222 Euro");//tekrarlı key değerine value update edilir. Aynı key kullanılırda uzerine atama yapılır
        hm.put("Ebay",null);//value dağeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("Apple store","500 Euro");//Apple store key'deki value 333 Euro iken 500 Euro olarak update etti.
        hm.put("MediaMarkt","183 Euro");
        //map sout komutuna parametre olarak print edilir...
        System.out.println("hm = " + hm);//{null=222 Euro, Saturn=300 Euro, Ebay=null, Apple store=500 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}


    }
}
