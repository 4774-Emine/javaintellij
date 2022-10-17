package j11_MethodCreation;

public class C04_MethodCreation {//motor

    public static void main(String[] args) {
        String name = "haluk";
        System.out.println("car car "+name);
        C04_MethodDepo.gecmeNotu(24);//depo class'tan class name ile method call edildi
        C04_MethodDepo.topla(3, 5);//8 diğer köy amelesi...
    /*
    farklı class'dan method call etmek için..
    1. method static_> gökteki güneş gibi
    2.ClassName.methodName() şeklinde call edilir
     aynı class'daki method doğrudan methodName ile call edilir...
      */
        selamVer();//aynı class'dan methodName ile call edildi->kendi köyümün amelesi


    }//main dışı

    public static void selamVer() {
        System.out.println("agam selamlar Dewamkeee :)");
    }
}
