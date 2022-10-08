package day01.day04;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {


        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        String s = "xyaz";
        boolean xyzIceriyorMu = false;
        if(s.contains("xyz")){
            xyzIceriyorMu = true;
            System.out.println(xyzIceriyorMu);
        }else {
            xyzIceriyorMu=false;
            System.out.println(xyzIceriyorMu);
        }


        //2.yol->System.out.println(s.contains("xyz"));


    }


}
