package day12.quiz;

public class Video {
	protected String title;
	protected String category;
	protected String lend; //대여여부
	protected String lendName; //대여자
	protected String lendDate; //대여날짜
	
	//생성자함수 default
	public Video() {
		
	}
	
	
	public Video(String title, String category, String lend, String lendName, String lendDate) {
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}


	public void display() {
		System.out.println("비디오제목    : " + title);
		System.out.println("장르    : " + category);
		System.out.println("대여여부 : " + lend);
		System.out.println("고객명 : " + lendName);
		System.out.println("대여일자 : " + lendDate);
	}
	
	
}
