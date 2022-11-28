package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque: Double Ended Queue-> Queuelerde  FİFO Dequelerde ise hem FİFO hem LİFO geçerli
        LİFO:Last in First out
         */



        Deque<String > dq1=new LinkedList<>(Arrays.asList("Küşleme","önkol","börek yatagı","ezme","haydari"));
        System.out.println("dq1 = " + dq1);//[Küşleme, önkol, börek yatagı, ezme, haydari]
        dq1.add("humus");
        System.out.println("dq1 = " + dq1);//[Küşleme, önkol, börek yatagı, ezme, haydari, humus]
        System.out.println("dq1.getFirst() = " + dq1.getFirst());//Küşleme
        System.out.println("dq1 = " + dq1);//[Küşleme, önkol, börek yatagı, ezme, haydari, humus]
        System.out.println("dq1.getLast() = " + dq1.getLast());//humus
        System.out.println("dq1 = " + dq1);//[Küşleme, önkol, börek yatagı, ezme, haydari, humus]
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//Küşleme
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.peekLast() = " + dq1.peekLast());//humus
        System.out.println("dq1 = " + dq1);
        /*
        ahan da TRİCK :getFirst() meth deque coll. boş ise  NoSuchElementException firlatır
        peekFirst() math. deque boş ise null return eder.
         */
        dq1.clear();
        System.out.println("dq1 = " + dq1);//[]
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());// null
        // System.out.println("dq1.getFirst() = " + dq1.getFirst());//RTE : NoSuchElementException
        // System.out.println("agam selametle app. run oldu. DEWAMKEEE...");
        Deque<String > dq2=new LinkedList<>(Arrays.asList("havuc dilimi","güllaç","su muhallebi","trileçe","kazan dibi"));
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());// havuc dilimi
        System.out.println("dq2.pollLast() = " + dq2.pollLast());// kazan dibi
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());// güllaç
        System.out.println("dq2.removeLast() = " + dq2.removeLast());//trileçe
        //  System.out.println("agam selametle app. run oldu. DEWAMKEEE...");
        dq2.clear();
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());// null
        System.out.println("dq2.pollLast() = " + dq2.pollLast());// null
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());// .NoSuchElementException
        System.out.println("dq2.removeLast() = " + dq2.removeLast());//.NoSuchElementException
        System.out.println("agam selametle app. run oldu. DEWAMKEEE...");
    }
}


