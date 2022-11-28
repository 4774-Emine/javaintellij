package j35_Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
   /*
   task ->>
   Not e değerleri ", olan bir Linkedlist create ediniz...
   Girilen bir String değeri LinkedListte varlığını kontrol edip varsa silip "Agam eleman halledildi" yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create ediniz
    */

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("yakup", "javaCAN", "javaTAR", "Teykinay"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Agam kime bakmıştınız : ");
        String aganınAdamı = sc.next();

        System.out.println(ll1);

        if (ll1.remove(aganınAdamı)) {//true->sitenen node var ve silindi

            System.out.println("Agam eleman halledildi");
            System.out.println("aganın adamı halloduktan sonra :" + ll1);

        } else System.out.println("Agam aradığınız kişiye ulaşılamadı");



    }
}
