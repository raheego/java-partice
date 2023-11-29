package day08.inheritance;

public class Rectangle extends Point {
	private int x2, y2;
	
	//생성자 
	public Rectangle() {
		x2 = 50;
		y2 = 80;
	}

	public Rectangle(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	// getter setter
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	//disp
	public void disp() {
		super.display(); // 여기서 출력문도 받기
		System.out.println(", " + x2 + " , " + y2);
	}
}
