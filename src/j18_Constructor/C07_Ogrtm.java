package j18_Constructor;

public class C07_Ogrtm {//öğretmen obje için kalıphane
    //Fields
    String isim;
    int tecrübe;
    int kıdem=5;


    public C07_Ogrtm(String isim, int tecrübe) {//2 parametreli cons.
       this.isim = isim;//burası olmasaydı ins varaibel a bağlanamadığı için null olurdu
        this.tecrübe = tecrübe;
    }
    public void kıdemHesapla(int kıdem){//int parametreli void method
        System.out.println("agam kıdemin: " + (kıdem*2));//26->method parametresi değeri kıdeme atanır
        System.out.println("agam kıdemin: " + (this.kıdem*2));//10->instance yani obje değeri kıdeme atanır

    }
}
