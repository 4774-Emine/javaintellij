package j11_MethodCreation;

public class C04_MethodDepo {//römork

    //main method-> motor olmayacak -> malzeme taşıyon romörk

    /*
    her class'da main method mecburiyeti yoktur. belilrli aksiyonlara özel class'lar tanımlanabilir..
     */

    public static void gecmeNotu(int not) {

        if (not >= 85) {
            System.out.println("agam tebrik çoook başarılı :)");
        } else if (not >= 70) {
            System.out.println("agam başarılı :)");
        } else if (not >= 60) {
            System.out.println("agam sadece geçtin");
        } else if (not >= 45) {
            System.out.println("agam ucuz yırttın :(");
        } else System.out.println("agam fena çaktın :(");

    }
    public  static void topla(int a,int b){
        System.out.println(a+b);
    }


}
