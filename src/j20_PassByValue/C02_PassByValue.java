package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {

        //Task-> verilen fiyat için %11,%22 ve %33 indirimli fiyatı print eden methodlar create ediniz
        double fiyat = 100;//primitive double type variable
        System.out.println("method call öncesi fiyat değeri= " + fiyat);//100


        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir22(fiyat) = " + indir22(fiyat));
        // System.out.println("indir33(fiyat) = " + indir33(fiyat));

        System.out.println("method call sonrası fiyat  değeri = " + fiyat);//100


    }//main sonu

    private static double indir11(double fiyat) {//girilen fiyatın %11 indirimli hali=fiyatın %89 return eden method
        return fiyat *= 0.89;
    }

    private static double indir22(double fiyat) {
        return fiyat * 0.78;

    }

    private static void indir33(double fiyat) {
        fiyat *= 0.67;
        System.out.println(fiyat);
        fiyat += 200;
        System.out.println("fiyat = " + fiyat);

    }


}









