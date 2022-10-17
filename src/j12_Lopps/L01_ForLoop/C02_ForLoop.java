package j12_Lopps.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        // task -> girilen sayıdan 100 e kadar +un katı tamsayıları print eden code create ediniz

        Scanner sc= new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayı=sc.nextInt();


        if (sayı>100){
            System.out.println("agam hani 100 den kuçuk girecktin :( ");
        }else {
            for (int i = sayı; i <100 ; i++) {//100 değeri forU çaşıştırmaz 98 foru çalıştırı ama for içindeki if çalışmaz
                if (i%4==0){
                    System.out.print(i+" ");
                }
               System.out.println(i+" için selam yazdı");
            }
        }

    }
}
