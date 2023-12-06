package day13.Io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("input = ");
		
		try { 
			int su; 
			
			while( (su = System.in.read()) != -1 ) { // while ( su != -1 ) { } 
				if ( su == 10 || su == 13 ||  su == 32 ) continue; 
				if ( su == 113 || su == 81 ) break; // 'q' 'Q' 아스키코드값
				
				char ch = (char)su;
				System.out.println(ch);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
