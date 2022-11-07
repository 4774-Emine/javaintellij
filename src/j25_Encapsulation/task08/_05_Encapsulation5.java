package j25_Encapsulation.task08;

import java.util.Scanner;

public class _05_Encapsulation5 {

/* TODO
    Book class'ı verilmiştir.
    İki tane attributes oluşturunuz.
    bookName ve authorName (String ile)
    Book class'ını kapsülleyin. (Encapsulate)
    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String bookName = scan.nextLine();
        String authorName = scan.nextLine();


//BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve Book class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        Book book = new Book();
        book.setAuthorName(authorName);
        book.setBookName(bookName);


        System.out.println("Book name is " + book.getBookName() + " and Author is " + book.getAuthorName());


    }
}

class Book {

    String bookName;
    String authorName;

    public String getBookName() {

        return bookName;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    public String getAuthorName() {

        return authorName;
    }

    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }
}
