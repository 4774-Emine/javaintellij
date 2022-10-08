package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		

		System.out.println("kare,dikdörtgen,üçgen birini seçiniz : ");
String secim=sc.next();
		System.out.println("1.sayıyı seçiniz .");
		int sayi1=sc.nextInt();
		System.out.println("2.sayıyı seçiniz : ");
		int sayi2=sc.nextInt();


secim(secim,sayi1,sayi2);




	}//main dışı
public static void secim(String str,int sayi1,int sayi2){
		switch(str){
			case "kare":
				sayi2=sayi1;
				kareAlan(sayi1,sayi1);
				kareCevre(sayi2,sayi2);

				break;

			case"dikdörtgen":
				dikdörtgenAlan(sayi1,sayi2);
				dikdörtgenCevre(sayi1,sayi2);

				break;

			case "üçgen":

				sayi2=sayi1;
				üçgenAlan(sayi1);
				üçgenCevre(sayi1);

				break;

			default :
				System.out.println("hatalı seçim yaptınız");
				secim(str,sayi1,sayi2);
		}
}

	private static void üçgenCevre(int sayi1) {
		System.out.println("üçgen çevre: "+ (sayi1*3));

	}

	private static void üçgenAlan(int sayi1) {
		System.out.println("üçgen yüksekliğini giriniz : ");
		int yksklk=sc.nextInt();
		System.out.println("üçgen alanı: "+((yksklk*sayi1)/2) );


	}

	private static void dikdörtgenCevre(int sayi1, int sayi2) {
		System.out.println("dikdörtgen  çevre :"+((sayi1+sayi2)*2));
	}

	private static void dikdörtgenAlan(int sayi1, int sayi2) {
		System.out.println("dikdörtgen alan:"+(sayi1*sayi2));
	}

	private static void kareCevre(int sayi1, int sayi2) {
		System.out.println("karenin çevresi: "+
				(sayi1*4));
	}

	private static void kareAlan(int sayi1, int sayi2) {
		System.out.println("karenin alanı: "+ (sayi1*sayi1));
	}


}
