package j26_Inheritance.Inheritance02;

public class Kedi extends Mammal {//Mammal parent class Mammal child class-torun

    /*
    Chil class obj olmadan parent class variable ve method'lara ulaşabilir
     */
    public Kedi() {//p'siz cons.
        super();
        System.out.println("Agam ahan da kedi p'siz cons...");
    }
    public Kedi(String  str) {//p'li cons.
        this();
        System.out.println(super.c);
        System.out.println("Agam ahan da kedi p'licons...");
    }

    int c=2;
    int d=5;

    @Override
    public void mC() {//Mammal parent Den ezen method
        System.out.println(" mC - > Kedi  class meth call.");
    }
}// Class sonu
