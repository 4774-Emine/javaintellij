package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
       // LocalDate date=LocalDate.of(2022,11,33);//RTE -> DateTimeException


        try {
            LocalDate date=LocalDate.of(2022,11,30);

            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (DateTimeException e) {
            System.out.println("agam ahan da hatan :"+ e.getMessage());

            System.out.println("TEE ALLAM YAA agam kasım 33 çeker mi  :( ");
        }

        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}
