package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

  /*
  Java non-primitive(Class,array list->referans) data türlerinde obj kendisi değil de datalrı değişirse obj referans
   ve kendisi değişmediği dataları değişikliğini kalıcı  yapar
   */

        //Task-> list elemanları 24,20,87 iki farklı method ile list elemanlarını update edip print eden code create ediniz

   //1.Method-> for each kullansın 2.Method-> set(index,value) kullansın

     List<Integer> list=new ArrayList<>(Arrays.asList(24,20,87))  ;
     System.out.println("method öncesi list= "+ list);//24,20,87



        listUpdate1(list);//
        listUpdate2(list);//


        System.out.println("method sonrası list = " + list);//[48, 40, 174]-> Pass By referans


    }//main sonu


    public static void listUpdate1(List<Integer> list) {

        for (Integer v : list) {
            v *= 2;
        }
        System.out.println(list);
    }

    public static void listUpdate2(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);

        }
        System.out.println("list = " + list);
    }

}

