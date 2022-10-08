package j11_MethodCreation;

import java.util.Scanner;

public class Task04 {

/*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */

      static  Scanner sc = new Scanner(System.in);
       static int bakiye=1000;




    public static void main(String[] args) {
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("   ***   ");
        System.out.println("İŞLEM MENÜSÜ : \nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");

seçim();//method call

    }//MAİN DIŞI!!!!!!!

private static void seçim(){
    System.out.println("Yapacağınız işlemi seçiniz :");
    int seçim=sc.nextInt();
    switch(seçim){
        case 1:
            bakiye();
            break;
        case 2:
           paraYatir();
            break;
        case 3:
            paraCek();
            break;
        case 4:
           cıkısYap(); 
            break;
        default:
            System.out.println("Yanlış seçim!!!!");





    }





}

    private static void cıkısYap() {
    }

    private static void paraCek() {
    }

    private static void bakiye() {
        System.out.println("agam bakiye : "+ bakiye);
        System.out.println("işleme devam etmek istiyorsanız->1\nYeter->0");
        int karar=sc.nextInt();
        if(karar==0){
            cıkısYap();
        }else seçim();
    }

    private static void paraYatir() {
        System.out.println("ne kadar yatıracaksın :");
        int yatırılacakMiktar=sc.nextInt();
        bakiye+=yatırılacakMiktar;
        System.out.println("bakiyeniz: "+bakiye);





    }


}



