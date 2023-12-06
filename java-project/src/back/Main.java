package back;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int i = sc.nextInt();

        // indexOf를 이용하여 문자의 인덱스를 찾음
        int index = s.indexOf(String.valueOf(i));

        // 찾은 인덱스가 -1이면 해당 문자가 문자열에 없는 경우임
        if (index != -1) {
            System.out.println(s.charAt(index));
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }
}
