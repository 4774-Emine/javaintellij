package j04_AritmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("   **** Increment-> Artırma *****    ");

        int a=7;

        System.out.println(++a);//8

        System.out.println(a++);//8

        System.out.println(a);//9

        System.out.println(a++ + ++a);//20

    }
}
