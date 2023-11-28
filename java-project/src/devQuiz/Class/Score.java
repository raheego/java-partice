package devQuiz.Class;

public class Score {
	//멤버변수
	private String name;
	private int kor, eng, com, total;
	private double avg;
	private char grade;
	
	//생성자 함수 
    public Score(String name, int kor, int eng, int com) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.com = com;
        calc(); // 생성자에서 계산 메소드 호출
    }
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	
	public void calc() {
		total = kor + eng + com;
		avg = (double)total/ 3 ;
		
		if(avg >= 90) {
			grade = 'A';
		}else if(avg >= 80) {
			grade = 'B';
		}else if(avg >= 70) {
			grade = 'C';
		}else if(avg >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
	}
	
	// output
	public void display() { 
		System.out.println("\n\n****  " +name +"님의 성적표 **********");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c ", total, avg, grade );
	}

	
}
