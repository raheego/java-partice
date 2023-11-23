package While;

public class Quiz_dowhile {
	public static void main(String[] args) {
		int num1 = 1, num2; //변수 초기화
		
		do {
			num2=1;
			
			do {
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				num2++;
			}while(num2<=9);
			
			num1++;
		}while(num1<=9);
	}
}
