package j12_Lopps.L01_ForLoop;

public class AhmetHocaTask3 {
    public static void main(String[] args) {
        //verilen bir metindeki
        //büyük harf,küçük harf ve space sayılarını bulun
        //space sayısını gözönüne alarak kaç kelime olduğunu,
        //kaç tane küçük ve büyük harf olduğunu yazdırın

        String str= "Java öğrenen işi kapar heey";
        int buyukHarfSayisi=0;
        int kucukHarfsayisi=0;
        int spaceSayisi=0;

        for (int index=0; index<str.length(); index++){
             char karakter= str.charAt(index);

             if (karakter>='a' && karakter<='z'){
                 kucukHarfsayisi++;
             }else if(karakter>='A' && karakter<='Z'){
                 buyukHarfSayisi++;
             }else if(karakter == ' '){
                 spaceSayisi++;
             }
        }

        System.out.println("Metindeki kelime sayısı: "+ (spaceSayisi+1) +
                "\nküçük harf sayısı : " + kucukHarfsayisi+
                "\nbüyük harf sayısı : " + buyukHarfSayisi);



    }
}
