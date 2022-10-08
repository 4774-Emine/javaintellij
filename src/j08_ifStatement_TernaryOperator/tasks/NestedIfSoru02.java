package j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class NestedIfSoru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Harf girin");
			char h = scan.next().charAt(0);
			if(h>='a' && h<='z') {
				if(h=='a') {
					System.out.println("Ilk kucuk harf");
				}else {
					System.out.println("Ilk kucuk harf degil");
				}
			}else if(h>='A' && h<='Z') {
				if(h=='Z') {
					System.out.println("Son buyuk harf");
				}else {
					System.out.println("Son buyuk harf degil");
				}
			}else {
				System.out.println("Lutfen harf giriniz");
			}
			scan.close();
	}

}
