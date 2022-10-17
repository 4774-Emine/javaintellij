package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm", "Angara", "patGONYA"));
        // subList() -> listenen istenen list parcasını return eder..
        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5));//3.4. index elemalnrı listi veririr [stockholm, Angara]

        ArrayList<String> city=new ArrayList<>(listSehir.subList(2,5));//listSehir'den 2.3.4. index eelamnalrı city liste atandı.
        System.out.println("city = " + city);//city = [Londra, stockholm, Angara]


    }
}
