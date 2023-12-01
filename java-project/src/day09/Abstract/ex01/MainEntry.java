package day09.Abstract.ex01;

abstract class Shape { // 추상 클래스, super class
	
	double result = 0; 
	public abstract double calc(); // 추상 메소드
	public abstract void draw();
	
	public void show() {  // 일반 메소드
		System.out.println("super class shape");
	}
} // Shape end


class Circle extends Shape { // sub class
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result );
	} 
	
}

class Triangle extends Shape {
	int w = 3, h = 5;
	
	@Override
	public double calc() {
		result = ( w * h ) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result );
	} 
}

class Rectangle extends Shape{
	int x = 5, y = 9;
	
	@Override
	public double calc() {
		result = x * y;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("직사각형의 넓이 : " + result );
	} 
	
}



public class MainEntry {
	public static void main(String[] args) {
		// Shape sh = new Shape(); // 추상 클래스는 미완성 클래스 자체적으로 객체를 생성 할 수 없다. 
		
		Shape sh = new Circle(); // 상속 받은 자손 클래스로는 객체 생성 가능
		sh.draw(); // circle
		sh = new Rectangle();
		sh.draw(); //recctangle
		
		System.out.println();
				
				
		Circle c = new Circle();
		c.draw();
		
//		Triangle t = new Triangle();
//		t.draw();
		new Triangle().draw();
		
		new Rectangle().draw();
	}
}
