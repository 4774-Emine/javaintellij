package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

 //task-> girilen bir ifadedeki C karakterine kadar a karakter sayısını print eden code create ediniz
Scanner sc = new Scanner(System.in);
        System.out.println("bir string ifade giriniz");

        String biseyler=sc.nextLine();
        int aSayısı=0;
        for(int i=0; i<biseyler.length(); i++) {
            if(biseyler.charAt(i)=='a'){
                aSayısı++;
            }else if(biseyler.charAt(i)=='c'){
                break;
            }
            System.out.println("döngüğde işleme giren karakterler:" + biseyler.charAt(i));
        }
        System.out.println("a sayısı= "+ aSayısı + "tane");
    }
}
