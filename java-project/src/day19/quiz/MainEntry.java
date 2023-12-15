package day19.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		String congif = "quiz/imessageCtx.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(congif);  //설정파일
		
		IMessageImplKor beanKor = (IMessageImplKor)ctx.getBean("kor");
		IMessageImplEng beanEng = (IMessageImplEng)ctx.getBean("eng");		
		
		beanKor.sayHello();
		System.out.println(beanKor.sayMessage());
		System.out.println("******************************");
		beanEng.sayHello();
	}
}
