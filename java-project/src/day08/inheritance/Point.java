package day08.inheritance;

// 상속

public class Point { //Super class(부모)
	//private int x , y ; 
	protected int x , y ; 
	
	public Point() {
		x = y = 100;
		System.out.println("Point default constructor");
	}

	public Point(int x) {
		this.x = x;
		System.out.println("Point 1개 constructor call");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 2개 constructor call");
	}

	//getter setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.print(x+ " , " + y);
		
	}
	
}
