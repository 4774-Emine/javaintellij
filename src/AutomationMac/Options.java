package AutomationMac;

import java.util.Scanner;

public class Options {
    /*
    urun urun=new Urun();
    1)Kullanıcıya ürünleri göstermeliyiz----->Urun classında bir obj toString()
    2)Scanner---> Scanner classından bir obj create ediniz. [productNum a set edilmeli. setProductNum()]
    3)Loop---> Do-While --->kullanıcı 1-7 rakamları arasında bir seçim yapmalı ve eğer girmiş olduğu rakam
    1 den küçük veya 7 den büyük ise döngü devcam etmeli ve kullanıcı 1-7 arasında bir seçim yapmaya force edilmeli
    4)0 a basarak menüden çıkabilmeli--->Yine Bekleriz...yazısını konsola yazdıralım
    5)Kullanıcıdan productNum (1-7 arasında rakam {Kullanıcı 1 rakamı seçerse Kraker,2 rakamını seçerse cips etc...})--->switch case yapısı kurmalıyım
    6)switch benden ProductNum ve alınan bu productNum a göre ilgili ürünün price ı alınmalı..urun.getKraker(),urun.getCay()....
    (price set edebilmek için ben price ın setPrice() metodunu kullanmalıyım...)
    7)return olarak bana price dönmeli.return getPrice()(double )
     */
    public double select(Urun urun) {
        System.out.println(urun.toString());//consola ürünleri gösterdik
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Lütfen 1 ile 7 arasında bir rakam girerek almak istediğiniz ürünü seçiniz...");
            System.out.println("Çıkış için '0'");
            urun.setProductNum(scanner.nextInt());
            if(urun.getProductNum()<0|| urun.getProductNum()>7){
                System.out.println("Lütfen belirtilen aralıkta bir rakam giriniz...");
            }
        } while (urun.getProductNum()<0|| urun.getProductNum()>7);
        switch(urun.getProductNum()){
            case 0:
                System.out.println("Yine bekleriz...");
                break;
            case 1:
                urun.setPrice(urun.getKraker());
                break;
                case 2:
                    urun.setPrice(urun.getCips());
                    break;
                    case 3:
                        urun.setPrice(urun.getCocaCola());
                        break;
                        case 4:
                            urun.setPrice(urun.getFanta());
                            break;
            case 5:


        }







        return 1.5;//şuan için hata vermemesi için yazılmıştır
    }
}