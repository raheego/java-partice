package While;

public class MainInputTest {
	/*
		main 한테 데이터를 받아오는 상황
		고정값 일 때 좋ㅇ므
		run - run configurations
		
		<=> Scanner 는 새로운 입력값을 매번 받아야하기 때문에 
	*/
	public static void main(String[] args) { // 여기서 받아오는 데이터 
		System.out.println("String, int = ");
		
		String name = args[0];
		//int su = args[1]; //error = String[] args string type 이니까
		int su = Integer.parseInt(args[1]); // 문자=>숫자로 

		System.out.println(name);
		System.out.println(su);
		
		//비정상 종료될 것을 정상종료 시키는 것 
		if( args.length <= 0 ) {
			System.out.println("데이터 입력하세요");
			return; // 제어권넘기기
		}
	}
}
