package j12_Lopps.Task_Loop;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

//Task--> girilen iki sayı arasındaki çift sayıları yanyana print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("sayi1 giriniz");
        int sayi1=sc.nextInt();



        System.out.println("sayi2 giriniz");
        int sayi2=sc.nextInt();
        if (sayi1<sayi2) {
            for (int i = sayi1; i < sayi2; i++) {
                if (i %2 == 0){//döngü içindeki sayıların çift kontrolu
                    System.out.print(i + "");

                }
            }

        }else System.out.println("hatalı giriş yaptınız");




    }//main dşı
}
