package j11_MethodCreation;

public class C04_MethodDepo {//römork

    //MAİN METHOD OLMAYACAK!//malzeme taşıyan romörk
    /*her classta mein method mecburiyeti yoktur.belirli aksiyonlara özel classlar tanımlanabilir */
    public static void gecmeNotu(int not){
       if(not>=85) {
           System.out.println("agam tebrikler çok başarılı : ");
       }else if(not>=70){
           System.out.println("agam başarılı : ");
       }else if(not>=60) {
           System.out.println("agam sadece geçtin : ");
       }else if(not>=45) {
           System.out.println("agam ucuz yırttın : ");
       }else System.out.println("agam fena çaktın : ");

    }


    public static void topla(int a,int b){
        System.out.println(a+b);
    }

    }







