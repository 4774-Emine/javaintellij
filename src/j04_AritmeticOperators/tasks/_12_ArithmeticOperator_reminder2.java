package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _12_ArithmeticOperator_reminder2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında (num1 ve num2),
            num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
            int sonuc'u yazdırınız.  */


Scanner sc=new Scanner (System.in);
        System.out.println("Lütfen 1.sayıyı giriniz: ");
        int num1 = sc.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz: ");
        int num2=sc.nextInt();
         int sonuc=num1%num2;
        System.out.println(sonuc);

    }
}
