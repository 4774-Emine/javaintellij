package ClarusWay_JavaProjectCodeChallenge.src.LaptopStore;

import java.util.ArrayList;

public class PriceOneForLaptop {

    public int getPrice(int laptopID){

        Data pcPrice = new Data();

        ArrayList<String> pc = pcPrice.AllData(laptopID); // 110001
        int totalAmount = Calculation.getSize(pc) + Calculation.getCPU(pc) + Calculation.getRam(pc) + Calculation.getColor(pc);
        return totalAmount;
    }
}
