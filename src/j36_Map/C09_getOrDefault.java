package j36_Map;

import java.util.HashMap;

public class C09_getOrDefault {

    public static void main(String[] args) {



        HashMap<String, String> hm = new HashMap<>();
        //map.getOrdefault ()-> Girilen key map'de varsa key'e ait value yoksa default eder return eder


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);//
        System.out.println("hm.getOrDefault(\"Ebay\",\"ebikGabık\") = " + hm.getOrDefault("Ebay", "ebikGabık"));//234 Euro
        //Ebay key map'de varoldugu için Ebay key'e ait value:234 Euro return edildi
        System.out.println("hm.getOrDefault(\"ebik\",\"gabık\") = " + hm.getOrDefault("ebik", "gabık"));//gabık
        //ebik key map'de olmadıgı için bu key' default değer gabık atanıp return edildi

        System.out.println("hm = " + hm);//{Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
    }
}
