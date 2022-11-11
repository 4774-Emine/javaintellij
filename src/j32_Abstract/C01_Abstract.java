package j32_Abstract;

public class C01_Abstract {
    /*
    1- Bazı durumlarda child class'lar parent class'daki method'ların genellikle body2lerine değiştirerek override ederler.
    Bu gibi durumlarda parent class2daki method'a body tanımlamak ram ve memoey acısından gereksizdir.
    Çözüm olarak java Parent Class'a body'siz -> abstract(soyut)  methodlar tanımlamıştır

    2- Parent class'daki abstract methodlar app güvenliği açısından child class'da override edilmek zorundadır.
    eğer parent class'daki child class'ın mutlaka kullanması gereken method varsa abstract tanımlanmalı
    motor() her aracda olmalı.

    3- abstract method tanımlamak  için
      a) {} body olmaz
      b) access modief sonrası abstract keyword kullanılmalı
      c) abs method içinde abstract keyword ve {} body birarda kullanılama aksi halde CTE
      abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.
    4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.
            ama abs class'da concerete emthod tanımlanabilir
    5- Abs Class içinde hem abs method hem de concrete method ve variable tanımlanabilir.
    6- Bir concerete child class parent abs class extend ettiğnde abs method'ları implement etnek zorunda
        ama concerete methodlar isteğe göre override edilir.
    7- Parent child ilşkisi olan abstarct class'lar abs method'ları implement etmek zorunda değil
    8- Parent olan abs class birden çok concerete  veya abs child class exyends edibilir.
        ancak child class birden cok abs parent class'dan extends e-de-mezz...

    9-  Abs Class'da final ve abs method tanımlanamaz CTE -> final method override edilemyecegi için abs olamaz
    10- Abs Class'da private ve abs method tanımlanamaz CTE -> private method override edilemyecegi için abs olamaz
    11- Abs Class'da static ve abs method tanımlanamaz CTE-> static method override edilemyecegi için abs olamaz

        **** ABSTRACT CLASS ASLA KESİNLİKLE OBJE URETEMEZ !!!!
        TRİCK-> Abstract Class'lar referansı child Class'ın obj tutabilir(Polimorphism)








     */

}
