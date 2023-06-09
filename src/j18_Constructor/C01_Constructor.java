package j18_Constructor;

public class C01_Constructor {
    /*
    1- Constructor ismi Class ismi ile aynı olmalı.Büyük harf ile başlamalı.
    2-Constructor create edildiğinde name den sonra (){} mutlaka kullanılmalı.
    3-Eğer parametreli cons. create edildiğinde java default cons. ezer(siler)
    4-Cons. return type olmaz methoddan ayıran özelliğidir.
    5-Class oluştuğunda java default cons. kendi create eder.
    6-Bir classta birden fazla cons. tanımlanabilir.
     */

    String str;//inst variable->obj variable->initial edilmemiş
    String selam = "güzel insan";
 //   C01_Constructor obj1 = new C01_Constructor();

    public static void main(String[] args) {
        //   clas name      obje name    new keyword   default cons.
        C01_Constructor obj1 = new C01_Constructor();
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();

        obj1.str = "javacan";//str ins. variable obj1 ile call edilerek obj1  javacan değeri atandı
        obj2.str = "javatar";//str ins. variable obj2 ile call edilerek obj2 javatar değeri atandı
        System.out.println(obj3.selam);//"güzel insan"

        System.out.println("obj1.str = " + obj1.str);//obj1.str = javacan
        System.out.println("obj2.str = " + obj2.str);//obj2.str = javatar
        System.out.println("obj4.str = " + obj4.str);//obj4.str = null

        obj3.aga();//agama selamkeee :)
        obj2.aga();//agama selamkeee :)
        //aga();--> non-static method obj olmadan call edilemez.

    }// main sonu

    public void aga() {
        System.out.println("agama selamkeee :)");
    }
}