package day06.overload;

public class Ex01 {
	
	// 1.
	public static void line(){
		System.out.println("---------------");
	}
   
	//2. 
   public static void line(String str){
        for(int i=1;i<11;i++){
            System.out.print(str);
        }
        System.out.println();
    }
   
   //3.
    public static void line(String str, int n){
        for(int i=1;i<n;i++){
            System.out.print(str);
        }
        System.out.println();
    }
    
	//4.
	public static void main(String[] args) {
		line("&",20);
	    line();
	    line("*",10);
	}
}
