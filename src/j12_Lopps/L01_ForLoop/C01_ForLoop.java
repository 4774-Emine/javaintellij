package j12_Lopps.L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //41 kere maşallah print ediniz...
        System.out.println("41 kere maşallah");
        System.out.println("41 kere maşallah");
        System.out.println("41 kere maşallah");
        System.out.println("41 kere maşallah");
        System.out.println("41 kere maşallah");


        /*Loop->döngü tekrarlanan aksiyonlar için kullanılan code bloklarıdır

         */
//baş.      bitiş      değişim
        for (int i = 1; i <= 41; i++) {//döngü boyunca tekrarlanacak action
            System.out.println("maşallah");

            System.out.println(i + ". maşallah");

        }

        System.out.println("selam javacanlar");//döngü dışı 1 kere run olur


//Task -> 2 basamaklı tek sayıları yanyana print eden code create ediniz->11,13,15,,,,99
        for (int i = 11; i <= 99; i += 2) {
            System.out.println(i + " ");
        }
        System.out.println("   ****   ");
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        //çalışmayan loop
        for (int i = 0; i > 10; i++) {//şartı sağlamayan for body run olmaz
            //kod kırılarak sıradaki satırdan devam eder

            System.out.println("selam javacan");
        }
        System.out.println("bu metni okuduysanız yukardaki for çalışmadı");

        //durmayan loop
      //  for (int i = 0; i >= 0; i++) {//bu for cuğarayı cüpiterden yakana kadar çalışır :)
            //durdurana aşk olsun

         //   System.out.println(i);
      //  }











    }

}
