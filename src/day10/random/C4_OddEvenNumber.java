package day10.random;

public class C4_OddEvenNumber {


    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cift sayi ise cift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz

        //1.yol
        int min = 55;
        int max = 120;

        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNum = " + randomNum);

        System.out.println(randomNum % 2 == 0 ? "cift" : "tek");

        //2.yol
        int randomSayi = (int) (Math.random()*80);
        System.out.println("randomSayi = " + randomSayi);
        System.out.println(randomSayi %2 == 0 ? "cift" : "tek");

    }
}
