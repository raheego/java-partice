package day09.Interface.quiz;

public class Subway implements Trans{

	@Override
	public void start() {
		System.out.println("지하철 도착~");
	}

	@Override
	public void stop() {
		System.out.println("지하철 간다~");		
	}

}
