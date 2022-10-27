package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */
Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz: ");
        int num1 = sc.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz: ");
        int num2=sc.nextInt();
        int sonuc=num1/num2;
        System.out.println("sonuc = " + sonuc);


    }
}
