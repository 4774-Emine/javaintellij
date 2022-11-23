package j08_ifStatement_TernaryOperator.tasks;

public class _16_if_else_statement_with_logic_operators5 {

    public static void main(String[] args) {

       /*   45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.  */

        double sayi = 80;
        if (sayi % 5 == 0 && sayi % 8 == 0) {
            System.out.println("able to divide by 5 and 8");
        } else if (sayi % 10 == 5 && sayi % 9 == 0) {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }
    }
}
