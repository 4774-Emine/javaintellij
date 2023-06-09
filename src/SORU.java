import java.util.Scanner;

public class SORU {
   static Scanner sc=new Scanner(System.in);
   static int bakiye=5000;
   static int yatirilanMiktar;
   static int cekilenPara;
   static int no;

   public static void anaMenü  () {

       System.out.println("****Merhaba Hoşgeldiniz****");
       System.out.println("Lütfen 1 ile 5 arasında seçim yapınız");
       System.out.println("1-->Bakiye\n2-->Para Yatırma\n3-->Para Çekme\n4-->Çıkış");
       no = sc.nextInt();
       if (no > 4 || no < 1) {
           System.out.println("Adam gibi bir sayı gir");
           anaMenü();
       }


   }

    public static void main(String[] args) {

       anaMenü();

    }
public  static void bakiyeniGör(){
    System.out.println("Bakiyeniz"+bakiye );
    anaMenü();
}

public static void paraYatir(){
    System.out.println("Please enter the deposit amount");
  yatirilanMiktar = sc.nextInt();
    bakiye += yatirilanMiktar ;
    System.out.println("Your Balance is :"+ bakiye);
    anaMenü();
}

public static void paraÇek(){
    System.out.println("Lütfen çekilecek miktarı giriniz: ");
       cekilenPara=sc.nextInt();


}


}



