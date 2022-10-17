package j09_SwitchStatement;

import java.util.Scanner;

/*
    Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
    Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
    programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
    karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
    ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
    Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
    Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
    çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
    Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
          Switch de sadece int, byte, short, char, String data tipleri kullanilabilir
        Eger 3 den fazla durum varsa switch() tercih edilir.
 */
public class C01_SwitchCase {

    public static void main(String[] args) {
        // TASK -> kullanıcının girdiği rakamı yazı ile print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir rakam gir bakam : ");
        int rakam = sc.nextInt();

        System.out.println("   *** if-else   ***   ");
        if (rakam == 0) {
            System.out.println("girilen rakam SIFIR");
        } else if (rakam == 1) {
            System.out.println("girilen rakam BİR");
        } else if (rakam == 2) {
            System.out.println("girilen rakam İKİ");
        } else if (rakam == 3) {
            System.out.println("girilen rakam ÜÇ");
        } else if (rakam == 4) {
            System.out.println("girilen rakam DORT");
        } else if (rakam == 5) {
            System.out.println("girilen rakam BEŞ");
        } else if (rakam == 6) {
            System.out.println("girilen rakam ALTI");
        } else if (rakam == 7) {
            System.out.println("girilen rakam YEDİ");
        } else if (rakam == 8) {
            System.out.println("girilen rakam SEKİZ");
        } else if (rakam == 9) {
            System.out.println("girilen rakam DOKUZ");
        } else System.out.println("agam adam gibi rakam gir :(");

        System.out.println("   ***  switch case   ***   ");

        switch (rakam) {
            case 0:
                System.out.println("girilen rakam SIFIR");
                break;
            case 1:
                System.out.println("girlen rakam BİR");
                break;
            case 2:
                System.out.println("girilen rakam İKİ");
                break;
            case 3:
                System.out.println("girlen rakam ÜÇ");
                break;
            case 4:
                System.out.println("girilen rakam DORT");
                break;
            case 5:
                System.out.println("girlen rakam BEŞ");
                break;
            case 6:
                System.out.println("girilen rakam ALTI");
                break;
            case 7:
                System.out.println("girlen rakam YEDİ");
                break;
            case 8:
                System.out.println("girilen rakam SEKİZ");
                break;
            case 9:
                System.out.println("girlen rakam DOKUZ");
                break;
            default:
                System.out.println("adam gibi bir rakam gir  :(");
        }
        System.out.println("agam bu yazıyı oluduysan code run olup switch den çıkmıştır");


    }
}
