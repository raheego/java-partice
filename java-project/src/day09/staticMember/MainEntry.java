package day09.staticMember;

class Atm {
	int count; // instance member(일반멤버)
	static int total;  // static member
	
	public Atm(int amount) { // 생성자 함수
		count += amount; //count = count + amount
		total += amount;
	}

	public static void view() {
//		count += 100; // static method 에서는 일반 멤버 변수는 사용할 수 없다. 
		total += 100;
	}

	public void show(int count, int total) {
		this.count = count; 
//		this.total = total; // static member에게 this 붙일 수 없다. 
	}
	
	public void display() {
		count = count + 200; 
		total = total + 200;	//instance method 둘 다 사용 가능
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display(); //c : 1000 ,total : 1000

		
		Atm at2 = new Atm(1000);
		at2.display(); //c : 1000 ,total : 2000
		
		System.out.println(Atm.total);
		System.out.println(at.count);
	}
}
