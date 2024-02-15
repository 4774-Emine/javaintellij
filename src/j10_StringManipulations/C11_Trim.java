package j10_StringManipulations;

public class C11_Trim {
    public static void main(String[] args) {
     /*
     trim() --> istediğimiz string in başında veya sonunda varolan boşluk (space) leri temizler.
      */

        String str = "                 Javacanlara selam olsun    ";
        System.out.println("str.length() = " + str.length());//44
        System.out.println("str.trim() = " + str.trim());
        System.out.println("str.length() = " + str.trim().length());//23

    }


}
