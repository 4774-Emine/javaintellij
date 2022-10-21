package j15_Arrays.odev;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        Task ->
        elemanları : Apple, Orange , Banana, Kiwi
        olan String Array (Dizi) crdeate edip print eden code create ediniz.

         */

        //Kodu aşağıya yazınız.

        String yeniArr[] = new String[4];
        yeniArr[0] = "Apple";
        yeniArr[1] = "Orange";
        yeniArr[2] = "Banana";
        yeniArr[3] = "Kiwi";
        System.out.println(Arrays.toString(yeniArr));
    }
}