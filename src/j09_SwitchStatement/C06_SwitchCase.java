package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
// TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..


        Scanner sc = new Scanner(System.in);
        System.out.print("gun giriniz : ");

        String gun = sc.next().toLowerCase();//PazAR girilse bile girilen karakterler kucuk harfe atanır


        switch(gun) {

            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe"://yukarıdaki tüm case2ler aynı aksiyonu alacagı için break atılmadı
            case "cuma":
                System.out.println("girilen gün hafta içine aittir ... ");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("girilen gün hafta sonuna aittir ... ");
                break;

            default://swicth hic bir case eşleşmezse çalışır
                System.out.println("lütfen doğru giriş yapınız :( ");

        }


    }
}
