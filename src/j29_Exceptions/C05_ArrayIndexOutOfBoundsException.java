package j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException -> array'lerde olomayan bir index elelmanı ile işlem yapıldığında oluşan RTE exception.
        int arr[] = {24, 27, 38, 41, 54};
        System.out.println("arr[0] = " + arr[0]);//24


      //  System.out.println("arr[7] = " + arr[7]);//ArrayIndexOutOfBoundsException
        try {
            System.out.println("arr[7] = " + arr[7]);
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (ArrayIndexOutOfBoundsException ebikGabık) {
            System.out.println("TEE ALLAM YAA agam olmayan array elemanı istirsen :( ");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
        }

        try {
            System.out.println("arr[2] = " + arr[2]);//38
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (ArrayIndexOutOfBoundsException ebikGabık) {
            System.out.println("TEE ALLAM YAA agam olmayan array elemanı istirsen :( ");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
        }

        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}
