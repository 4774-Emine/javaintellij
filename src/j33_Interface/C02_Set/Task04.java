package j33_Interface.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Task04 {
    /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>(Arrays.asList("banana", "strawberry", "kiwi", "pineapple"));
        String a = "banana";
        String b = "peach";
        System.out.println("hs ilk hali = " + hs);
        System.out.println("hs son hali = " + changeSet(hs, a, b));
    }

    private static HashSet changeSet(HashSet<String> hs, String a, String b) {

        if (hs.contains(a)) {
            hs.remove(a);
            hs.add(b);
        }
        return hs;
    }
}
