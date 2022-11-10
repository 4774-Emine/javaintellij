package kahoot01;

public class Q03 {
    public static void main(String[] args) {
        Bb b=new Bb();//AAABBB
    }
}
class Aa {
    static  String s="AAA";
    static{
        s=s+"BBB";
    }
    {
        s="AAABBB";

    }
}
class Bb extends Aa {
    static{
        s=s+"BBBAAA";

    }
    {
        System.out.println(s);
    }

}
