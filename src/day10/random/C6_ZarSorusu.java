package day10.random;

public class C6_ZarSorusu {

     /*
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" yazisini yazdirin,
     aksi takdirde "Tekrar deneyiniz" yazisi yazmali

     */

    public static void main(String[] args) {

        int min =1;
        int max =6;

        int zar1 = (int) (Math.random()*((max-min)+1)) +min;
        int zar2 = (int) (Math.random()*((max-min)+1)) +min;
        System.out.println("zar1 = " + zar1);
        System.out.println("zar2 = " + zar2);
        int toplam =  zar1+ zar2;

        if(toplam ==9){
            System.out.println("kazandiniz");
        }else System.out.println("tekrar deneyiniz");

    }
}
