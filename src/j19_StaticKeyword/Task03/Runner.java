package j19_StaticKeyword.Task03;

import java.util.ArrayList;

public class Runner {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    public static void main(String[] args) {
        Lesson mat101 = new Lesson();
        mat101.name = "Matematik";
        mat101.credit =3;

        Lesson java101 = new Lesson();
        java101.name = "Java";
        java101.credit =6;

        Lesson fiz101 = new Lesson();
        fiz101.name = "Fizik";
        fiz101.credit =4;

        Student ogrenci1 = new Student();
        ogrenci1.name = "Necdet";
        ogrenci1.maxCredit=10;
        ogrenci1.dersListesi = new ArrayList<>();

//        ogrenci1.dersEkle(mat101);
//        ogrenci1.dersEkle(java101);
//        ogrenci1.dersEkle(fiz101);

        if (ogrenci1.toplamKredisi()+ mat101.credit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(mat101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız"+mat101.name + " dersini alamazsınız");
        }

        if (ogrenci1.toplamKredisi()+java101.credit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(java101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız"+java101.name+ " dersini alamazsınız" );
        }

        // bu ders max krediyi aştı ? bunun için ne yapabiliriz.
        if (ogrenci1.toplamKredisi()+ fiz101.credit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(fiz101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız"+fiz101.name + " dersini alamazsınız");
        }


        for(Lesson les :  ogrenci1.dersListesi)
        {
            System.out.println(les.name + " " + les.credit);
        }

    }
}
