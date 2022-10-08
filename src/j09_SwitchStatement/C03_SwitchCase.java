package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...

        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir ay gir bakam  : ");
        int ayNo = sc.nextInt();

        switch (ayNo) {
            default:
                System.out.println("adam gibi bişey gir :( ");
               break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gün içerir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ay 30 gün içerir");
                break;
            case 2:
                System.out.print("yılınızı giriniz : ");
                int yil = sc.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("girilen ay subat ayı 29 gün içerir ");
                } else System.out.println("girilen ay subat ayı 28 gün içerir");
                break;

        }


    }
}
