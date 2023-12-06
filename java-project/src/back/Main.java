package back;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] coin = {25, 10, 5, 1};

        while ( t > 0 ) {
            int num  = sc.nextInt();
            int[] arr = new int[4]; // 동전4개로 계산하니깐

            //잔돈 계산
            for (int i = 0; i < cossin.length; i++) {
                arr[i] = num / coin[i];
                System.out.println(num + "," + coin[i]+"," + arr[i]);
                num %= coin[i];
            }

            // 결과 출력
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}

