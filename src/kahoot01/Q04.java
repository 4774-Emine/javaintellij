package kahoot01;

public class Q04 {
    public static void main(String[] args) {
        Yy.methodOfYy();
    }
}

class Xx {
    static {
        Yy.methodOfYy();
    }
}

class Yy extends Xx {
    static void methodOfYy() {
        System.out.println("Hi ...");
    }
}
