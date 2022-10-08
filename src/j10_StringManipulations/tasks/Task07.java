package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
  /*
  Girilen string içindeki istenen indexteki karakteri print eden code create ediniz...
   */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String str=sc.next();
        System.out.println("istediğin karakter için index gir : ");
        int index= sc.nextInt();

        if(str.length()>index){
            System.out.println(str.substring(index, index + 1));//1.yol
            System.out.println(str.charAt(index));//2.yol

        }else System.out.println("olmayan index istiyorsunuz");








    }
}
