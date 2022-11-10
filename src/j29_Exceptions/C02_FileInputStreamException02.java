package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/yeni/IdeaProjects/javaLearn/src/j29_Exceptions/ebikGabık");
            int k;

            try {
                while ((k = fis.read()) != -1) {
                    System.out.print((char) k);
                }
                System.out.println("agam içteki  try block'tan selamlar :) ");
            } catch (IOException e) {//dosyaya ulaşılır fakat okunamzsa bu catch çalışır
                System.out.println("agam  dosya okuanamayırrr ....");
                System.out.println("agam içteki  catch  block'tan selamlar :) ");
            }
            System.out.println("agam dışdaki  try block'tan selamlar :) ");

        } catch//dosyaya ulaşılmazza bu catch çalışır
        (FileNotFoundException e) {
            System.out.println("agam  dosya ulaşılamıyor  ....");
            System.out.println("agam dışdaki  catch  block'tan selamlar :) ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");
    }
}
