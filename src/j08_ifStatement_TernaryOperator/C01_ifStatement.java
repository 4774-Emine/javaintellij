package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C01_ifStatement {
    public static void main(String[] args) {

        int krmYas = 45;
        int ismlYas = 63;

        if (krmYas == ismlYas) {
            System.out.println("aynı yasdasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz ? ");
        }
        if (krmYas >= 40)
            System.out.println("krm bey olgunluk yaşındasınız");
        //if blok'da {} kullanılmazsa ilk ; kadar olan komut çalışır veya çalışmaz alt satırdan devam eder
        System.out.println("bu yazıyı okuduysanız 12. satırdaki if'den bagımsız");
        if (krmYas + ismlYas > 100) {
            System.out.println("kerm bey ve ismal bey yaşları toplamı 100 den buyuk");
        }
        System.out.println("selam javacanlar");
    /*
    Bagımsız if statement  yaoıları sadece kendi  scop(kapsamlarını ) run eder.
    Birden fazla bagımsız if statement  yapıları hepsinin body calışabilecegi gibi hiçbirisini body de çalışmayablir
    iİf şartından sonra süslü parantez kullanmazsak Java ilk ; işaretine kadar olan kısmı if body olarak kabul eder sonraki satırlarla ilgilenmez.
     */

        boolean x = krmYas + 100 > ismlYas - 15; //145>48 true

        if (x) {
            System.out.println("Ozel şart sağlandı");
        }

        if (true) {
            System.out.println("Bu yazi her zaman çalışır, çünkü şart hep true");
        }
        if (false) {
            System.out.println("Bu yazi hiç çalışmaz, çünkü şart hep false");
        }


// *******************AHMET HOCA ***********************
        //TASK
        //Kullanıcıdan bir harf alın,harf ile başlayan bir ay varsa yazdırın
        //NOT: Büyük-küçük harf hassasiyeti olmasın
        //Kullanıcı o veya 0 yazdığında output Ocak olsun.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yazdırmak istediğiniz ayın ilk harfini giriniz");
        char ilkHarf = sc.next().toUpperCase().charAt(0);//burada istersek toUppercase methodunu kullanmadan direkt if şartına if(ilkHarf=='s' || ilkHarf=='S') diyebiliriz.
        if (ilkHarf == 'O') System.out.println("Ocak");
        if (ilkHarf == 'Ş') System.out.println("Şubat");
        if (ilkHarf == 'M') System.out.println("Mart veya Mayıs");
        if (ilkHarf == 'N') System.out.println("Nisan");
        if (ilkHarf == 'H') System.out.println("Haziran");
        if (ilkHarf == 'T') System.out.println("Temmuz");
        if (ilkHarf == 'A') System.out.println("Ağustos veya Aralık");
        if (ilkHarf == 'E') System.out.println("Eylül veya Ekim");
        if (ilkHarf == 'K') System.out.println("Kasım");

//TASK
        //Kullanıcıdan bir sayı alın
        //sayı 3 ile bölünebiliyorsa "Üç ile bölünebilen sayı"
        //5 ile bölünebiliyorsa "5 ile bölünebilen sayı" yazdırın
        System.out.println("Bir sayı giriniz:");
        int girilensayi = sc.nextInt();
        if (girilensayi % 3 == 0) System.out.println("Üç ile bölünebilen sayı");
        if (girilensayi % 5 == 0) System.out.println("5 ile bölünebilen sayı");





//TASK
//verilen bir sayının 2,3,5,7,11 ve 23 sayılarından kaç tanesine
        //kalansız olarak bölünebildiğini yazdırın
        //örn:kullanıcı 30 dediğinde output: 3

        System.out.println("bir sayı giriniz:");
        int girilenSAYI=sc.nextInt();

        int sayac=0;
        if(girilenSAYI%2==0) sayac++;
        if(girilenSAYI%3==0) sayac++;
        if(girilenSAYI%5==0) sayac++;
        if(girilenSAYI%7==0) sayac++;
        if(girilenSAYI%11==0) sayac++;
        if(girilenSAYI%23==0) sayac++;

        System.out.println( "Girilen sayı, istenen sayılardan " + sayac+  " tanesine tam bölünebiliyor.");


//TASK
        //Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın,
        //üçgen eşkenar üçgen ise "Eşkenar Üçgen" yazdırın
        System.out.println("Birinci kenar uzunluğunu giriniz:");
        int ilkKenar = sc.nextInt();
        System.out.println("Ikinci kenar uzunluğunu giriniz:");
        int ikinciKenar=sc.nextInt();
        System.out.println("Üçüncü kenar uzunluğunu giriniz:");
        int ücüncüKenar=sc.nextInt();

        if(ilkKenar==ikinciKenar && ikinciKenar==ücüncüKenar &&ilkKenar>0) System.out.println("Eşkenar Üçgen");





    }
}
