package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.domain.Car;
import model.domain.Customer;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("di2.xml");
//		Car c = context.getBean("car",Car.class);
//		Customer c = context.getBean("c1",Customer.class);
//		System.out.println(c);//c.toString() - object�� �޼ҵ�� �ּҰ� ��ȯ ����
//		
//		Customer c2 = context.getBean("c1",Customer.class);
//		System.out.println(c2);
//		
//		System.out.println(c.getCar());
//		System.out.println(c2.getCar());
	}

}
