package day13.Io.generic;

public class GenericEx<T> {
// 타입이 결정나지 않는 함수
	//자료형
	
	T[] v; //멤버변수;
	
	public void set( T[] v) {
		this.v = v;
	}

	public void print() {
		for(T item: v) {
			System.out.println(item);
		}
	}
}
