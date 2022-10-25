package j20_PassByValue;

public class C04_PassByValue {

    static double etiketFiyatı;//güneş
    static  double indirimOranı;//güneş


    public static void main(String[] args) {//main başı

 /*
 Eğer bir methodda yapılan değişiklik kalıcı olsun istenirse
 1.değişiklik yapılan variable'lar static olarak tanımlanır
  */

        etiketFiyatı=200;
        System.out.println("inidirim öncesi etiket fiyatı= "+etiketFiyatı);
        indirimOranı=0.1;


        indir();//method call
        indirimOranı = 0.1;

        indir();
        indirimOranı = 0.1;

        indir();
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);// 72.9
    }//main sonu
    public static void indir() {
        etiketFiyatı *= (1 - indirimOranı);//etiketfiyatı indirimli hale getirlidi
        System.out.println("etiketFiyatı = " + etiketFiyatı);
    }

}
