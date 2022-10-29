package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 3 basamaklı bi sayı giriniz: ");
		int sayi = sc.nextInt();
		int birler=sayi%10;//birler
		sayi/=10;
		int onlar=sayi%10;//onlar
		int yuzler=sayi/10;


		System.out.println("Birler ve yüzler basamağı toplamı: " + (birler + yuzler));

	}
}