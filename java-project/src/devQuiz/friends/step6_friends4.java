package devQuiz.friends;

import java.util.Scanner;
// gpt private 전역변수를 이용해서 풀기 

public class step6_friends4 {
	private static String name;
    private static int kor, eng, com;

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력할 학생 이름을 입력하세요.");
        name = sc.next();
        do {
            System.out.print("국어 점수를 입력하세요(0~100) = ");
            kor = sc.nextInt();
        } while (kor < 0 || kor > 100);
        do {
            System.out.print("영어 점수를 입력하세요(0~100) = ");
            eng = sc.nextInt();
        } while (eng < 0 || eng > 100);
        do {
            System.out.print("전산 점수를 입력하세요(0~100) = ");
            com = sc.nextInt();
        } while (com < 0 || com > 100);
    }

    public static int total() {
        return kor + eng + com;
    }

    public static double average() {
        Scanner sc = new Scanner(System.in);
        System.out.println("과목수를 입력하세요");
        int c = sc.nextInt();
        return (double) total() / c;
    }

    public static char grade() {
        char result = ' ';
        if (average() <= 100 && average() >= 90) {
            result = 'A';
        } else if (average() >= 80) {
            result = 'B';
        } else if (average() >= 70) {
            result = 'C';
        } else if (average() >= 60) {
            result = 'D';
        } else {
            result = 'F';
        }
        return result;
    }

    public static void output() {
        System.out.println("이름: " + name);
        System.out.println("총점: " + total());
        System.out.println("평균: " + average());
        System.out.println("학점: " + grade());
    }

    public static void main(String[] args) {
        input();
        output();
    }
}
