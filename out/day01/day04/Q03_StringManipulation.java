package day01.day04;

public class Q03_StringManipulation {
    public static void main(String[] args) {


        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

        String str1 = "$13.99";
        str1= str1.replaceAll("\\D","");
        System.out.println(str1);//1319

        String str2 = "$10.55";
        str2=str2.replaceAll("\\D","");
        System.out.println(str2);//1055
        System.out.println(str1+str2);//13991055


        //str1  ve str2 içeriği sayı olan String ifadelerdir
        //Eğer içeriğinin tamamen sayı olduğunu bildiğimiz
        //String varsa parseDouble() veya parseInteger() methodu kullanabiliriz

        double sayi1=Double.parseDouble(str1);//string olan str1 sayi olan str1 e dönüştü
        double sayi2=Double.parseDouble(str2);

        double toplam=(sayi1+sayi2)/100;//virgüllü sayı olduğu için böldük
        System.out.println("$"+toplam);




    }


}
