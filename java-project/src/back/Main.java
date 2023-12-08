package back;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    	String str =  br.readLine();
    	//일단 입력의 개수가 주어진게 아니므로 입력이 종료되면 종료가 되도록 해야한다. 
    	//앞에서 풀었던 문제에서 더 이상 입력이 없을 경우 입력 받는 것을 종료하는 방법
    	while( (str=br.readLine()) != null ) {
    		System.out.println(str + "\n");
    	}
    	
    }
}

