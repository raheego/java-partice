package day19.quiz;


//@NoArgsConstructor   // 멤버변수 없는 디폴트 생성자함수
//@AllArgsConstructor  // 모든 멤버변수를 갖고 있는 생성자함수
public class IMessageImplEng implements IMessage {
	String name, greeting;

	// set만 가져오면 됨
	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello() {
		System.out.println("hello");
	}

	@Override
	public String sayMessage() {
		System.out.println("hello world");
		return null;
	}

}
