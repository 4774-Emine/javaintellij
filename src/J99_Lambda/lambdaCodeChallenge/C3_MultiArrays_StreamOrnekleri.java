package J99_Lambda.lambdaCodeChallenge;
//multi arrayleri cevirirken flatMap kullaniriz yapilis sekli iki turludur
//1) lambda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc","Erik"}
        };

        System.out.println("listele(arr) = " + listele(arr));


    }

    private static List<String> listele(String[][] arr) {
        return Arrays.stream(arr).flatMap(t->Arrays.stream(t)).collect(Collectors.toList());


    }
    // S1 : tum elemanlari list yapalim



    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim



    // S3: E ile baslayan elemanlari liste olarak yazdiralim



    //S4 : k ile bitenlerin sonuna '*' ekleyelim


}
