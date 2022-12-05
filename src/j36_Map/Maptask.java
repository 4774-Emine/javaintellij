package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Maptask {
    public static void main(String[] args) {

//5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
//5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
//5 tane ulke ismi yazdırıyoruz. (keyset())
//5 tane ulke nufusunu yazdırıyoruz. (values())
//nüfusların toplamını yazdırın.
//kaç tane 50 milyondan fazla nüfuslu ülke var?
// ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?


        HashMap<String, Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Türkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 700);
        ulke.put("Kanada", 40);

        System.out.println("ülke isimleri ve nüfusları:\n" + ulke + "milyon");
        System.out.println("ülke isimleri:" + ulke.keySet());
        System.out.println("ülke nüfusları." + ulke.values());

//Nüfusu 50 milyondan büyüyk ülke sayısı
        int ellidendenBuyuk = 0;
        for (Integer w : ulke.values()) {
            if (w > 50) {
                ellidendenBuyuk++;
            }
        }
        System.out.println(ellidendenBuyuk);


        //toplam nüfus
        int toplam = 0;
        for (Integer topla : ulke.values()) {
            toplam += topla;
        }
        System.out.println("toplam " + toplam);


        for (Map.Entry<String, Integer> siralama : ulke.entrySet()) {
            System.out.println(siralama);
        }

        //ülke yzadır
        for (String ulkeSira : ulke.keySet()) {
            System.out.println(ulkeSira);
        }

        //Nüfus yazdır
        for (Integer ulkeNufus : ulke.values() // sadece values
        ) {
            System.out.println(ulkeNufus);


        }
    }
}