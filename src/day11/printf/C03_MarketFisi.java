package day11.printf;

public class C03_MarketFisi {
    /*
    verilen uc listeden
    urun ismi , urun miktari, urun birim fiyatini alip
    fis seklinde odenecek toplam tutari yazdiran bir program yazalim
    toplam tutarlarda virgulden sonra 2 basamak alinacak,sonrasi dikkate alinmayacaktir

    urunler = Domates, biber, patlican, uzum, armut
    miktarlar= 1,2,3.5,2.5,6
    birim fiyatlari= 2.3,2.29,4.1,2,3
    satis fisi
    Urun     miktar   br_fiyat urun_top
    ===================================
    Domates    1.00    €2.30   € 2.30
    biber      2.00    €2.29   € 4.58
    patlican   3.50    €4.10   € 14.35
    uzum       2.50    €2.00   € 5.00
    armut      6.00    €3.00   € 18.00
    ===================================
    toplam     15.00kg      44,23€
     */

    public static void main(String[] args) {
        String [] urun = {"Domates", "Biber", "Patlican", "Uzum", "Armut"};
        double [] brFiyat = {2.3, 2.29, 4.1, 2.00, 3.00};
        double[] miktar = {1, 2, 3.5, 2.5, 6};

        System.out.println("urun \t\t miktar    br_fiyat    urun_Top");
        System.out.println("============================================");

        for (int i = 0; i < urun.length; i++) {
            System.out.printf("%-10s   %5.2f kg   €%5.2f     €%4.2f\n"
                    ,urun[i],miktar[i],brFiyat[i], miktar[i]*brFiyat[i]);
        }

        System.out.println("============================================");

        double toplamUrunMiktari = 0;
        for (int i = 0; i < miktar.length ; i++) {
            toplamUrunMiktari+=miktar[i];
        }

        double toplamOdenecekPara =0;
        for (int i = 0; i < miktar.length; i++) {
            toplamOdenecekPara +=miktar[i] *brFiyat[i];
        }

        System.out.printf("toplam  \t  %5.2fkg \t  %15.2f€",toplamUrunMiktari,toplamOdenecekPara);
    }


}
