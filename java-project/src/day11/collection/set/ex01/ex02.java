package day11.collection.set.ex01;

import java.util.HashSet;
import java.util.Set;

//import java.lang.*;// 자동 임포트

class Person { //extends Object 가 생략되고 있었다.
	String name;
	int age;
	
	//생성자 함수
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//생략가능한 hascode , equals, toString 
	// 재정의 하려고 불러다 쓴거임
	// 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age; // 같은 글자는 같은 주소를 가지고 있기에 구분하기 어려우니깐 + age를 넣어줌
//		return Objects.hash(name, age); //같은 의미
	}

	@Override // 재정의 = 문자는 같은 주소를 바라보기 때문에 String 타입에 특성 때문에 이를 재정의함
	public boolean equals(Object obj) {
		if ( obj instanceof Person ) {
			Person temp = (Person)obj; // obj = obejct 타입이고 temp는 person 타입이니 , 형이 작은 타입이니 형변환
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	} 
	
	
	//toString
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]\n";
		}
	
} // person end 

public class ex02 {
	public static void main(String[] args) {
		Set set = new HashSet();

		set.add(new String("happy"));
		set.add(new String("happy"));
		set.add(new String("cool"));
		
		Person ps = new Person("aaa", 20);
		set.add(ps);
		set.add(new Person("David", 30));
		set.add(new Person("David", 20));
		set.add(new Person("David", 20));
		set.add(new Person("David", 20));
		set.add(new Person("David", 10));
		System.out.println(set);
		//set은 순서x중복x
		//문자는 같은 주소를 바라보기 때문에 String 타입에 특성때문
		//이를 방지를 하기 위한 hashCode와 @Override로 구분자를 넣음(age)
		
		
//		A a = new A();
//		B b = new B();
//		A bb = new B();
//		
//		//instanceof true false ??  앞에 있는 애가 뒤에 있는 애로 객체 생성이 되느냐를 물어봄
//		System.out.println(b instanceof A); // true 
//		System.out.println(bb instanceof B); // true 
//		System.out.println(a instanceof A); // true 
//		System.out.println(a instanceof B); // false a라는 객체가 B라는 얘로 생성이 되느냐
//		
		
 	}
} 

class A { 
	String name;
}

class B extends A {
	
}