package j25_Encapsulation.encapsulation02;

public class Kisi {//pojo class
    /*
    Kisi pojo class için fields-> ad, soyad, password(String), yas
    tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
    (password encapsulated update edilmemeli.)
    yas variable negatif değer girmeye karsı encapsulated

    runner class'da obj ile field ları print eden code create ediniz
     */

    //fields...
    String ad;
    String soyad;
   private int yas;
   private String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0) {
            this.yas=yas*(-1);

        } else this.yas=yas;
        //this.yas = Math.abs(yas);//parametre gelen yas - den kurtularak ins. var atandı
    }

    public String getPassword() {
        return password;
    }


}
