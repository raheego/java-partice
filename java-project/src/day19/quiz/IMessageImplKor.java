package day19.quiz;


//@AllArgsConstructor
//@Data
public class IMessageImplKor implements IMessage {
	String name, greeting;

	//생성자
	public IMessageImplKor(String name, String greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}

	//set만 가져오면 됨
	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello() {
		System.out.println("안녕");

	}

	@Override
	public String sayMessage() {
		System.out.println("안녕하세요");
		return null;
	}

}
