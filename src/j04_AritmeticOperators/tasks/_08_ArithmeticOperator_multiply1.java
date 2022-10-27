package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz: ");
        double num1=sc.nextDouble();
        System.out.println("Lütfen 2.sayıyı giriniz: ");
        double num2=sc.nextDouble();
        System.out.println("Lütfen3.sayıyı giriniz: ");
        double num3=sc.nextDouble();
        double sonuc=num1*num2*num3;
        System.out.println("sonuc = " + sonuc);

    }
}
