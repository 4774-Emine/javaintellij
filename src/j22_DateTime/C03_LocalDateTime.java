package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {

  //    LocalDateTime ->tarih(yıl ay gün)ve zaman (saat dakika saniye mlsaniye) bilgilerini tutar
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);//ldt = 2022-10-25T23:02:38.905103200

        LocalDate d=LocalDate.of(2016,3,13);//tarih ataması yapıldı
        LocalTime t=LocalTime.of(14,45,35);//zaman ataması yapıldı
        LocalDateTime trhzmn=LocalDateTime.of(d,t);
        System.out.println("trhzmn = " + trhzmn);
LocalDateTime ldt1=LocalDateTime.of(2018, Month.MAY,19,20,30);
        System.out.println("ldt1 = " + ldt1);
        System.out.println("trhzmn.getDayOfYear() = " + trhzmn.getDayOfYear());
        System.out.println("trhzmn.getDayOfWeek() = " + trhzmn.getDayOfWeek());
        System.out.println("trhzmn.getHour() = " + trhzmn.getHour());
        System.out.println("trhzmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = " + trhzmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72));


    }


}
