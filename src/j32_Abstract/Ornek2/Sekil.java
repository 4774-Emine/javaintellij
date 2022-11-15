package j32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    }

    public Sekil() {//p siz parent conctractor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();

    //public void cizz(){
   //     System.out.println(this.name+ "çizildi");}-->void method olduğu için to stringe ekleyemedik
    public String cizz(){
        return this.name+ "çizildi";
    }

    @Override
    public String toString() {//obj value leri print eder
        return "ismi =" + this.name +
                "\n Sekil Alan = " + this.alan() +//method call
                "\n Sekil Cevre = " + this.cevre()+
        "\n sekil"+ this.cizz();// method call
    }

    public void ciz() {
        System.out.println(this.name + "çizildi...");
    }
}
