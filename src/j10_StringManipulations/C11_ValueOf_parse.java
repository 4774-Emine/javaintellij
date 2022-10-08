package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {


// Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.



//TASK-> String type verilen iki adet bağış miktarını toplayan code create ediniz

        String bagis1 = "1500";
        String bagis2 = "2500";

        int bagisDegeri1 = Integer.valueOf(bagis1);//bagis1 string içindeki sayı değerini int e çevirdi bagisDgeri1'e atadı
        int bagisDegeri2 = Integer.valueOf(bagis2);//bagis2 string içindeki sayı değerini int e çevirdi bagisDgeri2'e atadı

        System.out.println("toplam bağış miktarı : " + (bagisDegeri1 + bagisDegeri2));//bagisDegerleri toplanıp print edildi:4000


        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);//1453



        //BU METHOD STRİNGİ İNT E ÇEVİRİR!!!


        System.out.println( "toplam bağış : " +( Integer.parseInt(bagis1) + Integer.parseInt(bagis2))); //4000

        int tc=1234567;
      String strTc = String.valueOf(tc);
        System.out.println("strTc= "+ strTc );//1234567
        System.out.println("strTc+tc= "+(strTc+tc));

        String fiyat="$150";//"150" haline getirmek lazım.hiçlik ile karakterler değşitirilir

        int yeniFiyat=Integer.valueOf(fiyat);
        System.out.println("yeniFiyat = " + yeniFiyat);




 ;


    }
}
