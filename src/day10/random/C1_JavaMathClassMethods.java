package day10.random;


import java.util.Random;

public class C1_JavaMathClassMethods {

    public static void main(String[] args) {
        int a = -12;
        int b = 4;

        System.out.println("a nin mutlak degeri =  " + Math.abs(a)); // 12
        System.out.println("a ve b den en buyuk olani = " + Math.max(a, b)); // 4
        System.out.println("2,6,8 den en buyuk olani = " + Math.max(2, Math.max(6, 8))); // 8
        System.out.println("a ve b den en kucuk olani = " + Math.min(a, b)); // -12
        System.out.println("b nin kare koku = " + Math.sqrt(b)); // 2
        System.out.println("2 nin 3.kuvveti" + Math.pow(2, 3)); // 8  -> pow(taban, us)
        System.out.println("round 3.1 i yuvarla = " + Math.round(3.1)); // 3
        System.out.println("round 3.5 i yuvarla = " + Math.round(3.5)); // 4
        System.out.println("3.1 sayisinin ust tamsayiya yuvarlama = " + Math.ceil(3.1)); // 4 -> tavan
        System.out.println("3.5 sayisinin ust tamsayiya yuvarlama = " + Math.ceil(3.5)); // 4
        System.out.println("3.1 sayisinin alt tamsayiya yuvarlama = " + Math.floor(3.1)); // 3 -> taban
        System.out.println("3.5 sayisinin alt tamsayiya yuvarlama = " + Math.floor(3.5)); // 3

        //Math.random() : double veri tipine sahip olarak algılar ve 0.0-1.0 arasında rastgele sayı üretir.

        //random() methoduyla rastgele deger uretme
        double dbsayi = Math.random()*100;
        System.out.println("dbsayi = " + dbsayi);

        //int degerler uretme
        int intSayi = (int) (Math.random()*50);
        System.out.println("intSayi = " + intSayi);

        int max = 20;
        int x = (int) (Math.random()*max);
        int y = (int) (Math.random()*max);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(x<y ? "x min":"y min");


        //Java Math.Random Class  0.0-1.0

        for (int i = 0; i < 10; i++) {
            System.out.println( (i+1) + " . sayi " + Math.random());
        }

        System.out.println();
        //Random Class -> java.util.Random  sayi uretmeye 1 den baslar
        Random random  = new Random();
        for (int i = 0; i < 10; i++) {
            int randomSayi = random.nextInt(100); //1 ile 100 arasinda
            System.out.println("intSayi = " + randomSayi);
        }



      //  for (int i = 0; i < 10; i++) {
      //      int randomSayi = new Random().nextInt(100); //1 ile 100 arasinda
      //      System.out.println("intSayi = " + randomSayi);
      //  }
    }
}
