package J99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {





        public static void main(String[] args) throws IOException {
//TASK 01 --> haluk dosyasini okuyunuz.(Console'a print ediniz.)
            System.out.println("\n TASK 01 --> haluk dosyasini okuyunuz ");
            Path hlk = Path.of("src/J99_Lambda/haluk");//erişilecek dosyanın path'i tanımlandı
            Stream<String> akıs = Files.lines(hlk);
            //Stream<String> akıs1= Files.lines(Path.of("src/J99_Lambda/haluk"));

            akıs.//erişimi verilen dasyadaki satırlar akısa alındı
                    forEach(System.out::println);//akısdaki satırlar(lines) print edildi


            //TASK 02 --> haluk.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print ediniz.)
            System.out.println("\n TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz ");
            Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                    map(String::toUpperCase).//akısdaki  satırların Stringleri byk hrf update edildi
                    forEach(System.out::println);


            //TASK 03 --> haluk dosyasindaki ilk satiri kucuk harflerle print ediniz..
            System.out.println("\n TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz.. ");

            Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                    map(String::toLowerCase).//akısdaki  satırların Stringleri kck hrf update edildi
                    limit(1).//akısdaki ilk eleman(ilk satır) alındı
                    //  findFirst();//akısdaki ilk eleman(ilk satır) alındı
                            forEach(System.out::println);

            //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
            System.out.println("\n TASK 04 --> haluk dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print ediniz.");

            System.out.println(Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                    map(String::toLowerCase).//akısdaki  satırların Stringleri kck hrf update edildi
                    filter(t -> t.contains("basarı")).//akısdaki elemanların basarı içerenleri filtrelendi
                    count()//akısdaki elelmanlar saydırıldı
            );

            //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
            //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
            //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
            //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
            //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
            //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
            //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
            //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz















        }
    }



