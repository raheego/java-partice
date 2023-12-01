package day09.Abstract.ex02;

public abstract class Shape {
	double result = 0; 
	
	public abstract double calc(double x);	//abstract method
	public abstract void show(String name);
	
	public void view() { // 일반 메소드 generic method
		System.out.println("super class Shape");
	}
	
}
