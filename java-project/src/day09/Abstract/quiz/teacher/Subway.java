package day09.Abstract.quiz.teacher;

public class Subway extends Trans {

	public String start(String x) {
		go = x;
		return go;
	}

	@Override
	public void show(String wow) {
		start("쿠구쿠구쿠구!!!");
		stop("끽!!!");

		System.out.println(wow + "의 출발은 " + go + "정지는 " + no);

	}

	@Override
	public String stop(String y) {
		no = y;
		return no;
	}

}
