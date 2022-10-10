package j13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {

 //Task-> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz...

Scanner sc = new Scanner(System.in);
        String dogruPin="javaCAN";

        String pin=sc.nextLine();
        int girisHakkı=3;
        while(true) {
            System.out.println("pin giriniz");
            String agaPin = sc.nextLine();
            if (agaPin.equals(dogruPin)) {
                System.out.println("gayet başarılı");
                break;
            } else {
                System.out.println("tekrar deneyiniz");
girisHakkı--;
                System.out.println("kalan canınız: "+ girisHakkı);
if(girisHakkı==0){
    System.out.println("can kalmadı");
    break;
}
            }


        }

    }
}
