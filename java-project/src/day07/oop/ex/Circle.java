package day07.oop.ex;

public class Circle {
	private int x , y, r; // 자동화 하더라도 멤버 변수는 남겨둬라

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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	public void display() {
		System.out.println(x+" , "+y+" , " + r);
	}
	
}
