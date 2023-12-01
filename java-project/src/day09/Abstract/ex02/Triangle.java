package day09.Abstract.ex02;

public class Triangle extends Shape {

	@Override
	public double calc(double x) {
		result = ( x * x ) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(7.0);
		System.out.println(result + " 크기 " + name + "이 그려졌습니다." );
	}
	
}
