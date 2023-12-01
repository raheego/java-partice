package day09.Abstract.ex02;

public class Rectangle extends Shape{
	@Override
	public double calc(double x) {
//		result = x * y;
		result = x * x; 
		return result;
	}

	@Override
	public void show(String name) {
		calc(5.0);
		System.out.println(result + " 크기 " + name + "이 그려졌습니다." );
	}
}
