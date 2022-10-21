package j18_Constructor;

public class C02_Arac {
    //Fields
  String marka;
  String model;
  int km=10;
  double motorHcm;
  boolean vitesAuto=false;
  boolean ikinciEl;
  int yıl;


    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +

                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl ;

    }//MAIN DIŞI

    public static void main(String[] args) {

        C02_Arac arac1=new C02_Arac();//default cons ile arac1 obj create edildi
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHcm=2.4;
        //                       volvo           xc60           50000       default=0        true                2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl+" "+arac1.motorHcm);//




//Task-> 2.biri aracın tüm field'larını atayarak print ediniz
        C02_Arac myCar=new C02_Arac();//default cons ile myCar obj create edildi
        myCar.ikinciEl=false;
        myCar.marka="honda";
        myCar.km=11;
        myCar.model="accord";
        myCar.motorHcm=2.0;
        myCar.vitesAuto=true;
        myCar.yıl=2022;
        System.out.println(myCar.marka+" "+myCar.model+" "+myCar.km+" km "+myCar.yıl+" "+myCar.ikinciEl+" "+myCar.motorHcm+" cc "+myCar.vitesAuto);//
        System.out.println(myCar);//j18_Constructor.C02_Arac@548a9f61






    }



}
