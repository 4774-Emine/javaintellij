package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task04AtmMethod {//amele köyü

    static Scanner sc = new Scanner(System.in);
    static int bakiye = 1000;
    public static void secim() {
        System.out.println("agam ne yapaksan seç : ");
        int seçim = sc.nextInt();
        switch (seçim) {
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                cıkısYap();
                break;
            default:
                System.out.println("agam daha seçim yapamirsen bi de para istirsen ...");
                secim();

        }

    }

    private static void cıkısYap() {
        System.out.println("agam yine bekleriz çıkışınız yapılmıştır selametle güzel insan :) ");
    }

    private static void paraCek() {
        System.out.println("agam ne kadar cekecen :");
        int cekilecekMiktar = sc.nextInt();
        if (cekilecekMiktar<=bakiye){
            bakiye-=cekilecekMiktar;
            System.out.println("agam para cebinde gözünggg aydın :) ");
            System.out.println("agam bakıye :" + bakiye);
        }else System.out.println("agam nidddinggg olmayan patrayı mı cekicen :( ");
        karar();
    }

    private static void paraYatir() {
        System.out.println("agam elin tutulmaz ne gada yatııcenng : ");
        int yatırılacakMiktar= sc.nextInt();
        bakiye+=yatırılacakMiktar;
        System.out.println("agam para hesabında ahan da yeni bakıyen :"+bakiye);
        // bakiyeVer();
        karar();
    }

    private static void bakiyeVer() {
        System.out.println("agam bakıye :" + bakiye);
        karar();
    }

    public static void karar() {
        System.out.println("agam işleme \ndewamkeee -> 1\nyeter ->0");
        int karar = sc.nextInt();
        if (karar == 1) {
            System.out.println("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
            secim();
        } else if (karar ==0)cıkısYap();
        else System.out.println("agam adam gibi karar gir ");
    }


}
