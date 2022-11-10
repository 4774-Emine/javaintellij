package kahoot01;

public class Q06 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            x+=(i<2?i:2*i);
        }
        System.out.println(x);
    }
}
