package j26_Inheritance.task01;

public class Runner  {
    public static void main(String[] args) {
        A a=new A();

        System.out.println("a.mesaj = " + a.mesaj);//a obj ile static mesaj variable call -> bad practice
        System.out.println("A.mesaj = " + A.mesaj);//A class name ile static mesaj variable call ->best practice
        B b=new B();


        System.out.println("b.mesaj = " + b.mesaj);//"static variable inheritance'da ClassNAme olmadan call edilir";

    }
}
