package day15.thread.runnable;

public class UserRunable implements Runnable{
	
	String name;
	
	
	public UserRunable(String name) {
		this.name = name;
	}


	@Override
	public void run() {
//		System.out.println("runnable run() call");
		for (int i = 1; i < 11; i++) {
			if( i == 4 ) {
				 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println(name);
			}
			System.out.println(i);
		}// for end 
	}

}
