package j26_Inheritance.Inheritance01;

public class Mammal extends Hayvancık {//Hayvancık parent class'ın child class-baba
    public Mammal() {//p'siz cons
        System.out.println("Agam ahan da Mammal p'siz cons...");
    }
    public void sutBeslenme(){

        System.out.println("bebeleri SUT ile beslenir...");
    }
    public void dogum(){
        System.out.println("nur topu gibi yavrısı olur :) ");
    }
}
