package j04_AritmeticOperators.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;
        x += x;
        --x;
        x = 7 + x;
        x *= x;
        x -= 3;

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;
        a+=d;
        d-=a;
        a-=d;

        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
        
        

	}

}
