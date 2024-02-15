package j09_SwitchStatement;

import java.util.Scanner;

public class C07_SwitchCase_exmple {
    public static void main(String[] args) {
        //Kullanıcıdan 2 basamaklı bir sayı alıp sayıyı yazıyla yazdırın.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen yazıyla görüntülemek istediğiniz bir tam sayı giriniz: ");

        int girilenSayi=sc.nextInt();
        if (girilenSayi < -99 || (girilenSayi > -10 && girilenSayi < 10) || girilenSayi > 100)
            System.out.println("iki basamakli bir tamsayi girmediniz.");
        else{
            if(girilenSayi < 0){
                System.out.println("Eksi");
                girilenSayi*=-1;
            }

            switch (girilenSayi/10){
                case 1:
                    System.out.print("on");
                    break;
                    case 2:
                    System.out.print("yirmi");
                    break;
                    case 3:
                    System.out.print("otuz");
                    break;
                    case 4:
                    System.out.print("kırk");
                    break;
                    case 5:
                    System.out.print("elli");
                    break;
                    case 6:
                    System.out.print("altmış");
                    break;
                    case 7:
                    System.out.print("yetmiş");
                    break;
                    case 8:
                    System.out.print("seksen");
                    break;
                    case 9:
                    System.out.print("doksan");
                    break;
            }
            switch (girilenSayi%10){
                case 1:
                    System.out.println("bir");
                    break;
                    case 2:
                    System.out.println("iki");
                    break;
                    case 3:
                    System.out.println("üç");
                    break;
                    case 4:
                    System.out.println("dört");
                    break;
                    case 5:
                    System.out.println("beş");
                    break;
                    case 6:
                    System.out.println("altı");
                    break;
                    case 7:
                    System.out.println("yedi");
                    break;
                    case 8:
                    System.out.println("sekiz");
                    break;
                    case 9:
                    System.out.println("dokuz");
                    break;

            }
        }
    }
}
