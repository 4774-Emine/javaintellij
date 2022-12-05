package ClarusWay_JavaProjectCodeChallenge.src.LaptopStore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {

    public ArrayList<String> AllData(int laptopID){

        //5 farklı ürün için 5 farklı list create edeceğiz.
        //Marka, size (min, max, middle), Ram (32, 16, 8,4), CPU (i3, i5,i7), Color (black, orange, silver, red)

        Map<Integer,ArrayList<String >> allData = new HashMap<>();

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Apple");
        l1.add("middle"); //300
        l1.add("32 gb"); // 500
        l1.add("i5"); // 150
        l1.add("Black");// 100
        //1050
        allData.put(110001,l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Samsung");
        l2.add("max");
        l2.add("16 gb");
        l2.add("i7");
        l2.add("Red");
        //850
        allData.put(110002,l2);

        ArrayList<String> l3 = new ArrayList<>();
        l3.add("Lenovo");
        l3.add("min");
        l3.add("8 gb");
        l3.add("i3");
        l3.add("Silver");
        //750
        allData.put(110003,l3);

        ArrayList<String> l4 = new ArrayList<>();
        l4.add("Apple");
        l4.add("max");
        l4.add("32 gb");
        l4.add("i7");
        l4.add("Orange");
        allData.put(110004,l4);

        ArrayList<String> l5 = new ArrayList<>();
        l5.add("Asus");
        l5.add("middle");
        l5.add("4 gb");
        l5.add("i3");
        l5.add("Black");
        allData.put(110005,l5);


        return allData.get(laptopID);



    }
}
