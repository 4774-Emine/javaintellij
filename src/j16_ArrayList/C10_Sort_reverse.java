package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {
        //Collections.sort(list);-> verilen list'i naturel sıralama return eder..
        //Collections.reverse(list);-> verilen listin ters sıralamasını return eder

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));
        System.out.println("listSehir = " + listSehir);//sırlama öncesi ->[Münih, LosAngeles, Londra, Stockholm]
        Collections.sort(listSehir);//sort(); method sout içinde çalışmaz

        System.out.println("listSehir = " + listSehir);// sırlama sonrası->[Londra, LosAngeles, Münih, Stockholm]

        Collections.reverse(listSehir);

        System.out.println("listSehir = " + listSehir);//ters sıra sonrası ->[Stockholm, Münih, LosAngeles, Londra]


        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "Ingiltere", "isvec"));
        System.out.println("listUlke = " + listUlke);//ters sıra öncesi->[Alamanya, Amerigonya, Ingiltere, isvec]
        Collections.reverse(listUlke);
        System.out.println("listUlke = " + listUlke);//ters sıra sonrası->[isvec, Ingiltere, Amerigonya, Alamanya]
    }
}
