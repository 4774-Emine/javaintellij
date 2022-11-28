package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

  /*
  Queue collo. interface olduğu için child class olan LinkedList ve PriorityQueue ile obj üretilir.
  Eczane,yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır
  Cons seçimine göre queue obj özellikleri belirlenir.
  FİFO---> first in first out: Coll. ilk giren eleman ilk çıkar.Eleman en sona eklenir en baştan silinir.
   */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("cebrail", "Sümeyra", "yakup", "Muharrem"));
        System.out.println("q1 = " + q1);//[cebrail, Sümeyra, yakup, Muharrem]-->insertion order
        q1.add("Erol");
        System.out.println("q1 = " + q1);// [cebrail, Sümeyra, yakup, Muharrem, Erol]

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("javaCAN", "javaSU", "javaNAZ", "javİYE"));
        System.out.println("q2 = " + q2);
        q2.add("java");
        System.out.println("q2 = " + q2);//q2 = [java, javaCAN, javaNAZ, javİYE, javaSU]

        System.out.println("q1.element() = " + q1.element());
        System.out.println("q1.peek() = " + q1.peek());//cebrail

        System.out.println("q1.remove() = " + q1.remove());//cebrail
        System.out.println("q1.poll() = " + q1.poll());//cebrail

//pekk();--> copy-paste gibi ilk elemanı return eder ama silmez
// poll();-->cut-paste gibi ilk elemanı siler ve return eder
// element();-> ilk elemanı silmeden return eder.
        //remove();->ilk elemanı siler ve return eder...


        //ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        // poll ise null return eder.

        q1.clear();//queue coll. elemanları silindi.
        System.out.println("q1 = " + q1);//[]
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());//null
        System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException5


        //offer()-> queue coll. eleman eklemek için kullnılır.
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));//true

/*
TRİCK--> offer ve add farkı->eger queue coll. eleman kısıtlması yapılmış ise add meth. Exception fırlatır.
Offer ise true-false return eder.
 */
    }
}
