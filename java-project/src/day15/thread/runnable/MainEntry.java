package day15.thread.runnable;

public class MainEntry {
	public static void main(String[] args) {
//		Runnable t1 = new UserRunable("u1");
//		Thread tt1 = new Thread(t1);
//		tt1.start(); x아님
		
		new Thread(new UserRunable("u1")).start();
		new Thread(new UserRunable("u2")).start();
		new Thread(new UserRunable("u3")).start();
	}
}
