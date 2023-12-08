package day13.Io.BufferdReader.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01_1 {
    public static void main(String[] args) throws IOException {
        // 2개 정수 입력 받고, 1개의 연산자 입력 받아서 사칙연산 프로그램 작성하기
    	
    	System.out.println("숫자를 입력하세요"); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int result = 0; 
        
        System.out.println("+ - * % 을 선택하세요");
        String calc = br.readLine();
    
        switch (calc) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "%":
                result = x % y;
                break;
            case "*":
                result = x * y;
                break;
            default:
            	System.out.println("연산자를 입력하세요");
                break;
        }
        System.out.println("결과: " + result);
    
    }
}
