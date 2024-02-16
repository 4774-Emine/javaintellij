package j10_StringManipulations;

import java.util.Scanner;

public class Ahmethoca_task {

    public static void main(String[] args) {

        // kullanıcıdan bir sitring  alın
// Stringin uzunluğu çift sayı ise tam ortasına :) ekleyin
        // Stringin uzunluğu tek sayı ise ortadaki harfi silin ve yerine :( yazdırın
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String metin = sc.nextLine();

        if (metin.length() % 2 == 0) {//uzunluk çift ise
            metin = metin.substring(0, metin.length() / 2) + ":)"
                    + metin.substring(metin.length() / 2);

        } else {//uzunluk tek sayı ise
            metin = metin.substring(0, metin.length() / 2) + ":(" +
                    metin.substring(1 + metin.length() / 2);
        }
        System.out.println(metin);
    }
}
