package While;

public class WhileDo {
	public static void main(String[] args) {
		int a=1, b=1; 
		
		while(a>=2) {
			//안쪽 변수의 최기화
			b=1;
			while(b<=3) {
				System.out.println(b+"\t");
				b++; // 증감식
			} // inner end
			
			a++;
			System.out.println();
		} //outer end
	}
}
