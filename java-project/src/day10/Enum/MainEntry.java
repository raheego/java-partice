package day10.Enum;

public class MainEntry {
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItis();
		
		EnumTest thirdDay = new EnumTest(Day.WENDSDAY);
		thirdDay.tellItLikeItis();
		
		EnumTest sixthDay = new EnumTest(Day.STATURDAY);
		sixthDay.tellItLikeItis();
	}
}
