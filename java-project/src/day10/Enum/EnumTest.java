package day10.Enum;

enum Day{
	SUNDAY, MONDAY, THESDAY, WENDSDAY, THURSDAY, FRIDAY, STATURDAY;
}

public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItis() {
		switch (day) {
		case MONDAY:
			System.out.println("월");
			break;
		case THESDAY:
			System.out.println("화");
			break;
		case WENDSDAY:
			System.out.println("수");
			break;
		case THURSDAY:
			System.out.println("목");
			break;
		case FRIDAY:
			System.out.println("금");
			break;
		case STATURDAY:
			System.out.println("토");
		default:
			System.out.println("일");
			break;
		}
	}
}
