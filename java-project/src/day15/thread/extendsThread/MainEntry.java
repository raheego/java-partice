package day15.thread.extendsThread;

public class MainEntry {
	public static void main(String[] args) {
		Thread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
//		t1.run(); //x 스레드 구현한게 아님
		t1.start(); // run() 유도함
		t2.start(); 
		t3.start(); 
		
		//run 메서드를 직접 호출하면 스레드가 생성되지 않고 
		//현재 스레드에서 일반적인 메서드 호출로 처리됩니다. 
		//따라서 start 메서드를 사용하여 스레드를 시작해야 합니다.
		
		//세 개의 스레드가 각각 동시에 실행되므로 출력 결과는 서로 섞일 수 있습니다.
	}
}
