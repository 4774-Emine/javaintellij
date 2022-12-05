package ClarusWay_JavaProjectCodeChallenge.src.LaptopStore;

import java.util.ArrayList;

public class Calculation {

    public static int getRam(ArrayList<String> arr) {

        int price = 0; //300

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("32 gb"))
                price += 300;
            if (arr.get(i).contains("16 gb"))
                price += 200;
            if (arr.get(i).contains("8 gb"))
                price += 100;
            if (arr.get(i).contains("4 gb"))
                price += 50;
        }
        return price;
    }

    public static int getCPU(ArrayList<String> arr) {

        int price = 0; //200

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("i3"))
                price += 200;
            if (arr.get(i).contains("i5"))
                price += 300;
            if (arr.get(i).contains("i7"))
                price += 500;

        }
        return price;
    }

    public static int getColor(ArrayList<String> arr) {

        int price = 0; //150

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("Red"))
                price += 400;
            if (arr.get(i).contains("Orange"))
                price += 300;
            if (arr.get(i).contains("Silver"))
                price += 200;
            if (arr.get(i).contains("Black"))
                price += 150;

        }
        return price;
    }

    public static int getSize(ArrayList<String> arr) {

        int price = 0; //100
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("min"))
                price += 100;
            if (arr.get(i).contains("middle"))
                price += 200;
            if (arr.get(i).contains("max"))
                price += 300;
        }

        return price;
    }


}
