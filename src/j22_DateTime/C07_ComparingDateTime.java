package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate falanGun=bugun.minusDays(24);
        LocalDate fesmekanGun=bugun.plusDays(3);
        LocalDate fathBirthDay=LocalDate.of(1993,5,19);

        System.out.println("bugun = " + bugun);//bugun = 2022-10-26
        System.out.println("falanGun = " + falanGun);//falanGun = 2022-10-24
        System.out.println("fesmekaGun = " + fesmekanGun);//fesmekanGun = 2022-10-29

        // TRICK -> is ile başlayan methodlar boolean return eder
        System.out.println("bugun.isBefore(falanGun) = " + bugun.isBefore(falanGun));
        System.out.println("bugun.isBefore(fesmekanGun) = " + bugun.isBefore(fesmekanGun));
        System.out.println("falanGun.isBefore(fesmekanGun) = " + falanGun.isBefore(fesmekanGun));

        System.out.println("bugun.isAfter(falanGun) = " + bugun.isAfter(falanGun));
        System.out.println("falanGun.isAfter(fesmekanGun) = " + falanGun.isAfter(fesmekanGun));

        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());


        int fark= bugun.compareTo(falanGun);

        System.out.println("fark = " + fark);
        int fark1=falanGun.compareTo(fesmekanGun);
        System.out.println("fark1 = " + fark1);

        System.out.println("bugun.compareTo(fathBirthDay) = " + bugun.compareTo(fathBirthDay));//29
// 2022.10.26 ->1993.5.19
/*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */
    }
}






























