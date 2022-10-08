package day01.day04;

import java.util.Scanner;

public class Q12_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

  Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
int bosluk=str.indexOf(" ");
if(bosluk==-1 && !str.isEmpty()) //bosluk yoksa ve string ifadem bos değilse
    System.out.println("sartlara uygun");
else System.out.println(("şartlara uygun değildir"));


    }



}