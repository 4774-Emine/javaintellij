package j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method runn ederek ınteger'e cevirildiğinde oluşan RTE exception
        // java'da String içinde ki rakam karakterler parseInt() method ile ınt değere atanabilir

        String str = "1453";
        System.out.println("str+5 = " + str + 5);//14535 -> concat edilir
        int sayi = Integer.parseInt(str);//str deki rakam karakter sayi variable atandı
        System.out.println("sayi = " + sayi);//1453
        System.out.println("sayi+5 = " + (sayi + 5));//1458

        String id = "57l622";
        //System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException
        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (NumberFormatException e) {

            System.out.println("TEE ALLAM YAA agam l'den 1 yazmamı  istirsen :( ");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");

        }

        try {
            System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str));//1453
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (NumberFormatException e) {

            System.out.println("TEE ALLAM YAA agam l'den 1 yazmamı  istirsen :( ");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");

        }

        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}
