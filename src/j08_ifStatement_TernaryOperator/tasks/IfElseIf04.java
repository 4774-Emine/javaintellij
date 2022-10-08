package j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum�? yazdırın.
Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl�? yazdırın.
Eğer yıl 10’a bulunuyorsa ekrana “Onyıl�? yazdırın
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("bi yil girin");
			int yil = scan.nextInt();
			if (yil<=0){
				System.out.println("negatif veya sifir yil olarak girilmez");
			}else if(yil%1000==0) {
				System.out.println("Milenyum");
				
			}else if(yil%100 ==0) {
				System.out.println("Yuzyil");
			}else if(yil%10 == 0) {
		System.out.println("Onyil");
	}
			scan.close();
}
}

	

