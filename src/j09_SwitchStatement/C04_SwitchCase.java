package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // girilen ayın hangi mevsimde oldugunu print eden code create ediniz...

        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir ay gir bakam  : ");
        int ayNo = sc.nextInt();
       // String  ay=sc.nextLine();
        switch (ayNo) {
            case 12:

            case 1:

            case 2:
                System.out.println("KIŞ");
                break;
            case 3:

            case 4:

            case 5:
                System.out.println("İLKBAHAR");
                break;
            case 6:

            case 7:

            case 8:
                System.out.println("YAZ");
                break;
            case 9:

            case 10:

            case 11:
                System.out.println("SONBAHAR");
                break;

            default:
                System.out.println("agam sizin köyde bir yılda kaç ay var :(");
        }


    }
}
