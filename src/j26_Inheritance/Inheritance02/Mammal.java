package j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancık {//Hayvancık parent class'ın child class-baba
    public Mammal() {//p'siz cons
        this('Y');// bu class'ın p'li cons call edildi
        System.out.println("Agam ahan da Mammal p'siz cons...");
    }
    public Mammal(char c) {//p'li cons
        super(17);//parent Hayvancık class p'lş cons call edildi
        System.out.println("Agam ahan da Mammal p'li cons...");
    }
    public void mC(){//ezilen method
        System.out.println(" mC - > Mammal  class meth call.");
    }
    int m=1;
    int c=4;
    @Override
    public void mM() {//parentten  ezen method
        System.out.println(" mM - > Mammal  class meth call.");
    }

}// Class sonu
