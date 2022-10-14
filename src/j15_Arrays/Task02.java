package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {


        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner sc = new Scanner(System.in);

        System.out.println("kaç elemanlı array istiyorsunuz : ");
        int arrBoyut = sc.nextInt();
        int arr[] = new int[arrBoyut];

        for (int i = 0; i < arrBoyut; i++) {
            System.out.println(i + ". index elemanı giriniz: ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Arrayiniz: "     +Arrays.toString(arr));

        int arrToplam=0;
       for (int i=0; i<arr.length; i++){
           arrToplam+=arr[i];

       }
        System.out.println("Array eleman toplam= " +   arrToplam);
    }
    }














