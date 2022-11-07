package j25_Encapsulation.encapsulation03;

public class Arac {
    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
   olan Araba  isimli bir class cretae ediniz.
   2- bütün fieldları parametre alan bir constructor tanımlayınız.
   3- Runner isminde main için bir class oluşturunuz.
   4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
   5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
     */
    //fields... 2. step
    private String model;
    private String renk;
    private int motor;
    private int yıl;
    public Arac(String model, String renk, int motor, int yıl) {//full p'li telescopic cons. 2. step
        this.model = model;
        this.renk = renk;
       // this.motor = motor;
        setMotor(motor);//set meth call edildi
       // this.yıl = yıl;
        setYıl(yıl);
    }
    public Arac() {// p'siz  cons. 4. step

    }
    public void setMotor(int motor) {
        if (motor < 1000) {
            System.out.println("agam bisklete bineydin daha hızlı giderdin :( ");
            this.motor = 1001;
        } else this.motor = motor;

    }
    public void setYıl(int yıl) {
        if (yıl < 0) {
            this.yıl = (-1) * yıl;
            System.out.println("agam nişşleding milattan önce araba vardı da biz mibinemedik :( ");
        } else this.yıl = yıl;
    }

    public String getModel() {
        return model;
    }

    public void kGabıkMethod(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }


    public int getYıl() {
        return yıl;
    }


    @Override
    public String toString() {
        return "agam tekere daş değmesin :)" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl;
    }
}
