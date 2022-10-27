package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
	Scanner  sc=new Scanner (System.in);
		System.out.println("Lütfen 1. sayıyı giriniz: ");
		int a=sc.nextInt();
		System.out.println("Lütfen 2. sayıyı giriniz: ");
		int b=sc.nextInt();
		System.out.println("4 işlem sonuçlarınız: "+ "toplama " +  (a+b)+ " Çıkarma " + (a-b)+ "Çarpma " +(a*b)+ "Bölme " + (a/b));



	}

}
