package j32_Abstract.abstract02;

public class Isci extends Personel {//abs Personel parent Clas'a extends->concrete child Isci class
    @Override
    public void maasHesapla() {//Personel parent class'tan override abs method
        System.out.println("Agam marabalara en çok yevmiye 400 gayme verilir:)");
    }

    @Override
    public void maasBilgisi() {//Personel parent class'dan override abs meth.
        System.out.println("Agam marabalar cay-cüğara hariç günde 8 saat kürek mahkumu");

    }//abs personel parent class'a extends-> concrete child Isci class
}
