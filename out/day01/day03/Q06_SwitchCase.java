package day01.day03;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Q06_SwitchCase {

    public static void main(String[] args) {
       /*
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir harf seçin A, B, C");
        char choise = scan.next().toUpperCase().charAt(0);
        switch (choise) {
            case 'A':
                System.out.println("Java is easy");
                break;
            case 'B':
                System.out.println("Java is fun");
                break;
            case 'C':
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("Hatalı seçim");
                break;
        }



    }


}
