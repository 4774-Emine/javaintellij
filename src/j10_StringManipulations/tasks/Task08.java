package j10_StringManipulations.tasks;

public class Task08 {
    public static void main(String[] args) {
/* TASK:
Aşağıdaki string değişkenini kullanarak konsolda isminizi yazdırınız.
String harfDepo="ABCDEFGHIJKLMNOPRSTUVWXYZ";
 */


        String  harfDepo="ABCDEFGHIJKLMNOPRSTUVWXYZ";

        char h=harfDepo.charAt(harfDepo.indexOf("H"));
        char a=harfDepo.charAt(harfDepo.indexOf("A"));
        char l=harfDepo.charAt(harfDepo.indexOf("L"));
        char u=harfDepo.charAt(harfDepo.indexOf("U"));
        char k=harfDepo.charAt(harfDepo.indexOf("K"));


        System.out.println(h+a+l+u+k);//ascii ->toplama->373
        System.out.println(""+h+a+l+u+k);//string->concat->HALUK













    }
}
