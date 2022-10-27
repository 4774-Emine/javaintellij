package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Dizi {
    public static void main(String[] args) {

/*
Java N ve M Boyutlu Dizinin Satırlarının Toplamını Bulma

Bu örnekte N ve M değerlerini kullanıcıdan alıp, iki boyutlu dizi oluşturacağız.
 Daha sonra da dizinin elemanlarını kullanıcıdan alıp, her satırın sonuna o satırın toplamını yazdıracağız.


 örneğin;

 12    12     24
 5     15     20
 12    18     30

 */

      Scanner sc=new Scanner(System.in);
      int toplam;
        System.out.println("dizinin satır sayısını giriniz:");
        int satir=sc.nextInt();

        System.out.println("dizinin sütun sayısını giriniz:");
        int sutun=sc.nextInt();

        int sayi[][]=new int [satir][sutun];//iki boyutlu arrayimizde satır ve sütun uzunluklarını tanımladık

        System.out.println();//dummy

        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.println("bir sayı giriniz: ");
                sayi[i][j]=sc.nextInt();

            }
        }//burda artık arrayim oluştu

        System.out.println(Arrays.deepToString(sayi));

        System.out.println("Girilen dizi: \n");

        for (int i=0;i<satir;i++){
            toplam=0; //kullanıcının  girdiği değerleri toplamak için dıfır değerinde integer toplam tanımlıyorum
            for (int j=0;j<sutun;j++){

                toplam+=sayi[i][j];
                System.out.print(sayi[i][j] + "\t");//arrayin elemanlarını bir tab boşluk bırakarak yazdırdım

            }
            System.out.println(toplam + "\n");//en sonda ise satırdaki topladığımız değerleri satırın sonuna yazdrdık
        }




    }
}
