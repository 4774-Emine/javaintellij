package Denemelerim;

import java.util.Scanner;

public class A01_denemeSınıfım {
    public static void main(String[] args) {
        //  Task->Girilen tam sayının asal olmasını control eden code create ediniz

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz :");
        int sayı = sc.nextInt();
        boolean asalMı = true;

        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                  asalMı = false;
                break;
            }
        }
                if (asalMı) {
                    System.out.println("girilen sayı asaldır");
                } else {
                    System.out.println("girilen sayı asal değil");
                }



//-> TASK->String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz

        Scanner scan = new Scanner(System.in);

                String pin=sc.nextLine();*/


int sayılar[]=new int[5];
sayılar[0]=100;//değer tanımlaması yaptık
sayılar[1]=200;
sayılar[2]=300;
sayılar [3]=400;
        System.out.println(sayılar[3]);
//verileri daha sonra eklemek istersek bu şekilde oluşturuyoruz->java bizim için hafızada 5 birimlik yer ayırdı


int rakamlar[]={20,30,40,50,60,70};
        System.out.println(rakamlar[3]);
        rakamlar[1]=100;//değişken değiştirme yaptım
        System.out.println(rakamlar[1]);

//ÇOK BOYUTLU ARRAYLER
        int sayilar[][]=new int [2][3];
        sayilar[0][0]=5;
        sayilar[0][1]=10;
        sayilar[0][2]=15;

        sayilar[1][0]=8;
        sayilar[1][1]=25;
        sayilar[1][2]=30;

        System.out.println(sayilar[1][2]);
    }
        }




















