package j16_ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {
    public static void main(String[] args) {
        //equals(); -> iki listin index ve elelman eşitliğini montrol eder true/false return

        ArrayList<String> lis1=new ArrayList<>(Arrays.asList("a","b"));
        ArrayList<String> lis2=new ArrayList<>(Arrays.asList("A","b"));
        ArrayList<String> lis3=new ArrayList<>(Arrays.asList("a","b"));
        ArrayList<String> lis4=new ArrayList<>(Arrays.asList("b","a"));

        System.out.println("lis1.equals(lis3) = " + lis1.equals(lis3));//true
        System.out.println("lis2.equals(lis3) = " + lis2.equals(lis3));//false
        System.out.println("lis1.equals(lis2) = " + lis1.equals(lis2));//false
        System.out.println("lis1.equals(lis4) = " + lis1.equals(lis4));//false

    }
}
