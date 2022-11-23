package j33_Interface;

public class Sahin extends Tofas implements dısDonanım,icDonanım,Lastik {//concrete child class-->Tofas, implements->dısDonanım,icDonanım,Lastik
    @Override
    public void ebat() {
        System.out.println("agam 16 inç lastik ebat :)");
        System.out.println("Dr bu ne insan yiyecek bunu :)");
    }

    @Override
    public void jant() {
        System.out.println("agam senin gibi janti adama çelik 5 kollu jant yakışır");

    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");
    }

    @Override
    public void yakıt() {
        System.out.println("agam TÜPÜ tak yoksa ocağına incir ağacı :(");
    }

    @Override
    public void kapi() {
        System.out.println("agam 4 kapı sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("agam akordion kaporta gamzesiz olmaz :)");
    }

    @Override
    public void koltuk() {
        System.out.println("agam dri koltuk yazın pişik yaoar içi saman olmasın kafi:)");
    }

    @Override
    public void klima() {
        System.out.println("agam aç camı serinle klima senin neyine:)");
    }



}
