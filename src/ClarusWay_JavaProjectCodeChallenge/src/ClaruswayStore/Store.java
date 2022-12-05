package ClarusWay_JavaProjectCodeChallenge.src.ClaruswayStore;

import java.util.Scanner;

public class Store {

    Scanner scanner = new Scanner(System.in);

    public void run(){

        System.out.println("CW Store Management Paneline Hoşgeldiniz...");
        System.out.println("1) Notebook İşlemleri \n" +
                "2) Marka Listeleme \n" +
                "3) Çıkış Yap \n");

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...");

        switch (scanner.nextInt()){

            case 1:
                NoteBook noteBook = new NoteBook();
                noteBook.menu();
                break;
            case 2:
                Brand.printBrands();
                break;
            case 3:
                System.out.println("Çıkış Ypılıyor...");
                System.exit(0);
                break;
        }
    }
}
