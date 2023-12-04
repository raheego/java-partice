package day09.Abstract.quiz;

public class Bus extends Trans{

	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("운행을 멈춥니다.");
	}
 
}
