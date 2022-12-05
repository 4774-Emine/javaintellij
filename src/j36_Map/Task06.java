package j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task06 {

    /*
map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Cevap Elephant olmalı.
 */

    public static void main(String[] args) {

      Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"Lion");
        mp.put(2,"Tiger");
        mp.put(3,"Elephant");
        mp.put(4,"Cat");
        mp.put(5,"dog");

        Scanner sc = new Scanner(System.in);
        System.out.print("agam sayi giresen : ");
        int sayi=sc.nextInt();

        System.out.println("map1(mp,sayi) = " + map1(mp, sayi));

    }//main sonu

    public static String map1(Map<Integer, String> mp, int sayi) {
        return mp.get(sayi); //sayi:Int Key değerine karsılık value get eder
    }
}





