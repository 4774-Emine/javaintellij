package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

        // c = (f-32)*5/9

        Scanner sc = new Scanner(System.in);

        System.out.println("Fahrenheit derecesini giriniz: ");
        int fhrnt = sc.nextInt();
        int c=((fhrnt-32)*5/9);
        System.out.println("Santigrat olarak dereceniz: "+ c);


    }
}
