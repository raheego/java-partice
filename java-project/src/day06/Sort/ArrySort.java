package day06.Sort;

import java.util.Arrays;

public class ArrySort {
	public static void main(String[] args) {
	    int[] a = {7, 3, 2, 5, 8};
	    
	    System.out.println("****** sort 전 출력 ******");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        
        //sort
        System.out.print("\n");
        Arrays.sort(a);	//정렬 알고리즘은 이미 내부적으로 처리가 되어 있는 메소드
        // 정렬 후 결과 출력
        System.out.println("\n****** 오름차순 출력 ******");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        
        System.out.println("\n****** 내림차순 ******");
        for (int i = a.length -1; i >= 0; i--) {
            System.out.print(a[i] + "\t");
        }
	}
}
