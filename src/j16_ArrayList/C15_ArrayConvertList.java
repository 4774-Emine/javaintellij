package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
      //king of TRİCK-> Array'den çevrilen List array kaynaklı olduğu için array davranışı gösterir,
        // boyut sabittir dolayısıyle remove add method çalışmaz.

        String arrJavaCan[]={"Akif","Gamze","Musty","Sevdenur"};
        List<String> listJavaTar= Arrays.asList(arrJavaCan);//arrJavacan değerleri list eleman olarak atandı
        System.out.println("listJavaTar = " + listJavaTar);//listJavaTar = [Akif, Gamze, Musty, Sevdenur]
        System.out.println("listJavaTar.size() = " + listJavaTar.size());//4


      //listJavatar.add("sefilCAN Haluk");//array'a eleman eklenmeeeeezzzzzz :(
                                         //RTE->UnsupportedOperationExeption
        //ahan da kral Trickyyyy->list data type ArrayList tanımlanırsa RTE vermez
        //kaynağı array de olsa list davranır boyut esnekliği yapar.


        ArrayList<String > listJavaTar1= new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefil haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);//[Akif, Gamze, Musty, SevdeNur, sefil haluk]


    }
}
