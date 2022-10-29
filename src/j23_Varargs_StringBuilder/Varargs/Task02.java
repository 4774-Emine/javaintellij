package j23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

         */
        System.out.println("toplaCarp(2,24,23,38,33,21,59,26,10) = " + toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));
        int arrTop[] = {24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println("toplaCarp(3,arrTop) = " + toplaCarp(2, arrTop));

    }//main sonu


    public static int toplaCarp(int carpilacakSayi, int... toplanacakSayılar) {
        int toplam = 0;
        for (int a : toplanacakSayılar) {
            toplam += a;
        }
        return carpilacakSayi * toplam;
    }
/*
Muharrem bey cözum :)
  ArrayList<Integer> sayi  =new ArrayList<Integer>();
        while  (sc.nextInt()!=0) {
                sayi.add(sc.nextInt());
        }
        Integer []arr=sayi.toArray(new Integer[0]);
        System.out.println("hesapla(sayi) = " + hesapla(arr));
    }  //main sonu
    public static int hesapla(Integer... sayilar) {
        int x = 0;
        for (int i = 1; i < sayilar.length; i++) {
            x += sayilar[i];
        }
        x *= sayilar[0];
        return x;
    }

 */
}
