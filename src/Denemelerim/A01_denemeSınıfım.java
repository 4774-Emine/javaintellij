package Denemelerim;

import java.util.Scanner;

public class A01_denemeSınıfım {
    public static void main(String[] args) {
        //  Task->Girilen tam sayının asal olmasını control eden code create ediniz

        Scanner sc = new Scanner(System.in);
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

                String pin=sc.nextLine();







            }
        }




















