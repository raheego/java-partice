package day09.Interface.quiz;

public class Bus implements Trans{

	@Override
	public void start() {
		System.out.println("버스 왔따~");
	}

	@Override
	public void stop() {
		System.out.println("버스 간다~");
	}
}
