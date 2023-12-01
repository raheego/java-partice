package day10.Api.utilPkg;

import java.sql.Date;
import java.util.Calendar;

public class MainEntry {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance(); // 추상클래스 자체적으로 객체 생성 못함

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더함
        int day = c.get(Calendar.DATE);

        // 한 줄에 년월일 출력
        System.out.println(year + "년 " + month + "월 " + day + "일");

//        Date date = new Date();
//        int h = date.getHours();
//        int m = date.getMinutes();
//        int s = date.getSeconds();
//        // 한 자리 숫자 앞에 0 추가
//        String formattedTime = String.format("%02d%02d%02d", h, m, s);
//        System.out.println(formattedTime);
        
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        
        c2.set(2022, 12, 23, 0 , 0);
        if( c1.after(c2) ) {
        	System.out.println("0");
        } else if(c.before(c2)){
           	System.out.println("X");
        } else if(c1.before(c2)){
        	System.out.println("=");
        } else {
        	System.out.println("!");
        }
    }
}
