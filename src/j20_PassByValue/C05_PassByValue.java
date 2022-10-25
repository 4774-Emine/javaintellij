package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {

/*
eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
1.değişklik  yapılan variable'lar static olarak tanımlanır.
2.değişiklik yapılan variable'lar atama tanımlanır
 */

double etiketFiyatı=100;//primitive
 double indirimOranı=0.1;//primitive

        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);//100
etiketFiyatı=indirim(etiketFiyatı,indirimOranı);//90
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);//90



    }//main sonu


    public  static double indirim(double fiyat, double oran){

        fiyat*=(1-oran);
        System.out.println("indirimli fiyat :" +fiyat);
        return fiyat;

    }
}







