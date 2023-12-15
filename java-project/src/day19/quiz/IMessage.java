package day19.quiz;


public interface IMessage {
	public void sayHello();
	public String sayMessage();
}

// 해당 인터페이스를 implements 하는 클래스 만들기 IMessageImplEng.java, IMessageImplKor.java
// 빈으로 객체 생성하기 - IMessageImplKor 인사는 생성자 함수 이용
// IMessageImplEng 인사는 setter method 이용할 것 