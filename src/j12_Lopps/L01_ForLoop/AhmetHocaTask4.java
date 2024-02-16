package j12_Lopps.L01_ForLoop;

public class AhmetHocaTask4 {
    public static void main(String[] args) {
        //verilen bir sayının faktoryel değerini bulun
        //5 !=5*4*3*2*1*=120
        int sayi = 5;
        int faktoryel = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoryel *= i;
        }
        System.out.println(faktoryel);

        faktoryel = 1;// yukarda faktoryel değeriyle işlem yaptığımız için burada tekrar ilk haline getiriyoruz.
        //sonucu 5 ! = 5*4*3*2*1*=120 şeklinde yazdırın
        String sonuc = sayi + " ! = ";
        System.out.print(sonuc);
        for (int i = sayi; i >= 1; i--) {
            faktoryel *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print("1 = ");
            }
        }
        System.out.println(faktoryel);

        //verilen bir sayının asal sayı olup olmadığını yazdırın
        int sayii = 7;
        boolean asalMi = true;


        for (int i = 2; i < sayi; i++) {
            if (sayii % i == 0) {
                asalMi = false;
            //break;
                /*
                bir loopun içinde loopu durdurmak istersek break kullanılır.
                 */
            }
        }
        if (asalMi) {
            System.out.println("sayı asal");
        } else {
            System.out.println("sayı asal değil");

        }


    }
}
