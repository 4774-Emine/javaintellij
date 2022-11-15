package P04_okulYonetimi;

public class Student extends Person {

int numara;
int sinif;

    public Student(String ad, String soyad, String kimlikNo, int yas) {
        super(ad, soyad, kimlikNo, yas);
        this.numara=numara;
        this.sinif=sinif;    }


    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }
}
