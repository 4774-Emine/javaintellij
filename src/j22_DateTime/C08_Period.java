package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {

        //Period-> iki tarih arasında geçen tekrarlanabilen zamanı tutar...



        LocalDate bugun = LocalDate.now();

        LocalDate fthBirthDay = LocalDate.of(1993, 5, 19);
        Period fark = Period.between(fthBirthDay, bugun);
        System.out.println("fark = " + fark);//fark = P-29Y-5M-7D

        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());//fark datasının ay cinsinden değeri
        System.out.println("fark.getDays() = " + fark.getDays());//fark datasının gun bilgisi

        System.out.println("   ***   ");

        System.out.println("bugun = " + bugun);
        Period period5Gun = Period.ofDays(5);//5 gunde bir tekraralayan priod
        Period period7ay = Period.ofMonths(7);//7 ayda bir tekrarlanan period
        //  Period periodX = Period.ofMonths(7).ofDays(1);//7 ayda bir tekrarlanan period
        //Trick -> period tanımlamadan birden çok zaman parametresi tanımlanırsa son
        // parametre çalışır diğerlerini ezer
        Period periodX = Period.ofDays(1);//7 ayda bir tekrarlanan period

        bugun = bugun.plus(period5Gun);//bugune 5 gunluk period eklendi
        System.out.println("bugun = " + bugun);
        bugun = bugun.minus(period7ay);//bugune 7 aylık period geri gidildi
        System.out.println("bugun = " + bugun);
        bugun = bugun.plus(periodX);
        System.out.println("bugun = " + bugun);
        // task-> 5.9.2022 de başlayan kur 9 ay olduguna göre bitiş tarihini print eden code create ediniz

        LocalDate kursBasla = LocalDate.of(2022, 9, 5);
        System.out.println("kursBasla = " + kursBasla);

        Period kursSure=Period.ofMonths(9);//kurs suresi 9 ay olarak atandı.
        System.out.println("kursBasla.plus(kursSure) = " + kursBasla.plus(kursSure));

        System.out.println("kurs bitis tarihi : "+kursBasla.plus(kursSure).format(DateTimeFormatter.ISO_LOCAL_DATE));


    }
}




















