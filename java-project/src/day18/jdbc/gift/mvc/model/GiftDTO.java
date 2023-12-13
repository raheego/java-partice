package day18.jdbc.gift.mvc.model;

public class GiftDTO { //Model - ~~/o, ~~DTO ~~ TO
	public final String ClassName = "Gift"; //전역변수로
	
	private int gno, g_start, g_end, count; 
	private String gname;
	
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public int getG_start() {
		return g_start;
	}
	public void setG_start(int g_start) {
		this.g_start = g_start;
	}
	public int getG_end() {
		return g_end;
	}
	public void setG_end(int g_end) {
		this.g_end = g_end;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	//final 값 변경 금지 setter 안됨
	public String getClassName() {
		return ClassName;
	}
	
}
