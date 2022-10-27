package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("vize notunuzu giriniz: ");
double vize=sc.nextDouble();
        System.out.println("final notunu giriniz: ");
        double fnl=sc.nextDouble();
        System.out.println("proje notunu giriniz: ");
        double prj=sc.nextDouble();

        System.out.println("Genel Not: " + ((vize*0.30)+(fnl*0.50)+(prj*0.20)));

    }
}
