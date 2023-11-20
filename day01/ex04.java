public class EX04 {
	public static void main(String[] args) {
		// 1은 가위, 2는 바위, 3은 보
		// Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.   => Player는 클래스로 생성
		// player01이 가위, 바위, 보 중 랜덤하게 하나를 선택    => 클래스 안에는(이름, 무기)
		// player02가 가위, 바위, 보 중 랜덤하게 하나를 선택    => 객체 생성, 이름을 player1로 저장, 랜덤으로 가위바위보 중 하나 저장
		// 둘 중에 이긴 사람 출력, 무승부면 계속 반복           =>

		Player player01;
		player01 = new Player();

		Player player02;
		player02 = new Player();


		player01.name="홍길동";
		player02.name="임꺽정";

		player01.weapon=(int)(Math.random()*3)+1;
		player02.weapon=(int)(Math.random()*3)+1;

		while(player01.weapon == player02.weapon) {
			System.out.println(player01.weapon);
			System.out.println(player02.weapon);
			System.out.println("무승부");
			player01.weapon = (int) (Math.random() * 3) + 1;
			player02.weapon = (int) (Math.random() * 3) + 1;
		}
		System.out.println(player01.weapon);
		System.out.println(player02.weapon);
		if (player01.weapon == 1  && player02.weapon == 2 || player01.weapon == 2 && player02.weapon==3 || player01.weapon==3 && player02.weapon==1) {
				System.out.println("임꺽정 승리");
		} else {
				System.out.println("홍길동 승리");
		}
	}
}