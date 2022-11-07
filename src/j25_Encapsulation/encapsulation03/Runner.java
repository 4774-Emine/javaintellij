package j25_Encapsulation.encapsulation03;

public class Runner {//3. step
    public static void main(String[] args) {
    // 4. step..
        Arac honda=new Arac("accord","siyah",-200,2012);
        Arac volvo=new Arac("s80","beyaz",2000,-2015);

        Arac haciMurat=new Arac();
        haciMurat.kGabıkMethod("serce");
        haciMurat.setMotor(1300);
        haciMurat.setYıl(1974);
        haciMurat.setRenk("cücük SARI");
        System.out.println("honda ne ararsan vae onda "+honda);
        System.out.println("haci murat "+haciMurat);
        System.out.println("isvec tankı : "+volvo);
        methodHaluk();
    }

    private static void methodHaluk() {
    }


}
