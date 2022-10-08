package j12_Lopps.L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        Eğer bir döngünün body sinde başka bir döngü bulunuyorsa bu döngülere nested-loop_>içiçe döngü denir
        İç döngü dış döngünün her adımda tekrar çalışır
        İçiçe döngülerde en içteki döngü önce çalışır
         */


      for(int apt=0; apt<=10; apt++){
          System.out.println("dış döngü: "+apt);

          for(int daire=1;daire<6;daire++){
              System.out.println("apt "+apt+"için daire döngü :"+daire);
          }
      }





    }
}
