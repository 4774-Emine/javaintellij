package ClarusWay_JavaProjectCodeChallenge.src.ClaruswayStore;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBook extends Product {

    Scanner scanner = new Scanner(System.in);
    static int nId = 1;
    static List<NoteBook> noteBooks = new ArrayList<>();

    public NoteBook(String name, double price, double discountRate,
                    int amount, Brand brand, double screenSize, int ram, int memory) {
        super(nId, name, price, discountRate, amount, brand, screenSize, ram, memory);
        nId++;
    }

    public NoteBook() {

    }

    @Override
    public void menu() {


        System.out.println("1) Yeni Notebook Ekleme \n" +
                "2) Notebook Listesini Görüntüleme \n" +
                "3) Notebook Silme ");

        System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz....");
        int options = scanner.nextInt();

        if (options == 1) addItem();
        if (options == 2) getProducts();
        if (options == 3) deleteItem();

    }

    @Override
    public void addItem() {

        System.out.println("Ürün Fiyatı");
        double price = scanner.nextDouble();
        System.out.println("Ürünün adı");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Ürünün İndirim Oranı");
        double discountRate = scanner.nextDouble();
        System.out.println("Ürünün Stoğu");
        int amount = scanner.nextInt();
        System.out.println("Ürünün Rami");
        int ram = scanner.nextInt();
        System.out.println("Ürünün Ekranı");
        double screenSize = scanner.nextDouble();
        System.out.println("Ürünün Hafızası");
        int memory = scanner.nextInt();
        System.out.println("Lütfen Ürünün Markasını Listeden Seçiniz...");
        Brand.printBrands();
        Brand brand = Brand.getBrand(scanner.nextInt());
        NoteBook noteBook = new NoteBook(name, price, discountRate, amount, brand, screenSize, ram, memory);
        noteBooks.add(noteBook);
        System.out.println("Eklenen ürünün id'si: " + noteBook.getId());

    }

    @Override
    public void getProducts() {
        print(null);
    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.println("Sİlinmesini istediğiniz ürünün id sini giriniz: ");
        int id = scanner.nextInt();
        noteBooks.remove(id - 1);
        System.out.println("Mevcut Ürün Listesi: ");
        getProducts();
    }

    public void print(List<NoteBook> noteBooks) {
        //Todo:
        /*
        for (:) {

        }

         */
    }
}
