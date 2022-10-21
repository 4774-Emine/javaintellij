package j18_Constructor;

public class C05_Arac {//obj kalıphanesi


    //Fields-> obj'nin uretilirken alacgı değer variables
    //bir class'da bir den çok cons tanımlanabilir
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
    Aksi takdirde Compile Time Error alirsiniz.
            2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaparsanız
    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */
    int maxHız;
    String model;

    public C05_Arac(int maxHız) {//1p'li cons
        this(180,"hacıMurat");//2 p'li cons. call edildi..ilk satıra yazılmalı
        // yoksa cte verir

        // maxHız = maxHız;// this olmadıgı için prmtre değeri inst.
        // variable atanmaz obj maxHız değeri inst. variabledeki default değeri alır
        this.maxHız = maxHız;//->this keyword parmetre değeri inst. variable atama yapar
        //obj maxHız değeri parmetrden alır
        System.out.println("agam bu sefer de 1p'li cons. call edilidi");
    }

    public C05_Arac() {//sefil p'siz cons.
    }

    public C05_Arac(int maxHız, String model) {//2p'li cons.
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("agam bu yazıyı okuduysan 2p'li cons. call edilmiştir :) ");
    }








    public C05_Arac(String model,int maxHız ) {//2p'li cons. prametre sırası farklı
        this.maxHız = maxHız;
        this.model = model;
        System.out.println(" 2p'li cons. call edilmiştir :) ");
    }
}






















