package kahoot01;

public class Q02 {
    public static void main(String[] args) {
        Y.staticMethod();
    }

}
class X{
    static void staticMethod(){
        System.out.println("Class X");
    }
}
class Y extends X{
    static void staticMethod(){
        System.out.println("Class Y");
    }

}
