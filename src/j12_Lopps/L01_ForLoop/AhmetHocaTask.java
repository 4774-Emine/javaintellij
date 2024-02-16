package j12_Lopps.L01_ForLoop;

import java.util.Scanner;

public class AhmetHocaTask {
    public static void main(String[] args) {

        //Kullanıcıdan iki sayı alın
        // aralarındaki 3 ile bölünebilen sayıları yazdırın.
        //ilk girilen sayı ikinci girilen sayıdan büyük ise hata mesajı yazdırın

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen iki pozitif tam sayı girin");
        int sayi1=sc.nextInt();
        int sayi2=sc.nextInt();

        if (sayi1>sayi2){
            System.out.println("ilk sayı daha küçük olmalıdır");
        }else{
            for (int i=sayi1; i<=sayi2; i++){
                 if (i%3==0){
                     System.out.print(i+ " ");
                 }
            }
        }




    }
}
