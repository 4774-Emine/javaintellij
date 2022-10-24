package day05;

import java.util.Scanner;

public class Q08_MethodCreation {

      /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol etmek için bir Java Methodu yazınız.
    Test Data:       2017   2000    2022
    Beklenen Çıktı:  false  true    false
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();

        System.out.println(artikYilMi(n));
    }


    private static boolean artikYilMi(int yil) {

        return (yil%400==0 || (yil%100!=0 && yil%4==0 ));
    }

}
