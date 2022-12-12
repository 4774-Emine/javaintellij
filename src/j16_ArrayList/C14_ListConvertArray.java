package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {

        //listi Array'e çevirme->toArray();
        //1.Yöntem->toArray();parametre olarak String(0) alarak yapılır.


        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "ingiltere", "isvec"));
        String arrUlke[] = listUlke.toArray(new String[0]);//ulkeList'i elemanları arrUlke olarak atandı

        System.out.println("listUlke = " + listUlke);//listUlke = [Alamanya, Amerigonya, ingiltere, isvec]
        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke));//Arrays.toString(arrUlke) = [Alamanya, Amerigonya, ingiltere, isvec]


        //   2.Yöntem->Oluşturulan Arrayin data Type ı Object olarak atanır
        //TRICK->Object class java'da tüm class'ların parent(atası:HZ ADEM)
        //Object class javada parenti olmayan tek classtır(tüm vagonları çeken ama çekilmez lokomotiftir)
        //String Integer Class'lar Object Class child'i olduğu için istenen durumlarda data type olarak object class olarak kullanılır


        Object arrUlkeler[] = listUlke.toArray();//Object-> Hz.Adem Class'ına atandı
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));//[Alamanya, Amerigonya, ingiltere, isvec]


    }
}
