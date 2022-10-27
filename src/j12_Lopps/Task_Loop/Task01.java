package j12_Lopps.Task_Loop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
              - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
              - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
              - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz

*/
        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif sayı giriniz");
        int sayı = sc.nextInt();

        if (sayı >= 100) {//girilen sayı 100 den küçük olma şartı
            System.out.println("100 den küçük sayı giriniz");
        } else {
            for (int i = 1; i < sayı; i++) {

                if (i % 3 == 0 && i % 5 == 0) {//girilen sayıya kadar 3 ve 5 e bölünme kontrolu
                    System.out.println("JavaCAN");

                } else if (i % 3 == 0) {//girilen sayıya kadar 3 e bölünme kontrolu
                    System.out.println("Java");
                } else if (i % 5 == 0) {//girilen sayıya kadar 5 e bölünme kontrolu
                    System.out.println("CAN'dır");

                } else System.out.println(i + " hicbir şartı sağlamayan sayı");


            }
        }
    }
}