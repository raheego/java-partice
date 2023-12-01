package day09.Interface.ex03;

import day09.Abstract.ex02.Shape;
import day09.Interface.ex01.IDraw;
import day09.Interface.ex02.MultiClass;

public class MainEntry {
	public static void main(String[] args) {
		MultiClass mc = new MultiClass();
		
		mc.draw();
		mc.tshow("감강찬");
		mc.show("광개토대왕");
		System.out.println(" =========================== ");
		IDraw i = new MultiClass();
		i.draw();
		System.out.println(i.su);
		System.out.println(" =========================== ");
		Shape s = new MultiClass();
		System.out.println();
		s.show("김희선");
	}
}
