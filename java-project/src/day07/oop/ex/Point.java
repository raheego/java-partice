package day07.opp.ex;

public class Point {
	private int x, y;

	// 생성자 함수
	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x) {
		this.x = x;
		// this.x 은 private int x 힙영역
		// 받아오는 int x 는 외부에서 받는 매개변수 
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}



	//
	//
	public void setX(int xx) {
		x = xx;
	}

	public int getX() {
		return x;
	}

	//
	public void setY(int yy) {
		y = yy;
	}

	public int getY() {
		return y;
	}

	public void display() {
		System.out.println(x + " , " + y);
	}
}
