package j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        //task-> arr  tum elemalarının çarpımını print eden code create edinz
        int sayi[][]={{1,2,3},{9,8}};
        int crpm=1;//ilk 1 verielerk carpmada etki etmeyecek değer kullanıldı

        for (int kat = 0; kat < sayi.length; kat++) {//kat kontrolu

            for (int daire = 0; daire < sayi[kat].length; daire++) {//daire kpntrolu
                crpm*=sayi[kat][daire];
            }
        }
        System.out.println(crpm);//432
    }
}
