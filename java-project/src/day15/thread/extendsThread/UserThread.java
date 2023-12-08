package day15.thread.extendsThread;

public class UserThread extends Thread {

	String name;
	
	public UserThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() { //스레드 실행부(구현부)
//		super.run(); //부모가 갖고 있는 run() 호출
		
		//스레드가 실행될 때 수행할 작업을 정의하는 메서드
		for (int i = 1; i <= 10; i++) {
			
			if ( i == 3 ) { //3이되면 중지 sleep
				try {
					sleep(3000); //예외발생  1/1000 = 1s
					// 1초 동안 스레드를 일시 정지시킴
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(name);
			}
			System.out.println(i);
		}
	}
	
}
