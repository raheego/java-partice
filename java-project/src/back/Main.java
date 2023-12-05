
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuffer sb1 = new StringBuffer( sc.next() );
        StringBuffer sb2 = new StringBuffer( sc.next() );

        int x = Integer.parseInt(sb1.reverse().toString());
        int y = Integer.parseInt(sb2.reverse().toString());

        int max = Math.max(x, y);

        System.out.println(max);
    }
}
