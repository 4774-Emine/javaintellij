package day03;

public class Q02_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {
        double fiyat =25;
        
        String result = fiyat<10 ? "ucuz":fiyat<20 ? "normal" :"pahali";
        System.out.println("result = " + result);

        System.out.println(fiyat<10 ? "ucuz":fiyat<20 ? "normal" :"pahali");
    }
}
