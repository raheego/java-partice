package back;

import java.util.Scanner;

public class Main {  
    public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	StringBuffer reverseStr = new StringBuffer(str).reverse();
    	
    	if ( str.equals(reverseStr.toString()) ) {
    		System.out.println("1");
    	} else {
    		System.out.println("0");
    	}
    	
    }
}

