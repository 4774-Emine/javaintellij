package j24AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {
        // C01_AccessModifier obj1=new C01_AccessModifier();//private p siz cons. call edilemz
        C01_AccessModifier obj2 = new C01_AccessModifier(23, 45);//public 2 p li cons call edildi
//agama public cons. selam:)
        C02_AccessModifier semra = new C02_AccessModifier();//default p siz cons

        System.out.println("obj2.defaultYas = " + obj2.defaultYas);//33
        obj2.protectedMethod();//protected methoddan agaya selam

        System.out.println("obj2.publicYas = " + obj2.publicYas);//48
        System.out.println("obj2.protectedYas = " + obj2.protectedYas);//40
        //obj2.privateMethod();//private method call edilemz


    }
}