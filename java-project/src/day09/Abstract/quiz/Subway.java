package day09.Abstract.quiz;

public class Subway extends Trans {

	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
	}


	@Override
	public void stop() {
		System.out.println("운행을 멈춥니다.");
	}

	public void run() {
		System.out.println("내릴건가요? y/n");
	}
	

}
