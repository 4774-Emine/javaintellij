package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        // variable create(Değişken oluşturmak) için..
        // 1- Datatype(Değişken türü) VariableName(Değişken ismi) "=" value(değişken değeri) ";"
        //             int                  yas                    =  48  ;
        //                Declaration(Tanımlama)                   =  Assaignment(Atama)

        // 1. yol -> best practice(Recomended) tavsiye edilen
        int yas=48;
        int maas=33000;
        System.out.println("yas");//yas
        System.out.println(yas);//48
        System.out.println(maas);//33000;
        System.out.println("nur hanım başlangıç maaşı : "+maas);//nur hsnım başlanıç maaşı : 33000
        // 2. yol
        int boy ; // değeri atanmayan boy isiminde bir int tanımlandı declaration
      //  System.out.println(boy);// değeri atnamamış değişkeni hiç bir aksiyonda kullanılamaz CTE
        boy=175;
        System.out.println("boyunuz:" +boy);//175


        // 3. yol
        int yevmiye,age,kilo;// birden cok aynı tipte değişken tanımlandı
        age=33;
        yevmiye=1000;
        kilo=99;// tanımlana değişkenlere değer atması yapıldı..

        int gunluk=1500, yil=2022, agırlık=99;
                //TRICK -> bir variable sadece bir kez tanımlanabilir ama birden cok değer atanabilir.
        System.out.println(gunluk);//1500

        gunluk=1800;// gunluk yeni  değeri 1800 olarak atandı
        System.out.println("gunluk son değeri :"+gunluk);//1800
        System.out.println("gunluk değeri:"+gunluk+"yıl değeri: "+yil+" "+yas+yevmiye+agırlık);
    }
}
