package day10.Api.object.quiz;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		String str1 = "abcDEFGHeijwEIMPYmnqr";
		String[] s = str1.split("");

		StringBuilder result = new StringBuilder();
		for (int i=0; i<str1.length();i++) {
			if (s[i].charAt(0) >= 97) {
				result.append(s[i].toUpperCase());
			} else {
				result.append(s[i].toLowerCase());
			}
		}
		  System.out.println(result.toString());	
		
		
		
		//2.
		String str = "abcDEFGHeijwEIMPYmnqr";
		String str2 = "";
		char ch;

		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				str2 += (char)(ch + 'A' - 'a');
			}
			else
				str2 += (char)(ch - 'A' + 'a');		
		}
		System.out.println(str2);
		
	}
}
