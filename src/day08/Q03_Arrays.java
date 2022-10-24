package day08;


import java.util.Arrays;

public class Q03_Arrays {

    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

    //    //1.adim str tanimladik
    //    String str = "HeySiri";
//
    //    //2.adim HeySiri yi ByeSiri ye donustur
    //    str =str.replace("Hey", "Bye");
    //    System.out.println(str);
//
    //    String arr[] = new String[1];
    //    arr[0] =str;
    //    System.out.println(Arrays.toString(arr));

        //2.yol
        String str1 = "HeySiri";
        String yeniStr [] = str1.split("y");
        System.out.println(Arrays.toString(yeniStr)); //[He, Siri]
        yeniStr[0] = "Bye" ;
        System.out.println(Arrays.toString(yeniStr)); //[Bye, Siri]

        str1 =yeniStr[0] +  yeniStr[1];
        System.out.println("str1 = " + str1);

        String arr2[] = new String[1];
        arr2[0] = str1;
        System.out.println(Arrays.toString(arr2));

    }
}
