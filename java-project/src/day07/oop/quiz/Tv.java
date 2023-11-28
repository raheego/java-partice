package day07.oop.quiz;

/* 생성자 함수 */
public class Tv {
	// color, channer;
	private String color;
	private int channel;

	// 생성자 함수
	// 중복정의 가능함 - 중복함수
	// 매개변수가 아무것도 없는게 디폴트 생성자
	public Tv() { // default constructor
		color = "gray";
		channel = 11;
	}

	public Tv(String color) {
		this.color = color;
	}

	public Tv(int channel) {
		this.channel = channel;
	}

	public Tv(String color, int channel) {
		this.color = color;  
		this.channel = channel;
	}

	// getter setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	// output
	public void display() {
		System.out.println(color + " , " + channel);
	}
}
