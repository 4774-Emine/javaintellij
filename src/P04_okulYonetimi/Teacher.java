package P04_okulYonetimi;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    String bolum;
int sicilNo;

    public Teacher(String ad, String soyad, String kimlikNo, int yas) {
        super(ad, soyad, kimlikNo, yas);
this.bolum=bolum;
this.sicilNo=sicilNo;
    }
List<Teacher> teacherList=new ArrayList<>();
    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {
        System.out.println("Aramak istediğiniz sicil no giriniz");
    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }
}
