package j29_Exceptions;

public class C07_IllegalargumentException02 {
    public static void main(String[] args) {
try {
    System.out.println("Try block başından selam :)");
  hata();
    System.out.println("Try block sonundan selamlar:)");

}catch (IllegalArgumentException e){

    System.out.println("Catch block başından selam:)");
    System.out.println(e);
    System.out.println(e.getMessage());
    e.printStackTrace();
    System.out.println("catch block sonundan selam:) ");
}
        System.out.println("sorun handle edilmiştir DDEWAMKEEEE : )");










    }//main sonu
    public static void hata(){
        throw new IllegalArgumentException("agam nidding yine mi hata :(");
    }

}
