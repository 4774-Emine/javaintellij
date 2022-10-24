package j19_StaticVariable;
    /*
    1.Static bloc yapıları static variable'ları değer ataması ya da update için kullanılır
    2.Static bloc class oluşturulduğunda bütün method'lardan (main method dahil ) önce çalışır
    3.Birden fazla static bloc varsa yukardan aşağıya sıralama ile çalışır.
     */

public class C02_StaticBlok {

    static String isim = "sefil haluk";//gns -> static var.

    static {//ilk çalışacak static block
        System.out.println("isim = " + isim);//sefil haluk
        System.out.println("agam 2. static block çalıştı :) ");
        isim = "UGUR JavaCAN";
        System.out.println("isim = " + isim);//UGUR JavaCAN

    }

    static {//2. çalışacak static block
        System.out.println("agam 1. static block çalıştı :) ");
        isim = "Dilek Hanım";
        System.out.println("isim = " + isim);//Dilek Hanım

    }

    public static void main(String[] args) {//main bası
        System.out.println("main method başladı :) ");
        isim = "Kerim Bey";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti :( ");//Kerim Bey
    }//main sonu


}


