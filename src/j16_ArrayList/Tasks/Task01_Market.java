package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     */
     static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"));//1.ADIM
//yukarda hep kullanacığımız için güneş gibi bir list oluşturduk bunu yapmak için başına static ekledik


    static ArrayList<Double> gunlukKazanclar = new ArrayList<>();//2.ADIM
    //gunlukKazanclar Listini de hep kullanacağımız için güneş gibi olsun diye main dışına static yaptık.

    static Scanner sc = new Scanner(System.in);
    static double haftacirosu = 0;


    public static void main(String[] args) {


        int gun = 0;
        while (gun < 7) {//3.ADIM


            System.out.println("Lütfen " + gunler.get(gun) + " gününün hasılatını gir : ");
            double gunkazancı = sc.nextDouble();

            gunlukKazanclar.add(gunkazancı);

            haftacirosu += gunkazancı;

            gun++;
        }


        getOrtalamaninUstundeKazancGünleri();//5.adım için method oluşturuyoruz
        getOrtalamaninAltindaKazancGünleri();//6.adım için method oluşturuyoruz
        getOrtalamaKazanc();//4.adım için method oluşturuyoruz

        System.out.println("Haftanın cirosu: " + haftacirosu);
        System.out.println("Haftanın ortalaması: " + getOrtalamaKazanc());
        System.out.println(" Ortalama üstü günler:  " + getOrtalamaninUstundeKazancGünleri());
        System.out.println(" Ortalama altı günler:  " + getOrtalamaninAltindaKazancGünleri());
    }//METHOD SONU

    private static String getOrtalamaninAltindaKazancGünleri() {//6.ADIM
        String ortalaAltıGun = "";//String ifadesini günler olduğu için kullandık

        for (int i = 0; i < gunlukKazanclar.size(); i++) {//günlük hasılat döngüsü
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {//günlük hasılat hafta ortalaması ile kontrol edildi
                ortalaAltıGun += gunler.get(i);//ortalamanın altında hasılatı olan gün,ortalama altı güne eklendi
            }
        }

        return ortalaAltıGun;
    }

    private static String getOrtalamaninUstundeKazancGünleri() {   //5.ADIM
        String ortalaustuGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {//günlük hasılat döngüsü
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {//günlük hasılat hafta ortalaması ile kontrol edildi
                ortalaustuGun += gunler.get(i);//ortalamanın üstünde hasılatı olan gün,ortalama üstü güne eklendi
            }
        }

        return ortalaustuGun;
    }


    private static double getOrtalamaKazanc() {//4.ADIM
        double ortlama = haftacirosu / 7;

        return ortlama;//ortlama yı yazdırma yerine return ettik çünkü ortlamayı sonraki adımlarda tekrar kullanacağız
    }

}