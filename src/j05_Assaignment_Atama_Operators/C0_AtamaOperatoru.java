package j05_Assaignment_Atama_Operators;

public class C0_AtamaOperatoru {
    public static void main(String[] args) {

        //    =	        x = 8	    x = 8
        //    +=	    x += 3	    x = x + 3
        //    -=	    x -= 3	    x = x - 3
        //    *=	    x *= 3	    x = x * 3
        //    /=	    x /= 3	    x = x / 3
        //    %=	    x %= 3	    x = x % 3

        int yas = 33;
        System.out.println(yas + 5);//38-> atama (=) olamdıgı için yas=33 hala

        System.out.println("yas = " + yas);//yas = 33
        System.out.println( yas += 11);//44-> atama yapıldığı için yas=44
    }
}
