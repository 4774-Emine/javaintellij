package kahoot01;


import java.util.ArrayList;
import java.util.List;

public class Q08 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(1);
        List<Integer> y = new ArrayList<>();
        y.add(1);
        System.out.println(x.equals(y));
        System.out.println(x==y);
    }
}
