package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {

   /*
   for-each loop for loop'un gelişmiş halidir.
   1. clean code- yazım kolaylığı
   2.code okuma kolaylığı
   3.hata yapma riskini azaltır.
    */

     List<Integer> sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24)) ;
        System.out.println("   ****Task1****   ");
     //Task->  List elemanlarını ayrı satırlara print ediniz

        for (int i = 0; i <sayiList.size() ; i++) {

            System.out.println((sayiList.get(i) + " "));
        }


        for(Integer a: sayiList){
            System.out.println(a+" ");
        }
        System.out.println(   "*****Task2***** "  );
      //Task-> List elemanlarının ilk 3 eleman hariç tek olanları print ediniz
        for(Integer a: sayiList.subList(3,sayiList.size())){
            if(a%2==1){
                System.out.println(a+ " ");
            }
        }
        System.out.println(  "*****Task3**** "  );
        //Task-> List elemanlarının 2 ile 5 index arasındaki (2,3,4,5)elemanların toplamını print ediniz
        int toplam=0;
for(int a : sayiList.subList(2,6)){
    toplam+=a;
}
        System.out.println("toplam= "+toplam);






    }
}
