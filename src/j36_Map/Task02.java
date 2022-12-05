package j36_Map;

import java.util.HashMap;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}


        HashMap<String, String> kisi1 = new HashMap<>();
        kisi1.put("isim", "Erdem Bayazıt");
        kisi1.put("email", "erdem.bayazıt@gmail.com");
        kisi1.put("adres", "Üsküdar mah.Çimen sok.no 11");
        kisi1.put("telefon", "0548356248");

        HashMap<String, String> kisi2 = new HashMap<>();
        kisi2.put("isim", "Cahit Zarifoğlu");
        kisi2.put("emai", "zarifoğlu@gmail.com");
        kisi2.put("adres", "Çağlayan mah. çağlayan sok. no 29");
        kisi2.put("telefon", "05486131");


        HashMap<String, HashMap<String, String>> kartvizit = new HashMap<>();
        kartvizit.put("Erdem Bayazıt", kisi1);
        kartvizit.put("Cahit Zarifoğlu", kisi2);
        System.out.println("kartvizit = " + kartvizit);


    }
}

