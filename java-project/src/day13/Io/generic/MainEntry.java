package day13.Io.generic;

import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc","jkb","kbs"};
		t1.set(str);
		t1.print();
		System.out.println(" ======================= ");
		
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = { 1,2,3,4,5,6,7,8};
		t2.set(num);
		t2.print();
		
		System.out.println(" ======================= ");
		GenericEx<Double> t3 = new GenericEx<Double>();
		Double[] num2 = { 1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0};
		t3.set(num2);
		t3.print();
		
		System.out.println(" ======================= ");
		GenericEx<Object> t4 = new GenericEx<Object>();
		Object[] obj = {"123.4",3, new Date(), "text"};// 객체형 타입도 가능 new Point() 같은것도 들어감
		t4.set(obj);
		t4.print();
		
	}
}

class GeereicEx { 
	
}