package j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

  */

        // Task -> verilen iki sayı toplamını print eden METHOD create ediniz

        int sayi1=24;
        int sayi2=27;
        int sayi3=46;
        int sayi4=10;
        topla(sayi1,sayi2);
        topla(sayi3,sayi2);
        topla(sayi1,sayi4);
        // Task -> verilen üç sayı toplamını print eden METHOD create ediniz
        topla(sayi1,sayi4,sayi3);

        System.out.println("   ***  varags method   ***   ");

        toplaVarargs(sayi1,23,sayi2,sayi3);// 4 p
        toplaVarargs(44,23,62,sayi1,sayi3);// 5 p
        toplaVarargs(sayi2,sayi3);// 2 p


     // Task -> verilen String'lerin en fazla karaktere sahip olanı print eden  METHOD create ediniz->> parametre saysı belirli değil : varargs


        enUzuuunKelime("aga","fatih","zeyyid");
        enUzuuunKelime("sümeyra","cebrail");
        }//main sonu

    public static void topla(int a, int b){//iki p'li overload meth
        System.out.println("sayılar toplamı :" +(a+b));

    }
    public static void topla(int a, int b,int c){//iki p'li overload meth
        System.out.println("sayılar toplamı :" +(a+b+c));

    }
    public static  void toplaVarargs(int ... a){//varargs method
        int toplam=0;
        for (int w:a){//varargs parametre arr içinde tanımlandıgı için parametreler loop aksiyon alır
            toplam+=w;
        }
        System.out.println("sayıların toplamı : "+(toplam));
    }
     public  static void enUzuuunKelime(String... str){//varargs method
        String enUzun="";

        for (String w:str){
            if (w.length()>enUzun.length()){
                enUzun=w;
            }
        }
         System.out.println("en uzun kelime :"+enUzun);


     }




}
