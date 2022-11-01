package day09;

import java.util.Arrays;

public class Q11_Arrays {
    /*
    aşağıdaki örnekte olduğu gibi 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */

    public static void main(String[] args) {

        int [] arr = {1,2,3,5,6,7,8,10,9};
        int [] arr1 = {7,2,3,10,5,9,1,4,8};
        int [] arr2 = {7,5,1,2,4,6,8,3,9};
        int [] arr3 = {7,5,10,2,4,6,8,3,9};

        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr1));
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr3));  }
    public static int missingNumber(int [] arr) {
        int missingNumber = 0;
        Arrays.sort(arr);
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[arr.length-1] == 9){
                missingNumber =10;
            }else if(arr[0] == 2){
                missingNumber = 1;
            } else if((arr[i] - arr[i-1]) > 1){
                missingNumber = arr[i] - 1;
            }
        }
        return missingNumber;
    }

    /*
    /*2.yol
        Dizide tüm sayılar tam olsaydı 1+2+3+4+5+6+7+8+9+10 = 55 olmalı idi.
        Verilen eksik elemanli dizideki tüm elemanlari toplayip; 55 ten çıkartırsak eksik olan elemanı verir.
        Bu mantik uzerine kurguladım...

 public static void main(String[] args) {
        int dizi1[] = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int dizi2[] = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int dizi3[] = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi1)); // 4
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi2)); // 6
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi3)); // 10
    }
   public static int eksikbul(int[] dizi) {
        int top = 0;
        for (int i = 0; i < dizi.length; i++) {
            top += dizi[i];
        }
        return 55 - top;
    }



    3.yol
     public static void main(String[] args) {

    int[] array= {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
    int[]input={1, 2, 3, 5, 6, 7, 8, 10,9};
    int olmayanSayi=array[0];
        Arrays.sort(input);
                for (int i = 0; i < array.length-1 ; i++) {
                    if(array[i]!=input[i]) {
                    olmayanSayi=array[i];
                    break;
                    }else{
                    olmayanSayi=array[array.length-1];
                    }
                    }
                System.out.println(olmayanSayi);
        }


     */

}

