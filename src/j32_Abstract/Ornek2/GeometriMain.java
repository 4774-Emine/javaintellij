package j32_Abstract.Ornek2;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(3, 5);
        dd.setName(" yeni dikdörtgen");
     //   dd.cevre();
     //   dd.alan();
        //System.out.println(dd);
        // dd.cizz();-->bu methodu sout içine alırsak dikdörtgen çizildi yazar
       // methoda giderek.Bunun yerine to stringe cizz() methodu ekledik
        System.out.println(dd);

        Cember cmbr = new Cember(39);
        cmbr.setName(" yeni çember");
        System.out.println(cmbr);

    }
}
