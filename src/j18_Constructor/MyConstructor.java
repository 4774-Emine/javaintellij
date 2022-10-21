package j18_Constructor;

public class MyConstructor {


    int x=3;
    int y=5;

    public MyConstructor() {
        x+=1;// ins variable +1 update edildi
        System.out.println("-x"+x);
    }

    public MyConstructor(int i ){
        this();//parametresiz cons. call edildi
        this.y = i;//cons. parametresi i değeri  inst. variable y 'ye atandı
        x+=y;//inst. y değeri yine inst. x değerine atandı
        System.out.println("-x"+x);

    }

    public MyConstructor(int i, int i2) {
        this(3);//int parametreli cons. parametre 3 atanarak call edildi
        this.x -= 4;//inst. x variable -4 update edildi
        System.out.println("-x"+x);
    }

    public static void main(String[] args) {
        MyConstructor mc1= new MyConstructor(4,3);//2 int parametre 4 ve 3 atanarak cons. call edildi
    }













}
