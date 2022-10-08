package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        /*
          TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */
        Scanner sc = new Scanner(System.in);

        System.out.print("ehliyetiniz var ise E yoksa H giriniz : ");

        char ehlyt = sc.next().charAt(0);//kullanıcının girdiği karakteri buyuk harfe cevirip ilk değerini alır
        if (ehlyt == 'E'||ehlyt =='e') {//ehlyt varlığı k0ntrol edildi

            System.out.print("kac yıllık tecrübeniz var :");
            int tcrb = sc.nextInt();

            if (tcrb >= 7) {//tecrübe yılı kntrol edildi
                System.out.print("yaptıgınız km mesafeyi girniz : ");
                int km = sc.nextInt();
                if (km >= 100000) {//km mesafe kontrol edildi
                    System.out.println("agam gözün aydın kontak anahtarı senindir :)");
                } else//km sartı saglamazsa çalışır
                    System.out.println("kontak anahatarı lamanız için önce " + (100000 - km) + " yola ihtiyacınız var");

            } else //tecrübe şartı sağlamzsa çalışır
                System.out.println("kontak anahatarı lamanız için önce " + (7 - tcrb) + " yıla ihtiyacınız var");
            //yıl 7den byk olma şartı sağlamadığı içib eksik trc yazdrıldı

        } else
            if (ehlyt == 'H'||ehlyt=='h') {//ehliyet yoklugu kontrol edildi
            System.out.println("agam önce bi ehliyet al sonra kontak anahtarı sor :(");
        } else //ehlyt varlığı için e h girilme şartı sağlanmazsa  çalışır
            System.out.println("agam önce adam gibi karakter gir :(");

    }
}
