package j10_StringManipulations;

import java.util.Scanner;

public class C10_isEmpty {
    public static void main(String[] args) {

         /*
          StringIsEmpty
           String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
          isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
          Yani o String'in length() 0 demektir.
          length()==0 demek isEmpty() true verir demektir.
          Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin

         */

        String str = "hi";
        System.out.println("str bos mu :" +str.isEmpty());//false
        System.out.println(str.replaceAll("\\w", "").isEmpty());//true

        String x = " ";
        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true

        //Task->  2: Girilen  isim mutlaka space'den farkli en az 1 character icermediğini kontrol eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }
    }
}
