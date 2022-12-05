package j35_Collection.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
         /*
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "Germany" , "Brazil" ,"USA"
    ArrayListi yazdırınız.
     */
        HashSet<String >hs1=new HashSet<>(Arrays.asList("Germany" , "Türkiye" , "South Africa" , "Brazil" , "USA"));
        HashSet<String >hs2=new HashSet<>(Arrays.asList("Germany" , "Türkiye" , "Brazil" , "France" ,  "USA"));

        System.out.println("commonValues(hs1,hs2) = " + commonValues(hs1, hs2));//[USA, Brazil, Türkiye, Germany]

    }//main sonu

    private static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2) {
       hs1.retainAll(hs2);//hs1 ve hs2 kesişen ortak elemanlar hs1 e atandı

        ArrayList<String> ebikGabık=new ArrayList<>((hs1));// ortak elemanlardan olusan hs1 arrayliste atandı

        return ebikGabık;
    }


}
