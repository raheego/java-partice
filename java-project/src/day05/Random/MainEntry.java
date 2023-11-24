package day05.Random;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println( Math.random() ); // 0.0 ~ 1.0
		System.out.println( (int)Math.random() ); // 0
		System.out.println( (int)(Math.random() * 5) + 1 );
		
		for( int i = 0; i < 5; i ++ ) {
			System.out.print( (int)(Math.random() * 45) + 1 +"\t");
		}
		
		System.out.println();
		
		Random rand = new Random();
		System.out.println( rand.nextInt() );
		System.out.println( rand.nextInt(5) ); //0 ~ 4
		System.out.println( rand.nextInt(10) + 2 ); //0,1 안나옴 
		
		// random class 이용
		System.out.println("random class 이용");
		for(int i=0; i<=6; i ++ ) {
			System.out.print( rand.nextInt(45) + 1 +"\t");
			
		}
		
	}
}
