package j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static <HashTable> void main(String[] args) {

        /*
        HashTable->
        HashMap'e kullanılan tüm methotlar hashtable obj ile de call edilir.
        1-HashMap ve TreeMap thread-safe ve synchronized olmadğı için Map'ler arasında thread-safe ve synchronized olan bir map'e
        ihtiyac olduğundan Hashtable kullanılmıştır.
        2-HashTable HashMape göre daha yavaştır.
        3-HashTable key ve valuelerde null değere izin vermez.
        4-HashTable elelman ataması yapılırken HashMap randum(rastgele:hurra)yaoar.
         */
        Hashtable<String, String> ht = new Hashtable();
        ht.put("kebab", "adana");
        ht.put("döner", "sivas");
        ht.put("köfte", "tekirdağ");
        ht.put("çorba", "beyran");
        ht.put("söğüş", "");
        System.out.println("ht = " + ht);//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, kebab=adana}
        ht.put("döner", "dönerse senindir :)");//döner key update edilir key'de dublicate değil üzerine value ataması yapar
        System.out.println("ht = " + ht);//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=dönerse senindir :), kebab=adana}
        // ht.put(null,"trileçe");//RTE->NullPointerException
        // ht.put("kahve",null);//RTE->NullPointerException
        System.out.println("agam selametle dewamkeee...");

        Hashtable<String ,String > ht1 = new Hashtable<>();
        ht1.put("salata","patlıcan közleme");
        ht1.put("ara sıcak","içli küfte");
        System.out.println("ht1 = " + ht1);//{salata=patlıcan közleme, ara sıcak=içli küfte}

        ht.putAll(ht1);
        System.out.println("ht = " + ht);//{köfte=tekirdağ, salata=patlıcan közleme, söğüş=, çorba=beyran, döner=dönerse senindir :) , ara sıcak=içli küfte, kebab=adana}
        System.out.println("ht1 = " + ht1);
    }
}



