package day01.dataType;

public class DataType2 {
	public static void main(String[] args) {
		String str = "A";
		char ch = 'A';
		char ch2 = 67;
		char ch3 = 'b';
		
		int su = 20; 
		String name = "rahee";
		double dd = 12.34;
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch2+","+(char)ch2);
		System.out.println("name = " + name);
		System.out.println("실수형 데이터 : " + dd);
		
		
		System.out.printf("%f %f\n", dd, 12.3456);
		System.out.printf("%10.1f %.2f\n", dd, 3.14566); // 총 10 자리를 만드는데 소숫점 한자리 땡기고 앞에 9자리 공백
		
		for(int i=65; i <= 90; i++) {
			System.out.print( (char)i + " "); //형변환 아스키코드
		}
		
		System.out.println("\n==============================\n");
		
		for(int i='a'; i <='z'; i++) {
			System.out.print( (char)i+" ");
		}
		
		System.out.println("\n boolean type");
		boolean flag = true; //
		System.out.println(flag);
	}
}
