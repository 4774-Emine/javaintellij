package j26_Inheritance.Inheritance02;

public class Hayvancık {//G parent-super-dede class

    public Hayvancık() {//p'siz cons.
        System.out.println("Agam ahan da HAYVANCIK p'siz cons...");
    }
    public Hayvancık(int i) {//p'li cons.
        System.out.println("Agam ahan da HAYVANCIK p'li cons...");
    }
    public void mA() {
        System.out.println(" mA - > HAYVANCIK  class meth call.");
    }
    public void mM() {
        System.out.println(" mM - > HAYVANCIK  class meth call.");
    }
    int a;
    int m = 3;

}
