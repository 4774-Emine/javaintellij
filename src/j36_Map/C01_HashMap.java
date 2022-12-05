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

        HashMap<String, String> hm = new HashMap<>();
//map.put();-->girilen key,value datayı map'e eleman olarak ekler.
     /*   hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null değer kabul eder.
        hm.put(null, "222 Euro");//tekrarlı key değerine value update edilir. Aynı key kullanılırsa uzerine atama yapılır
        hm.put("Ebay", null);//value dağeri null atanabilir
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("Apple store", "500 Euro");//Apple store key'deki value 333 Euro iken 500 Euro olarak update etti.
        hm.put("MediaMarkt", "183 Euro");
        //map sout komutuna parametre olarak print edilir...
        System.out.println("hm = " + hm);//{null=222 Euro, Saturn=300 Euro, Ebay=null, Apple store=500 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}/*/


        HashMap<String,String>emine=new HashMap<>();
        emine.put("hayat","olumlu bak");
        emine.put("heran","dürüstlük");
        emine.put("sağlık","herşey");
        emine.put("sadakat","güzeldir");
        System.out.println("emine = " + emine);
        System.out.println("emine.keySet() = " + emine.keySet());
        System.out.println("emine.values() = " + emine.values());
        System.out.println("emine.get(\"hayat\") = " + emine.get("hayat"));
        System.out.println("emine.get(\"sabır\") = " + emine.get("sabır"));
        System.out.println("emine.size() = " + emine.size());
        System.out.println("emine.containsKey(\"sağlık\") = " + emine.containsKey("sağlık"));//true
        System.out.println("emine.containsKey(\"adnan\") = " + emine.containsKey("adnan"));//false
        System.out.println("emine.replace(\"heran\",\"vefa\") = " + emine.replace("heran", "vefa"));//dürüstlük
        System.out.println(emine);
        System.out.println("emine.remove(\"hayat\",\"sıcak\") = " + emine.remove("hayat", "sıcak"));//false
        System.out.println("emine.remove(\"hayat\",\"olumlu bak\") = " + emine.remove("hayat", "olumlu bak"));//true
        emine.clear();
        System.out.println(emine.size());


    }
}
