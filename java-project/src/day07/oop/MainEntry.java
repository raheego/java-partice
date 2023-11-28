package day07.oop;

import day07.ex.Point;

class Point { 
	//int x, y; // 멤버변수 default 접근지정자 , int 0 초기화 , double&float = 0.0; String = null 초기화
	private int x, y;
	
	//멤버함수
	// set 쓰기 역할
	public void setX(int xx) {
		x = xx; 
	}
	public void setY(int yy) {
		y = yy;
	}
	
	// get 읽기 전용 역할
	public int getX() {
		return x;
	}
	public int getY() { 
		return y; 
	}
	
	public void display() {
		//System.out.println(x+ " , " + y);
		System.out.println(getX()+ " , "+ getY());
	}
	
} // point end


class Circle { 
	private int x, y, r; 
	
	//getter setter
	public void setX(int xx) {
		x = xx;
	}
	public void setY(int yy) {
		y = yy;
	}
	public void setR(int rr) {
		r = rr;
	}
	public int getX() {
		return x; 
	}
	public int getY() {
		return y;
	}
	public int getR() {
		return r; 
	}
	
	//output
	public void display() {
		System.out.println(getX()+ " , "+getY() + " , " + getR() );
	}
	
} // circle end




public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); // 객체생성 메모리할당 생성자함수 자동호출
		
		// 직접 접근은 절대 안됨 원칙적으로 안돼
		// 바깥에서 위 변수를 건들였기에
//		pt.x = 3; 
//		pt.y = 5; 
//		System.out.println(pt.x + ", " + pt.y);
		
		// 개선 
		System.out.println(pt.getX() + " , "+ pt.getY()); //0,0
		pt.setX(33);
		pt.setY(99);
		//System.out.println(pt.getX()+ " , "+ pt.getY()); //55 100
		pt.display();
		
		
		// 3. circle 객체 생성해서 출력
		Circle cir = new Circle();
		cir.setX(50);
		cir.setY(20);
		cir.setR(5);
		cir.display();
	}
} // main end 
