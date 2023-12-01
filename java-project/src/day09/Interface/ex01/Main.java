package day09.Interface.ex01;

public class Main {
	public static void main(String[] args) {
		
		// 1. 
		BB b = new BB();
		b.draw();
		b.show();
		
		//2. 
		IDraw bb = new BB();
		bb.draw();
		
	}
}
