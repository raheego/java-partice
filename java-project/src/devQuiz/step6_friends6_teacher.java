package devQuiz;

import java.util.Scanner;
// 선생님 code
public class step6_friends6_teacher {
	public static void input() {
        String name = null;
        int kor,eng,com;
        Scanner score_in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        Scanner name_in = new Scanner(System.in);
        name = name_in.nextLine();
        System.out.print("Enter your Korean score : ");
        kor = score_in.nextInt();
        System.out.print("Enter your English score : ");
        eng = score_in.nextInt();
        System.out.print("Enter your Computer score : ");
        com = score_in.nextInt();
        System.out.println("\n\n****  " +name +"님의 성적표 **********");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
        total_cal(kor,eng,com);
    } // input end
	
    public static int total_cal(int kor, int eng, int com) {
        int total=0;
        total = kor + eng + com;
       
        System.out.printf("총점 : %d ", total );
        avg_cal(total);
        return total;
    } // total_cal end
    
    public static double avg_cal(int total) {
        double avg=0.0;
        avg = (double)total/3;
       
        System.out.printf("평균 : %.1f ", avg );
        grade_cal(avg);
        return avg;
    } // avg_cal end
    
    public static void grade_cal(double avg) {
        int avg_tmp=0;
        char grade=' ';
        
        switch((int)avg/10) {
	        case 10:
	        case 9:
	            grade = 'A';
	            break;
	        case 8:
	            grade = 'B';
	            break;
	        case 7:
	            grade = 'C';
	            break;
	        case 6:
	            grade = 'D';
	            break;
	        default:
	            grade = 'F';
        }
        System.out.printf("평점(학점) : %c ", grade );
    } // grade_cal end
    
    public static void output() {
    	input();
    }
    
    public static void main(String[] args) {
        output();
    } // main end
}
