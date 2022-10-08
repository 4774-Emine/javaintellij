package Task_Loop;

import java.util.Scanner;

import static j11_MethodCreation.C05_RecursiveMethod.faktöriyel;

public class Task03 {
    public static void main(String[] args) {
 //girilen sayının faktöriyelini hesaplayan method create ediniz
  //sayi! =  1*2*3*4*5*.....*sayi

  Scanner sc=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int sayi=sc.nextInt();

        faktöriyel(sayi);//int parametreli method call


    }//main dışı


    private static int faktoriyel(int sayı) {
        int faktoriyel = 1;

        for (int i = 1; i <= sayı; i++) {
            faktoriyel *= i;

        }
        // System.out.println("faktoriyel : "+faktoriyel);
        return faktoriyel;
    }










}
