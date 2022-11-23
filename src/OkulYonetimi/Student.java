package OkulYonetimi;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Student extends Person{

    int numara;
    String sinif;

    public Student() {
    }

    public Student(String ad, String soyad, String kimlikNo, int yas, int numara, String sinif) {
        super(ad, soyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }
    ArrayList<Student> studentList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    TryCatch handle=new TryCatch();
    @Override
    public void ekleme() {
        System.out.print("Kaç Öğrenci Eklemek İstiyorsunuz : ");
        int ogrenciSayisi = sc.nextInt();
        while (ogrenciSayisi > 0) {
            System.out.print("Öğrenci Adını Giriniz : ");
            ad = sc.next();
            System.out.print("Öğrenci Soyadını Giriniz : ");
            soyad = sc.next();
            System.out.print("Öğrenci Kimlik No Giriniz : ");
            kimlikNo = sc.next();
            System.out.print("Öğrenci Yaşını Giriniz : ");
            yas = sc.nextInt();
           // handle.illegalArgumentException(yas);
            System.out.print("Öğrenci Numarasını Giriniz : ");
            numara = sc.nextInt();
            System.out.print("Öğrenci Sinifini Giriniz : ");
            sinif = sc.next();
            studentList.add(new Student(ad, soyad, kimlikNo, yas, numara, sinif));
            ogrenciSayisi--;
        }
    }

    @Override
    public void arama() {
        System.out.print("Aramak istediğiniz Öğrencinin Numarasını Giriniz : ");
        int arama= sc.nextInt();
        ListIterator<Student> ito=studentList.listIterator();
        boolean studentFound=false;
        while (ito.hasNext()){
            Student s= ito.next();
            if (s.numara==arama){
                System.out.print("Aradığınız Öğrenci Mevcuttur : "+ s.ad.toUpperCase()+" "+ s.soyad.toUpperCase()+" " + s.sinif.toUpperCase());
                System.out.println();//dummy
                studentFound=true;
            }
        } if (!studentFound){
            System.out.print("Maalesef Bu numaraya Sahip bir Öğrenci Bulunamadı : "+arama);
            System.out.println();//dummy
        }
    }


    @Override
    public void listeleme() {
        for (Student a:studentList){
            System.out.println(a.toString());
        }

    }

    @Override
    public void silme() {
        System.out.print("Silmek istediğiniz öğrencinin kimlik no'sunu giriniz : ");
        String kNo=sc.next();
        boolean studentDelete=false;
        for (int i = 0; i <studentList.size() ; i++) {
            if (studentList.get(i).kimlikNo.equals(kNo)){
                System.out.println(studentList.get(i).ad.toUpperCase()+" "+studentList.get(i).soyad.toUpperCase()+
                        " "+studentList.get(i).sinif.toUpperCase()+ " Siliniyooorrrr....\n"+" Silindi");
                studentDelete=true;
                studentList.remove(i);
            }
        }if (!studentDelete){
            System.out.print("Böyle bir kimlik no eşleşmesi bulunamadı : "+kNo);
        }
    }
    @Override
    public String toString() {
        return
                "Ad= " + ad.toUpperCase() + '\'' +
                        ", Soyad= " + soyad.toUpperCase() + '\'' +
                        "Numara= " + numara +
                        ", Sinif= " + sinif.toUpperCase() + '\'' +
                        ", Yas= " + yas +
                        '}';
    }





}
