package j19_StaticKeyword;

public class T04_Bilgi {

   String isim;
   int yas;
   static String bootcamp;

    public T04_Bilgi(String isim,int yas){

        this.isim=isim;
        this.yas=yas;
    }

    public static void team04(){
        System.out.println("Team 04 çalışıyor");
    }

    public void teamlead(){
        System.out.println("Merve hocamız team teamledimiz...");
    }
}
