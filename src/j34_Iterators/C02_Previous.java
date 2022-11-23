package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 65, 9, 11, 7, 27, 23));
        //l1 elamanlarını tersten print ediniz.
        System.out.println("l1 list ilk hali : " + l1);
        /*
        tekrarda son elemandan başlayan işlemler için pointer en sona götürülmeli
        Bunun için pointer'e sona götüren hasNext() meth çalışmalı.
         */
        ListIterator<Integer> it1 = l1.listIterator();
        while (it1.hasNext()) {//b->s pointer sürekli sona doğru ilerler
            it1.next();
        }
        while (it1.hasPrevious()) {//s->b pointer sürekl basa doğrı ilerler
            System.out.print(it1.previous() + " ");//23 27 7 11 9 65 38 24
        }

        //System.out.println("l1 tersten print hali : "+l1);
        System.out.println("   ***   ");

        List<String> l2 = new ArrayList<>(Arrays.asList("cagla", "uğur", "muharrem", "cebrail"));
        //l2 elemanlaeının sonuncusuna :-) ekleyip print ediniz
        System.out.println("listiterator öncesi l2 : " + l2);

        ListIterator<String> it2 = l2.listIterator();//l2 elamlarını tekrarlayan listiterator tanımlandı

        while (it2.hasNext()) {

            String s = it2.next();
            if (!it2.hasNext()) {//son elaman-> sonrasında eleman yok
                it2.set(s + " : -) ");
            }
        }
        System.out.println(l2);//[cagla, uğur, muharrem, cebrail : -) ]

        /*
      çoooğ önemli ->  hasPrevious() meth için MUTLAKA KESİNLİKLE hasNext() ve next() meth
      calıştırılarak cursor(pointer) en sona getirilmeli.

      ITERATOR VE LISTITERATOR farkları

      1- ITERATOR-> sadece hasNext(), next(), remove() meth çalışır
         LISTITERATOR -> hasNext(), next(), remove(). hasPrevious(), previous(),add(), set() vs methodlar çalışır

      2- LISTITERATOR -> sadece List yapılarda tanımlanır
         ITERATOR-> tum collection(list set Array, map..) için tanımlanır.

      3- ITERATOR-> sadece ileri b->s tekrarlar
        LISTITERATOR -> b<->s ileri ve geri çift yönlü tekrarlar

        ITERATOR-> kapsamı geniş ama aksiyonu az
        LISTITERATOR -> kapsamı dar ama aksiyıonu çok

         */
    }
}















