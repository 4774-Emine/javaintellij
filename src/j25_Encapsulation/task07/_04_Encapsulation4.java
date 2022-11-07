package j25_Encapsulation.task07;

import java.util.Scanner;

public class _04_Encapsulation4 {

/* TODO
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo

   Bütün variable'lar için getter ve setter oluşturunuz.

    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.

    Main class'ın içinde;
    userName rent is amountOfRent
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int roomCount = scan.nextInt();
        boolean balconyOrNo = scan.nextBoolean();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve rentApartments class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        rentApartments amountOfRent = new rentApartments(); // Kira miktarı
        amountOfRent.setName(name);
        amountOfRent.setRoomCount(roomCount);
        amountOfRent.setBalconyOrNo(balconyOrNo);


        int rent = amountOfRent.getBalkon(balconyOrNo) + amountOfRent.getRent(roomCount);
        System.out.println(amountOfRent.getName() + " rent is " + rent);


    }
}

class rentApartments {

    private String name;
    private int roomCount;
    private boolean balconyOrNo;


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRoomCount() {

        return roomCount;
    }

    public void setRoomCount(int roomCount) {

        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {

        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {

        this.balconyOrNo = balconyOrNo;
    }


    private int rent = 0;


    public int getRent(int roomCount) {

        if (roomCount == 0) {
            this.rent = 1400;
        } else if (roomCount == 1) {
            this.rent = 1700;
        } else if (roomCount == 2) {
            this.rent = 2200;
        } else if (roomCount == 3) {
            this.rent = 2700;
        }
        return this.rent;
    }

    public int getBalkon(boolean balconyOrNo) {

        if (balconyOrNo == true) {
            this.rent += 200;
        }
        return this.rent;
    }
}
