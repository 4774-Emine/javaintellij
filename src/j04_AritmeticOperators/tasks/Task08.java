package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */
  /*


   */
    public static void main(String[] args){

Scanner sc=new Scanner (System.in);
System.out.println("saniye giriniz: ");
int saniye=sc.nextInt();

int sa=saniye/3600;
int sn=saniye-(sa*3600);
int dk=(saniye/60);
sn=saniye-(dk*60);
        System.out.println(sa+"saat\n"+dk+"dakika\n"+sn+"saniye");






    }
}
