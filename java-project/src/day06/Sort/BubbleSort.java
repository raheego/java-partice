package day06.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7, 3, 2, 5, 8};
        int tmp;

        System.out.println("****** sort 전 출력 ******");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) { // 마지막 값은 최대값이니 교환하지 않기 때문에 -1
                if (a[j] > a[j + 1]) { 
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            } // j end
        } // i end

        // 정렬 후 결과 출력
        System.out.println("\n****** sort 후 출력 ******");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
