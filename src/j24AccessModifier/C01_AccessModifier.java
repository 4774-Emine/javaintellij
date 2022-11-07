package j24AccessModifier;

        /*
     1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
     Diğer class'lardan "private" class memler'lari kullanamaz.

         2) Diğer package'lerden   olusturulan object için class'i import edilmeli

         3) Diğer package'lerden default class memberlara erişilemez.
          "default" ile "package private" es anlamlidir.

         4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

          5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
         için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

          6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
          Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.*/




public class C01_AccessModifier {
    private int privateYas = 24;
    int defaultYas = 33;   //Access modifier yazılmazsa default olarak tanımlanır
    protected int protectedYas = 40;
    public int publicYas = 48;


        private C01_AccessModifier() {//private p'siz cons.->kendi clastan erişilebilir
            System.out.println("agama private cons. selam :)");
        }

    public C01_AccessModifier(int privateYas, int defaultYas) {//public 2p'li cons.
        System.out.println("agama public cons. selam:)");
    }


    private void privateMethod(){
        System.out.println("private method'dan agaya selam:)");
    }

    protected void protectedMethod(){
        System.out.println("protected methoddan agaya selam");
    }
//C01_AccessModifier obj3=new C01_AccessModifier();//private cons call edildi aynı class
}
