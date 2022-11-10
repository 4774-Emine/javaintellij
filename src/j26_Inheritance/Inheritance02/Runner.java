package j26_Inheritance.Inheritance02;



public class Runner {

    public static void main(String[] args) {
        // DataType  objName          Cons
        Kedi k1 = new Kedi();

        System.out.println("k1.a = " + k1.a);//0->Hayvancık Class call
        System.out.println("k1.c = " + k1.c);//2->Kedi class call
        System.out.println("k1.d = " + k1.d);//5->Kedi Class call
        System.out.println("k1.m = " + k1.m);//1->Mammal Class call

        /*
			  Ayni isimli variable'lardan hangisinin kullanildi
			olusturulan object'in data type'ina göre bilinir
			Variable'i arastirmaya data type'i classindan baslanır.
			*/

        k1.mA();//Hayvancık class call
        k1.mC();//Kedi Calss call
        k1.mM();//Mammal Class call
            /*
			 Method cagirilirken ayni isimli methodlardan
			 hangisinin kullanilacagina Constructor karar verir.
			 Methodlari arastirmaya Consctuctor ismini tasiyan
			 class'dan baslayin ve parentlarda arastirmaya devam edin.
			 */
        Mammal k2 = new Kedi("Kevser");//DataType-> Parent Mammal Class Cons->p'li Kedi Class
        System.out.println("k2.c = " + k2.c);//4
        System.out.println("k2.a = " + k2.a);//0
        System.out.println("k2.m = " + k2.m);//1
        //k2.d->CTE k2 obj Data type Mammal Class d variable yok call edilemezzzz
        k2.mA();// mA - > HAYVANCIK  class meth call.
        k2.mC();//mC - > Kedi  class meth call.
        k2.mM();// mM - > Mammal  class meth call.

        Hayvancık k3 = new Kedi();
        System.out.println("k3.m = " + k3.m);//3
        System.out.println("k3.a = " + k3.a);//0
        //   k3.c-> Datatype Hayvancık Class oldg için Class'da olmayan c variable call edilemezz
        k3.mA();// mA - > HAYVANCIK  class meth call.
        k3.mM();// mM - > Mammal  class meth call.
        
         Mammal m1=new Mammal('$');
        System.out.println("m1.m = " + m1.m);//1
        System.out.println("m1.a = " + m1.a);//0
        System.out.println("m1.c = " + m1.c);//4
       // m1.d-> parent Mammal Class Child Kedi Class'dan variable call edemez
        m1.mA();//Hayvancık Class call
        m1.mC();//Mammal Class call
        m1.mM();//Mammal Class call
    }
}
