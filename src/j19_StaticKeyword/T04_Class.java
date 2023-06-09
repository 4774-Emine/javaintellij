package j19_StaticKeyword;

public class T04_Class {
    /*
       => Class'in icinde methodlarin disinda olusturulan variable'lara "instance variable" denir.
        => Class'in icinde methodlarin disinda olusturulan static variable'lara "Class variable" denir.
        => Instance variable'lar gibi Class variable(Static variable)'lar initial edilmezse(ilk değere ataması) default value ataması yapılır
        => Static variable'lar call etmek  icin object olusturmaya gerek yoktur.
        => Bulunduğu  class icinden static yapılara  ulasilabilir.Farklı class'lardan ClassName.staticYapı class name ile call edilir.
             farklı class'da obj name ile değl class name ile call edilir.
        => Instance variable(Object Variable)'lar call etmek icin object create edilmesi zorunludur.Object olusturmadan
           instance variable'a ulasilamaz.
        => Static variable'lara object ile call edilebilir ama tavsiye edilmez.
        => Eger static variable'lara object ile call edilirse Java  sari alt cizgi ikaz eder->.BAD PRACTICE
       =>   static keyword hafıza opt. için kullanılır ve memory'de 1 kez oluşturulur

             bir obj static variable değeri değişirse tüm obj variable değeri değişir
             static obj den bağımsızdır class'a bağımlı Class'ın malıdır.

             Trick-> bir variable, methoda doğrudan calss name ile obj olmadan call etmek için static olmalıdır..

    */
    static int a = 10;
    static int b;

    static {

        System.out.println("sataic blok çalıştı");
        b = a * 4;
    }

    int yas = 40;
    static int yas1 = 20;

    public static void sttc() {
        System.out.println("static method çalıştı");
    }

    public void nonSttc() {
        System.out.println("Non-static method çalıştı");

    }


    public static void main(String[] args) {
        T04_Class obje = new T04_Class();
        System.out.println("obje.yas = " + obje.yas);
        System.out.println("yas1 = " + yas1);

        sttc();
        obje.nonSttc();
        System.out.println(a);
        System.out.println(b);

    }


}
