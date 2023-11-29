package day08.inheritance.quiz2;

public class Student extends Person {
	private int jumsu;
	
	public Student() {
		
	}

	public Student(String name, String gender, int age, int jumsu) {
		super(name, gender, age);
		this.jumsu = jumsu;
	}

	public Student(int jumsu) {
		super();
		this.jumsu = jumsu;
	}
	
	//getter setter
	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	
	//output
	public void disp() {
		super.disp();
		System.out.println(" 점수 : " + jumsu);
	}
}
