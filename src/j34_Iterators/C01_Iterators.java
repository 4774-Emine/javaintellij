package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {


        List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));
        System.out.println("l1 List ilk hali : " + l1);//[Nur, Gamze, Erol, Bekir]

        // l1 elamanları for loop ile print ediniz...

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");// Nur Gamze Erol Bekir
        }
        System.out.println();
        System.out.println("   ******   ");

        // l1 elamanları for-each loop ile print ediniz...

        for (String w : l1) {
            System.out.print(w + " ");//Nur Gamze Erol Bekir
        }
        System.out.println();
        System.out.println("   ******   ");

        // l1 herbir elamanı :-)  for loop ile update edip  print ediniz...

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + " :-) ");
        }
        System.out.println("l1 :-) update sonrası :" + l1);//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]

        System.out.println();
        System.out.println("   ***   ");

        // l1 herbir elamanı :-(  for-each loop ile update edip  print ediniz...

        for (String w : l1) {
            w += " :-( ";

        }
        System.out.println("l1 :-) update sonrası :" + l1);//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]
        /*
        index desteklemeyen yapılarda tekrarlayan  aksiyon için for-each lopp update yapamaybilir yukarıdaki task'de oldugu gibi
        Bu durumda java ıterator intarface'den tanımlanacak variable ile takrarlayan aksiyonlar index olmadan yapılır.
         */

        System.out.println();
        System.out.println("   **** Iterators ****   ");

        Iterator<String> it1 = l1.iterator();//Iterator intface'den it1 variable tanımlandı .Atama olarak l1 elemanları atandı
        while (it1.hasNext()) {

            //hasNext()->it1 elamanları için pointer old yerde elekman varsa true yoksa false verir ve pointer bir sonrakı elelman önüne koyulur
            // next()-> list'in pointer önündeki  elemnını return eder

            System.out.print(it1.next() + " ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-)
        }
        System.out.println();
        System.out.println("   **** Iterators ****   ");

        List<String> l2 = new ArrayList<>(Arrays.asList("Baran", "Gülsüm", "Akif", "Nazım"));

        //l2 elamnalrını ıterator ile silip print ediniz-> l2=[]
        System.out.println("iterator öncesi l2 : " + l2);//[Baran, Gülsüm, Akif, Nazım]
        Iterator<String> it2 = l2.iterator();
        while (it2.hasNext()) {//tekraradaki pointer önünde eleman varlığının kontrol eder
            it2.next();//tekrardaki pointer öünüdeki elemanı verir
            it2.remove();// next() ilen  gelen elemanı siler

        }
        System.out.println("iterator  remove sonrası l2 : " + l2);// []

        System.out.println("   *** ListIterators ***   ");

        List<String> l3 = new ArrayList<>(Arrays.asList("Baran", "Gülsüm", "Akif", "Nazım"));
        //l3 elamnalrını ıterator ile :-) set edip  print ediniz-> [Baran :-), Gülsüm :-), Akif :-), Nazım :-)]
        System.out.println("iterator öncesi l3 : " + l3);//[Baran, Gülsüm, Akif, Nazım]
        ListIterator<String> it3 = l3.listIterator();//tekrar iterator yapısı tanımlandı

        while (it3.hasNext()) {

            it3.set(it3.next() + " :-) ");//tekrardaki next() ile elemanı  :-) concat ederk update edilidi
        }

        System.out.println("iterator  set sonrası l3 : " + l3);// [Baran :-), Gülsüm :-), Akif :-), Nazım :-)


        System.out.println("   *** ListIterators ***   ");
        List<String> l4 = new ArrayList<>(Arrays.asList("Serhat ", "Yakup", "Mustafa", "Nazlı"));
        System.out.println("ListIterator öncesi l3 : " + l3);//[Baran, Gülsüm, Akif, Nazım]
        // l3 elamanlarının ilk harfi buyuk kln 3 hafi *** karakteri ve l4 listi ekleyip print ediniz
        ListIterator<String> ebikGabık = l3.listIterator();//tekrar iterator yapısı tanımlandı

        while (ebikGabık.hasNext()) {
            ebikGabık.set(ebikGabık.next().toUpperCase().charAt(0) + "***");//next()ilen l4 elamanbı ilk harf byk kalan 3 harf*** le set edildi
            ebikGabık.add(l4.toString());//tekrardaki updatebedilen l3 e l4 add edildi
        }


        System.out.println("Listiterator  set ve add sonrası l3 : " + l3);// [Baran :-), Gülsüm :-), Akif :-), Nazım :-)

    }
}



































