package day02.Input;

import java.util.Scanner;

//패키지 임포트 하기 : improt

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("integer data input : ");
		int su = sc.nextInt();
		System.out.println("name input : ");
		System.out.println(su);
		
		String name = sc.next();
		System.out.println(su + ", name : " + name);
	}
}
