package day15.innerclass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerMain { // outer class

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - Start");

		// 2
		btn.addActionListener( new ActionListener() { //익명클래스 or 무명클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("action");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
			}
		});

		frame.addWindowListener(new WindowAdapter() { //윈도우 창 닫기 활성화

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}

/* 익명클래스 무명클래스
 * 
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain { // outer class

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - Start");

		// 2
		btn.addActionListener( new ActionListener() { //익명클래스 or 무명클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("action");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
			}
		});

		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}
*/

/* inner class & outer class

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class InnerMain { // outer class

	class EventHandleer implements ActionListener { // inner class

		@Override
		public void actionPerformed(ActionEvent e) { // action event 버튼이 눌렸을 때
			System.out.println("action");
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
			System.out.println();
		}
	}// inner class

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - Start");

		// 1.
		EventHandleer handler = new InnerMain().new EventHandleer();
		btn.addActionListener(handler);

		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}
*/