package j12_Lopps.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

    /*While loop-> önce şart kontrol edilir eğer şart sonucu true alınırsa body actıon çalışır
    dı-While loop-> önce body actıon çalışır sonra şart kontrol edilir. Şart true ise döngü devam eder
    şart false ise döngü kırılır ve döçngüden sonraki ilk satır çalışır.
    do-While loop ->game aoo de daha çok kullanılır.


        Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
        en az bir kez çalışır..

*/

        int yas = 31;
        //  while (yas < 33) {
        //      System.out.println("agam yas " + yas + " gayet basarılı :) while body action ....");

        //      yas++;
        //  }

        do {
            System.out.println("agam yas " + yas + " gayet basarılı :) do while body action");

            yas++;
        } while (yas < 33);


    }
}























