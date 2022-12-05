package j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
        // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
        // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...
        long tsBasla = System.currentTimeMillis();//treeset run baslama zamanı alındı

        TreeSet<String >ts=new TreeSet<>();
        ts.add("Salim");
        ts.add("Koray");
        ts.add("Haluk");
        ts.add("Harun");
        ts.add("Hasan");
        ts.add("Hasmayan");
        ts.add("Koray");

        long tsBitir= System.currentTimeMillis();// treeSet bitis zamanı alındı

        System.out.println("ts run suresi :"+(tsBitir-tsBasla));// treeSet rub suresi hesaplandı

        System.out.println("   ***  ");

        long hsBasla = System.currentTimeMillis();
        HashSet<String >hs=new HashSet<>();
        hs.add("ebik");
        hs.add("gabık");
        hs.add("falan");
        hs.add("filan");
        hs.add("feşmekan");
        hs.add("agam");
        hs.add("bobrek yatagı");
        hs.add("poc guvec");
        hs.add("kusleme");

        long hsBitir= System.currentTimeMillis();
        System.out.println("hs run suresi :"+(hsBitir-hsBasla));
        // iyi bir javaCAN için gelişMAC lazım :)

    }
}
