package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {

    public static void main(String[] args) {
/*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");

        System.out.println("Bakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        int seçim = sc.nextInt();
        int bakiye = 1000;

        switch (seçim) {
            case 1:
                System.out.println("agam bakıyen :" + bakiye);
                break;
            case 2:
                System.out.print("agam ne hadar yatıcaksın :");
                int yatırılanMiktar = sc.nextInt();
                bakiye += yatırılanMiktar;
                System.out.println("agam bakıyenin güncalhali :" + bakiye);
                break;
            case 3:
                System.out.println("agam ne kadar cekecen : ");
                int cekilenMiktar = sc.nextInt();
                if (cekilenMiktar > bakiye) {
                    System.out.println("agam niddin olmayan parayımı cekecen :(");
                    System.out.println("ahan da bakıyen  " + bakiye);
                } else {
                    bakiye -= cekilenMiktar;
                    System.out.println("agam bakıyenin güncalhali :" + bakiye);
                }
                break;
            case 4:
                System.out.println("agam  çıkışın yapıldı selametle");
                break;
            default:
                System.out.println("hatalı şecim girdiniz tekrar deneyiniz");


        }

    }
}
