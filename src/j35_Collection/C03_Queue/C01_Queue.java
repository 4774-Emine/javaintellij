package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue coll. interface oldg için child class olan LinkedList ve PriorityQueue ile obj üretilir.
        Eczane, yemekhane vs belirli şart ile aksiyon olan elemanlar için kullanılır.
        Cons seçimine göre queue obj özelllikleri belirlenir.
        FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar .Eleman en sona eklenir
         */

        Queue<String> q1=new LinkedList<>(Arrays.asList("Cebrail","Sümeyra","Yakup","Muharrem"));
        System.out.println("q1 = " + q1);//q1 = [Cebrail, Sümeyra, Yakup, Muharrem]->insertion order
        q1.add("Erol");
        System.out.println("q1 = " + q1);//q1 = [Cebrail, Sümeyra, Yakup, Muharrem, Erol]
        Queue<String> q2=new PriorityQueue<>(Arrays.asList("javaCAN","javaSU","javaNAZ","javİYE"));
        System.out.println("q2 = " + q2);
        q2.add("javiDAN");
        System.out.println("q2 = " + q2);
        System.out.println("q1.element() = " + q1.element());//ilk elemanı verir//NoSuchElementException fırlatır
        System.out.println("q1.peek() = " + q1.peek());
        /*
        peek() -> copy paste gibi ilk elemanı return eder ama silmez
        poll() -> cut-paste gibi ilk elemanı siler ve return eder
        element()-> ilk elemanı silmeden return eder
        remove()-> ilk elemanı siler ve return eder
        ahan da Trick köşesinde bugün: poll ve remove farkı ->eğer queue coll. boş ise remove
        NoSuchElementException fırlatır poll ise null return eder
         */
        q1.clear();// elemanlar silindi
        System.out.println("q1 = " + q1);//q1 = []
        System.out.println("q1.size() = " + q1.size());//q1.size() = 0
        System.out.println("q1.poll() = " + q1.poll());//q1.poll() = null
       // System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException

        //System.out.println("q1.remove() = " + q1.remove());// boşsa exc. fırlatır şuan sildi
        System.out.println("q1.poll() = " + q1.poll());// boş ise exc fırlatmaz null verir

        //offer()->queue coll. eleman eklemek için kullanılır
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));
        /*
ahan da Trick kösesinde bugun : offer ve add farkı ->  eger queue coll. eleman kısıtlaması yapılmış ise
 add meth Exception fırlatır.offer ise true-false return eder.
​
*/
    }
}