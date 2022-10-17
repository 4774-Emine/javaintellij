package j16_ArrayList;

import java.util.*;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","losAngeles","Londra","stockholm"));


       // nCopies(int, Obj);-> int elamanlı bir obj den oluşan list ataması yapıyor
       ArrayList<String> yenilist = new ArrayList<>(Collections.nCopies(7,"javaCAN"));
        System.out.println(yenilist);

        //addAll();->bir liste diğer şisti oldugu gibi ekler

        listUlke.addAll(listSehir);//ülke list sonuna sehir list tamamane eklendi

        System.out.println("listUlke = " + listUlke);//[Alamanya, Amerigonya, ingiltere, isvec, Münih, losAngeles, Londra, stockholm]
         listSehir.addAll(3, listUlke);//3. index den itibaren ulke listi sehir liste tamamen eklendi

        System.out.println("listSehir = " + listSehir);//

        //task-> 1 den 10 kadar sayılara bir liste atayıp print eden code create ediniz
        ArrayList<Integer> listSayi= new ArrayList<>();//boş integer list

        for (int i = 1; i <=10; i++) {
            listSayi.add(i);
        }
        System.out.println("listSayi = " + listSayi);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
