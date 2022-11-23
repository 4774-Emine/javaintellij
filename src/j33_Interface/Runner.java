package j33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin dgshn=new Sahin();
        dgshn.ebat();;
        dgshn.jant();
        dgshn.kapi();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.koltuk();
        dgshn.motor();
        System.out.println("dgshn.sisLamp() = " + dgshn.sisLamp());//default conc meth olduğu için obje ile call edildi
        dgshn.sunroof();
        dgshn.yakıt();
        System.out.println("dısDonanım.RENK = " + dısDonanım.RENK);
       // icDonanım.KUMAS="deri"-->CTE Çünkü final variable atama ya-pıl-maz
        System.out.println("icDonanım.KUMAS = " + icDonanım.KUMAS);
        System.out.println("icDonanım.RENK = " + icDonanım.RENK);
       // System.out.println("Lastik.RENK = " + RENK//AYNI İSİMDEKİ VARİABLELER İNTERFACE İSMİ İLE CALL DİLİR
                System.out.println("icDonanım.MUSIC = " + icDonanım.MUSIC);
        dısDonanım.anten();//static concrete method interface name ile call edildi
    }
}
