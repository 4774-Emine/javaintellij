package day06;

import java.util.Scanner;

public class Q05_NestedForLoop {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("satir sayisi :"); int satir = scanner.nextInt();
        System.out.print("sutun sayisi :"); int sutun = scanner.nextInt();

        for (int i = 1; i <=satir; i++) {       //i =1         i=2         i=3
            for (int j = 1; j <= sutun; j++) {  //* * * * *    * * * * *   * * * * *
                System.out.print("* ");
            }
            System.out.println(); //dumy, bu bosluk olmazsa hepini yan yana yazar
        }
    }


}
