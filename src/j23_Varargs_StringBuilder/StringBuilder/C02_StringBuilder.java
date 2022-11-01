package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {

    public static void main(String[] args) {

        // StringBuilder obj create etme...
        // 1. yol
        StringBuilder sb1 = new StringBuilder();// default capacity 16 bit olan value'su olmayan  bos sb

        System.out.println("sb1.length() = " + sb1.length());//0 -> length(): sb 'deki karakter sayısı return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append("jAVATAR");//javatar sb1' eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append(" selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);// jAVATAR selam olsun24true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34->capctiy aşma durumunda yeni capacity :eski  capacity *2+2->16*2+2=34 değeri atanır

        sb1.append(" basarı gayrete asıktır :)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//70-> capcity aşma durumunda yeni capacity:eski capacity*2+2->34*2+2=70 değeri atanır

        //2.yol
        StringBuilder sb2 = new StringBuilder("Kevser hanıma selamlar");//ilk değer ataması yapılmış sb1 StBuil obj
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());//38-> 22 karakter ilk değer atamasında oluştu+16 default hafıza yeri atandı

        //trim()->fazladan ayrılan capacity silinir
        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());

//3.yol
        StringBuilder sb3 = new StringBuilder(11);//hafızada 11 karakterlik yer ayıran boş sb atandı
        System.out.println("sb3.length() = " + sb3.length());//boş sb3 karakter sayısı=0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//24


        //istenen bir caharacter index'i alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//m

//Belirli bir aralıktaki character'leri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//3,4,5,6,7,,,,12index karakterleri->ATAR selam
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17,18,,,,, 17 ve sona kadar tüm karakterler ->un 24 true basarı gayrete asıktır
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));//3,4,5,,,,12 index karakterleri->ATAR selam


        //belirli bir index'teki karakteri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));//3. index A karakter silindi
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3,4,5,6, index karakterler silinecek
        System.out.println("sb1 = " + sb1);//jAVselam olsun 24 true basarı gayrete asıktır :)

        //istenen karakter veya karakterleri eklemek
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));
        String s = "güzel insan";
        System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));//ebub:)ekigüzel insanr bey
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//sb3 datasının 1.indexine s datasının [3,7)aralığını ekle

        StringBuilder sb4 = new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));//NihanQa Hanım

        //istenen index'teki karakteri değiştirme...
        sb4.setCharAt(4, ' ');
        sb4.setCharAt(sb4.indexOf(" "), ':');
        System.out.println("sb4 = " + sb4);//Niha Qa Hanım

//istenen index'e karakter yerine birden çok karakter eklemek
        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        //sb obj yi stringe çevirme->toString()
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());//sb3 stringe çevrilerek toUppercase methodu çalıştı


//String ile StringBuilder karsilastirmasi
/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersen java CTE verir*/

StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0
       // sb6.compareTo(str);//CTE verir eima armut kıyas olmaz

        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));//false->SB'de equals == gibi çalışır->hem value hem de ref değere bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true

    }
}