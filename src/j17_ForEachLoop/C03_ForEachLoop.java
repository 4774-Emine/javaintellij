package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

 //Task->iki string array elemanlarının ortak olmasını kontrol eden code create ediniz...with for-each

        String arr1[]={"nazım","gülsüm","dilek","erol","cüneyt","çiğdem"};
        String arr2[]={"musty","gülsüm","ayşe","enise","cüneyt","çiğdem"};

List<String> ortakIsim=new ArrayList<>();//ortak isimlerin atanacağı boş list

        for(String str1:arr1){
            for(String str2:arr2){
                if(str2.equalsIgnoreCase(str1)) {//her bir çekirdek eşitliği kontrol
                    ortakIsim.add(str2);
                }
            }
        }

if(ortakIsim.isEmpty()) {//ortak isim list boşluk kontrol
    System.out.println("arraylerinizde ortak isim yok"+ ortakIsim);

}else System.out.println(ortakIsim);
    }
}
