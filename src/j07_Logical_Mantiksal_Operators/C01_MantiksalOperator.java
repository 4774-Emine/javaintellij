package j07_Logical_Mantiksal_Operators;

public class C01_MantiksalOperator {
    public static void main(String[] args) {
/*
 -------- && - and - (ve)---------

      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False


     -------- ||- or - (veya)--------- (iyimser)

      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False
 */
        // && ile & arasindaki fark
        // && mükemmelliyetçi
        //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
        // Ancak & tum satırı kontrol eder ondan sonra durur.
        //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir

        //and->ve

        boolean b1 = true;
        int a = 3;
        int c = 7;

        System.out.println(b1 & (a < c));

        System.out.println(b1 && (a > c));

        System.out.println(b1 & (a == c));

        //or->veya
        System.out.println(b1 || (a < c)); //true

        System.out.println(b1 || (a > c)); //true

        System.out.println(b1 || (a == c));//true

        //not->!

        System.out.println(!(b1 || (a > c)));// false


        // **************************AHMET HOCA **************************
        int x = 10;
        int y = 20;
        int z = 15;

        //üçünün birbirine eşit olduğunu kontrol edin
        System.out.println( x==y && y==z); //false

        //x sayısının pozitif ve 2 ile tam bölünebilir olduğunu kontrol edin.
        System.out.println(x>0 && x%2==0); //true

        //y sayısının 10 ile 50 arasında olduğunu kontrol edin
        System.out.println(10<y && y<50); //true

        //y sayısının 10 ile 50 arasında olmadığını kontrol edin
        System.out.println(y<10 || 50<y); //false


    }
}
