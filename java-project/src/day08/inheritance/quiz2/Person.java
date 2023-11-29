package day08.inheritance.quiz2;


public class Person {
	protected String name, gender;
	protected int age;
	
	//생성자 함수 
	public Person() {

	}
	
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//output
	public void disp() {
		System.out.print("이름 : " + name + " 성별 : " + gender + " 나이 : " + age);
	}
	
	
}
