package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..

        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        double sayı1 = sc.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double sayı2 = sc.nextDouble();
        System.out.print("işleminizi giriniz : ");
        char islem = sc.next().charAt(0);
        islemMenu(islem, (int) sayı1, (int) sayı2);
    }//main sonu
    public static void islemMenu(char ch, int x, int y) {
        switch (ch) {
            case '+':
                topla(x, y);
                break;
            case '-':
                cıkar(x, y);
                break;

            case '*':
                carp(x, y);
                break;
            case '/':
                bol(x, y);
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
        }

    }

    public static void topla(int a, int b) {
        System.out.println("a+b = " + (a + b));
    }

    public static void carp(int a, int b) {
        System.out.println("a*b = " + (a * b));
    }

    public static void cıkar(int a, int b) {
        System.out.println("a-b = " + (a - b));
    }

    public static void bol(int a, int b) {
        System.out.println("a/b = " + (a / b));
    }

}
