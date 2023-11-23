package day04.BreakContinue;

public class Multi {
	public static void main(String[] args) {
		boolean t = true; 
		
		first : {
			second : {
				third : {
					int k = 100; 
					System.out.println("Before the break");
					
					if (t) break second;
					System.out.println("this won`t execute");
					
				}// th end
				
				System.out.println("123"); // 빠져나가는 영역까지 안나옴
			} // se end
			
			System.out.println("This is after second block");
		}// first end 
	}
}
