package j12_Lopps.L01_ForLoop;

public class AhmetHocaTask5 {
    public static void main(String[] args) {
        //verilen pozitif bir tamsayı alıp rakamlar toplamını yazdırın
        int sayi=1453;
        int basamakSayisi=(""+sayi).length();
        int rakam=0;
        int rakamlarToplamı=0;

        for (int i = 1; i<=basamakSayisi  ; i++) {
            rakam= sayi%10;

            rakamlarToplamı += rakam;

            sayi/=10;
        }
        System.out.println("Verilen sayinin rakamlar toplamı : " + rakamlarToplamı);
    }
}
