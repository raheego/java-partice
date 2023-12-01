package day09.Abstract.ex02;

public class MainEntry {
	public static void main(String[] args) {
		//3. 배열을 이용한 객체 생성
		Shape[] ss = new Shape[3]; // 배열 생성
		ss[0] =  new Circle();
		ss[1] =  new Triangle();
		ss[2] =  new Rectangle();
		
		String[] name = {"원","삼각형","사각형"};
		for(int i = 0; i < ss.length; i ++ ) {
			ss[i].show(name[i]);
		}
		
		System.out.println("2.  = = = = = = = = = = = = ");
		
		//2. shape 부모 추상 클래스를 이용해서 객체 생서
		Shape sh = new Circle();
		sh.show("원");
		sh = new Triangle();
		sh.show("삼각형");
		sh = new Rectangle();
		sh.show("사각형");
		
		System.out.println(" 1. = = = = = = = = = = = = ");
		
		//1. 각자 클래스로 객체 생성 형태
		//	new Circle().show("원");
		Circle c = new Circle();
		c.show("Circle");
		
		Triangle t = new Triangle();
		t.show("Triangle");
		
		Rectangle r = new Rectangle();
		r.show("Rectangle");
		
		
		
	}
}
