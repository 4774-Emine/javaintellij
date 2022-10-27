package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

    public static void main(String[] args) {
        //LOcal date->sadece yıl ay gün değeri tutar
   LocalDate bugün= LocalDate.now() ;//sistemden bugünün yıl ay gün değerini atama yapar

        System.out.println("bugün = " + bugün);//2022-10-25
        System.out.println("bugün.getYear() = " + bugün.getYear());
        System.out.println("bugün.getMonthValue() = " + bugün.getMonthValue());
        System.out.println("bugün.getMonth() = " + bugün.getMonth());
        System.out.println("bugün.getDayOfYear() = " + bugün.getDayOfYear());
        System.out.println("bugün.getDayOfMonth() = " + bugün.getDayOfMonth());
        System.out.println("bugün.getDayOfWeek() = " + bugün.getDayOfWeek());

        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1923, Month.OCTOBER,29);


//verilen bir tarihin öncesi ve sonrasına gitme...minus()->önceye götürür , plus()->sonraki tarihe
        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));
        System.out.println("bugün.plusWeeks(6) = " + bugün.plusWeeks(6));
        System.out.println("bugün.minusMonths(5) = " + bugün.minusMonths(5));
        System.out.println("bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + bugün.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));
    }

    }

