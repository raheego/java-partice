package day06.argumentVariable;
// 가변길이 함수
public class MainEntry {

	public static void plus(int...x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}	
	
	
	//Main
	public static void main(String[] args) {

	}
}
