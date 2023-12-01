package day09.Interface.ex02;

import day09.Abstract.ex02.Shape;
import day09.Interface.ex01.IDraw;

public class MultiClass 
					extends Shape implements Test, IDraw {
					// interface도 가넝~
	
	String name = "이순신";
	
	@Override
	public void draw() {
		System.out.println("Idraw interface method");
	}

	@Override
	public void tshow(String name) {
		System.out.println("test interface method");
	}

	@Override
	public double calc(double x) {
		System.out.println("shape abstract method");
		return 0;
	}

	@Override
	public void show(String name) {
		System.out.println("shape interface method");
		System.out.println(name + "hi");
	}

}
