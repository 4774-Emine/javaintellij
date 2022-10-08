package j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class Ifstatement04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 sayi 3 basamakli ise console ' a 3 basamakli yazdirin
		 sayi 2 basamakli ise console'a 2 basmakli yazdirin
		 sayi 3 basamakli yada 2 basamakli degilse ikiside degil yazdirin
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("sayi giriniz");
			int sayi = scan.nextInt();
			if(sayi<=999 && sayi>=100) {
				System.out.println("Sayi 3 basamaklidir.");
				
			} else if(sayi<=99 && sayi>=10) {
				System.out.println("sayi 2 basamaklidir");
			}else {
				System.out.println("ikiside degil");
			}
		scan.close();
	}

}
