package day07;

public class Q04_NestedForLoop {
    public static void main(String[] args) {

 /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****

*/
        for (int satır = 1; satır <= 5; satır++) {//satır kontrolu
            for (int boşluk = 5 - satır; boşluk > 0; boşluk--) {//boşluk kontrolu
                System.out.print(" ");

            }
            for (int sütun = 1; sütun <= satır; sütun++) {//sütun kontrolu
                System.out.print("*");
            }
            System.out.println();
        }

//üçgen sola dayalı olursa:
//for(int satır=1; satır<=5;satır++){
//for(int sütun=1; sütun<=satır;sütun++)
  //      System.out.println("*");

    }
}