package kahoot01;

public class Q01 {
    int i =10;

    public static void main(String[] args) {
        Q01 a=new B();
        System.out.println(a.i);
    }
}
class B extends Q01{
    int i =20;
}
