package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();//method ve variable ları call edebilmel için obje üretildi
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="Ebubekir Güzel İnsan:)";
        System.out.println("mrb1.name = " + mrb1.name);
mrb1.sigorta();//abs parent classtaki concrete method call edildi

        IdariPersonel cncCdr=new IdariPersonel();
        cncCdr.name="Dilek orciklerin efendisi";
        System.out.println("cncCdr.name = " + cncCdr.name);
        cncCdr.sigorta();
        cncCdr.maasHesapla();
        cncCdr.maasBilgisi();
    }
}
