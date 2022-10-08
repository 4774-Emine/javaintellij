package day01;

public class Q04_JavaVariable {

    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme
        int age = 32;
        System.out.println("age = " + age);

        // To copy the variable's value
        int myAge = 34;
        System.out.println("myAge = " + myAge);
        int hisAge = myAge;
        System.out.println("hisAge = " + hisAge);

        // you can declare multiple variables in the same line
        int year = 2022, month = 9, day =19;

        // updating a variable
        year =2032;
        System.out.println("year = " + year);


        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x;
        int y =20000;
        x=123;
        y=3000;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
