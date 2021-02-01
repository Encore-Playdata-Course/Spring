package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.common.TemplateAwareExpressionParser;

import model.domain.Singer;
import model.domain.Team;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myArt.xml");
		Team t1 = context.getBean("T",Team.class);
		Singer s1 = new Singer("�糪", 26, "dance");
		t1.setName("TWICE");
		t1.setYear(2015);
		t1.setSinger(s1);
		System.out.println(t1);
		System.out.println(s1);
		
	}
}
