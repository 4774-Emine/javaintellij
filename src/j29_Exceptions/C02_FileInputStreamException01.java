package j29_Exceptions;

import java.io.FileInputStream;

import java.io.IOException;

public class C02_FileInputStreamException01 {
    /*

             Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
             bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
             Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


            Bir kod yazilirken olasi exception'lar ongorulup
            exception olustugunda Java'nin ne yapmasini istedigimiz
            belirtilmelidir.


                 1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                 kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                     2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                 FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                 FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                 Class'inin parent class Hz.Adem
         */
    public static void main(String[] args) throws IOException {//Hz.Nuh IO işlemleri en parent class exception
        // public static void main(String[] args) throws FileNotFoundException { //read() method import öncesi child exception

        FileInputStream fis = new FileInputStream("/Users/yeni/IdeaProjects/javaLearn/src/j29_Exceptions/ebikGabı");
        //ilgili dosyaya ulaşmak için fis obj tanımlandı parametre olarak ulaşılacak dosya yolu(path) girildi
        //FileNotFoundException-> adres yanlışşsa controlu

        /*
        Eğer bir method'da Checked (CTE riski olan excp.) exception varsa method signature(mnethod name'den sonraki bölüm) hata uyarısı altı kırmızı çizgi verir
        komutun derlenmesine izin vermez ve kod üzerine gelidiğimde Add...  exception handle etme tavsiye eder otamatih throws excp eklenir.
        Bu şekilde methodu call eden komutlat try-catch alınması garanti edilmiş olur.
         */

        int k;
        while ((k = fis.read()) != -1) {//IOException -> evde yoksa controlu
            System.out.print((char) k);//k int  ascci olan file değeri char ici casting-> type dönüşümü

        }

        System.out.println("agam sorun handle edildi DEWAMKEEE :)");


    }
}
