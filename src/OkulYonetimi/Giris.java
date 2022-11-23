package OkulYonetimi;

import java.util.Scanner;

public class Giris {

    Scanner sc=new Scanner(System.in);
    Student stu=new Student();
    Teacher tcr=new Teacher();
    public void giris() {
        String secim;
        do {
            System.out.println("====================================");
            System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
            System.out.println("====================================");
            System.out.println("1- ÖĞRENCİ İŞLEMLERİ\n" + "2- ÖĞRETMEN İŞLEMLERİ\n" + "Q- ÇIKIŞ");
            secim = sc.next().toUpperCase();

            switch (secim) {
                case "1":
                    islemler();
                    ogrenciMenu();
                    break;
                case "2":
                    islemler();
                    ogretmnMenu();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Yanlış seçim Yaptınız");
                    sc.nextLine();
                    break;
            }
        } while (!secim.equals("Q"));

    }
    public void islemler(){
        System.out.println("============= İŞLEMLER =============");
        System.out.println("1-EKLEME\n" +
                "2-ARAMA\n" +
                "3-LİSTELEME\n" +
                "4-SİLME\n" +
                "5-ANA MENÜ\n" +
                "Q-ÇIKIŞ");
    }
    public void ogretmnMenu(){
        String scmOgrtmn=sc.next().toUpperCase();
        switch (scmOgrtmn){
            case "1":
                tcr.ekleme();
                break;
            case "2":
                tcr.arama();
                break;
            case "3":
                tcr.listeleme();
                break;
            case "4":
                tcr.silme();
                break;
            case "5":
                giris();
                break;
            case "Q":
                giris();
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }



    }
    public void ogrenciMenu(){
        String scmOgrci=sc.next().toUpperCase();
        switch (scmOgrci){
            case "1":
                stu.ekleme();
                break;
            case "2":
                stu.arama();
                break;
            case "3":
                stu.listeleme();
                break;
            case "4":
                stu.silme();
                break;
            case "5":
                giris();
                break;
            case "Q":
                giris();
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }


    }

}



