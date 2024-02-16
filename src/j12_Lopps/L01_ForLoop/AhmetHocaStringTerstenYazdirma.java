package j12_Lopps.L01_ForLoop;

public class AhmetHocaStringTerstenYazdirma {
    public static void main(String[] args) {
        //(INTERVİEW) Kullanıcıdan bir string isteyin ve stringi tersten yazdırın

        String str = "Java çoooooooooooook güzel";
        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.substring(i, i + 1));
        }

        //Stringin ters halini yeni bir string olarak kaydedin.

        String tersStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

           tersStr += str.substring(i,i+1);
        }
        System.out.println("\nters haliyle kaydedilen metin : " + tersStr);
    }
}
