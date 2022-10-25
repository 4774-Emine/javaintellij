package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
 /*
 java PassBy Value bir programlama dilidir.
 Bir primitive variable argüment olarakbir methoda call edildiğinde variable değil bir copy
 yani clon yani vesikalık resim (pointer) değeri gönderilir
  */


        //Task->Verilen fiyat için %24 arttırılmış fiyatı print edem method create ediniz.
        double  fiyat=100;//primitive double type variable
        System.out.println("method call öncesi fiyat değeri = " + fiyat);//100
        fiyatArttır(fiyat);//fiyat variable methoda parametre call edildi
        System.out.println("method call sonrası fiyat değeri = " + fiyat);//100

    }//MAİN SONU*************

    public static void fiyatArttır(double bisey){
        bisey*=1.24;
        System.out.println("arttırılmış fiyat: "+ bisey);
    }





}
