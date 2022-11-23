package j33_Interface.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task05 {
/*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */

    public static void main(String[] args) {

        LinkedHashSet<String> ulke=new LinkedHashSet<>(Arrays.asList("Germany","France","USA","Canada","Mexico","Brazil"));
        String ulke1="Germany";
        String ulke2="USA";
        System.out.println("ulke ilk hali" + ulke);
        System.out.println("ulke son hali = " + removing(ulke, ulke1, ulke2));
    }

    private static LinkedHashSet removing(LinkedHashSet ulke,String ulke1,String ulke2) {
        if(ulke.contains(ulke1)&ulke.contains(ulke2)){
            ulke.remove(ulke1);
            ulke.remove(ulke2);
        }
        return ulke;
    }

}
