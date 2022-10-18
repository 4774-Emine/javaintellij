package day01;

public class Q02_Println_vs_print {

      /*
  println() ve print() arasinda tek fark var;
  println satir atliyor,
  print ise imlecin ayni satirda kalmasini sagliyor.

    Konsolda
    *****println*****
    Welcome
    to
    Java
    Class
    *****print*****
    Welcome to Java Class yazdirinz
   */
      public static void main(String[] args) {
          System.out.println("*****println*****");
          System.out.println("Welcome");
          System.out.println("to");
          System.out.println("Java");
          System.out.println("Class");
          System.out.println("*****print*****");
          System.out.print("Welcome to Java Class");
          System.out.println("fark bu sekilde gorulur");

      }



    /*
   konsolda
   1
   2
   3
   4
   5
   yazdiriniz
   sonrasinda da  yanyana 12345 yazdiriniz
    */
}
