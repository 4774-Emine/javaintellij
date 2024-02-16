package j12_Lopps.L01_ForLoop;

public class AhmetHocaTask2 {
    public static void main(String[] args) {
        //verilen iki sayı ve aralarındaki tüm sayıları toplayıp yazdırın
        // iki sayıdan hangisinin küçük olduğu bilinmiyor.
         int sayi1= 100;
         int sayi2= 20;
         int toplam=0;

         if(sayi1<sayi2){

             for (int i=sayi1 ; i<=sayi2; i++){
                 toplam+=i;
             }
         }else{
              for (int i = sayi1; i>=sayi2; i--){
                  toplam+=i;
              }
         }
        System.out.println(toplam);


    }
}
