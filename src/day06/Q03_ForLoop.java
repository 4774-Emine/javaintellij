package day06;

public class Q03_ForLoop {

    //Convert "Java" to "J*a*v*a*"

	/*	ForLoop
		print even numbers from 100 to 0 but do not use decrement(i--).

		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 ....2 0
      */

    public static void main(String[] args) {
        String s = "Java";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "*");
        }

        System.out.println();
        int num = 100;
        for (int i = num; i >=0 ; i=i-2) {  //i-=2 ifadesi,  i=i-2 ye denktir
            System.out.print(i + " ");
        }

    }


}
