package day06;

public class Q03_ForLoop {
    public static void main(String[] args) {
        //Convert "Java" to "J*a*v*a*"
     /*ForLoop
     print even numbers from 100 to 0 but do not use decrement(i--).
     INPUT:
     OUTPUT:100 98 96 94......2 0
      */


        String str = "Java";

        for (int i = 0; i < str.length(); i++) {//stringlerde index 0 dan baslar
            System.out.print(str.charAt(i) + "*");

        }

        System.out.println();
        for (int i = 100; i >= 0; i =i- 2) {//i-=2 ifadesi de yazılabilir
            System.out.print(i + " ");


        }

    }
}
