package day06;

import java.util.Scanner;

public class Q06_MetCreationForLoop {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String str = scanner.nextLine();

        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String tersiStr = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersiStr +=str.charAt(i);
        }
        return tersiStr;
    }

}
