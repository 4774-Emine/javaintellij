package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        /*
        length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
        butun karakterleri(boşluk vs) sayıp adedini verir
         */

        String str="madem geldin dunyaya otur çalış javaya";

      int strKrtrSayisi=  str.length();//int type bir data verir
        System.out.println(str);//madem geldin dunyaya otur çalış javaya
        System.out.println(strKrtrSayisi);//38
        System.out.println(str.length());//38

        String str1="";
        System.out.println(str1.length());//0

        String str2=" ";
        System.out.println(str2.length());//1

        String str3=null;

        //str3.concat(str1);//rte
        System.out.println(str3.length());//Run time  error
        // TRICK-> null atanan stringler String method çalışmaz cıssss
        /*
        null case sensitivedir. yani Null veyaNULL yazılamaz
        null bir değer değildir(dutluk)sadece hiçliği gösteren  bir pointer(giriş işaretçi)
         */

        String name;// deklare edilmiş ama tanmamış  string String method çalışmaz CTE vcerir.

      //  name.concat(str1);


    }
}
