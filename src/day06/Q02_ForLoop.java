package day06;

public class Q02_ForLoop {
        //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {
      //  System.out.println("****for ile*********");

    //    for (int i = 0; i <=255 ; i++) {
    //        char karakter = (char) i;
    //        System.out.println(i + "->" + karakter);
    //    }

    //    System.out.println("****while ile********");
    //    int a =0;
    //    while (a<=255){
    //        char c = (char) a;
    //        System.out.println(a + "->" + c) ;
    //        a++;
    //    }


        System.out.println("*****do while ile********");
        int x = 0;
        do {
            char k = (char) x;
            System.out.println(x + "->" + k);
            x++;
        }while(x<=255);
    }

}
