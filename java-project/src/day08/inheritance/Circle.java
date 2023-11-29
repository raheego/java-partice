package day08.inheritance;

public class Circle extends Point{ //Sub Class(자식)
	private int r; 
	
	public Circle() {
		r = 5; 
		System.out.println("Point default constructor");
	}

	public Circle(int x, int y, int r) {
		this.r = r;
		System.out.println("Point 3개 constructor call");
	}

	public Circle(int r) {
		this.r = r;
		System.out.println("Point 1개 constructor call");
	}
	
	
	public void display() {
		super.display(); //SuperClass 멤버에 접근
		System.out.println(", " + r);
	}
}
