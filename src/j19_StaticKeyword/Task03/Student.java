package j19_StaticKeyword.Task03;

import java.util.ArrayList;

public class Student {
   String name;
   int maxCredit;
   ArrayList<Lesson> dersListesi;

   public int toplamKredisi()
   {
      int toplamKredi=0;
      for(Lesson les  : dersListesi)
      {
         toplamKredi+= les.credit;
      }
      return toplamKredi;
   }


}
