package day09;

import java.util.Arrays;
import java.util.List;

public class Q09_Arraylist {
    /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

    public static void main(String[] args) {

    List<Integer> list = Arrays.asList(12, 11, 12, 15, 12, 34, 43);
    System.out.println(list);

    if(list.contains(12)) {
        for (int w : list) {
            if (w == 12) {
                list.set(list.indexOf(12), 21);
            }
        }

    }else {
        System.out.println("List doesn't contain the expected element");
    }

    System.out.println(list);
}

}
