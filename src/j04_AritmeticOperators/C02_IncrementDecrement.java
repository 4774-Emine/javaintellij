package j04_AritmeticOperators;

import java.util.Scanner;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("   **** Increment-> Artırma *****    ");

        int a = 7;

        System.out.println(++a);//8

        System.out.println(a++);//8

        System.out.println(a);//9

        System.out.println(a++ + ++a);//20


        // ************AHMET HOCA*********************

        //kullanıcıdan bir tam sayı isteyuin.Girilen tam sayıyı yazdırıp sonra 1 arttırın.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı girin :");
        int girilensayi = sc.nextInt();

        System.out.println("girilensayi = " + girilensayi);

        girilensayi++;


        //Kullanıcıdan bir sayı daha alın.bu sayıyı önce arttırın sonra yazdırın.
        System.out.println("Lütfen bir tamsayı daha girin: ");
        int girilensayi2 = sc.nextInt();

        girilensayi2++;

        System.out.println("girilensayi2 = " + girilensayi2);


        int b = 10;
        System.out.println(b++); //önce 10 yazdırır sonra 1 arttırır.
        System.out.println(b); //11

        System.out.println(++b); //12

        System.out.println(b); //12


        int c = b++; //arttırma sonra, atama önce

        System.out.println("b :" + b + ", c " + c); // b:13 , c:12


         b = --c; //önce azalt sonra atama yap
        System.out.println("b :"+ b +", c" + c ); //b:11 , c: 11


        int d= b++ + ++c;
        System.out.println("b :"+ b +", c" + c + ", d" + d);// a:12, b:12 c:23




        int x=20;
        System.out.println(--x); //19

        System.out.println(x++); //19 (önce yazdır sonra arttır)

        System.out.println(++x);//21

        int y=++x;
        System.out.println("x :" + x+ ", y " + y); //x:22,y:22

        x= --y;
        System.out.println("x :" + x+ ", y " + y); // x:21, y:21

        y= x++;
        System.out.println("x :" + x+ ", y " + y); // x:22, y:21

        System.out.println(x++ + ++y);//22+22=44  işlem bitince x in değerini arttırıp 23 yapacak

// özetle
        int sayi=10;

        System.out.println(sayi++); // önce yazdırır (10) sonra değeri arttırır(11)
        System.out.println(sayi); // üst satirda değer (11) oldu, (11) yazdirir



    }
}
