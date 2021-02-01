package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.domain.Car;
import model.domain.Customer;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		
		//step02 - 
		Customer cust1 = context.getBean("customer", Customer.class);
		System.out.println(cust1.hashCode());			//Customer �ּ� ���� ���
		System.out.println(cust1.getCar().hashCode());	//
		System.out.println(cust1.hashCode());			//Customer �ּ� ���� ���
		System.out.println(cust1.getCar2().hashCode());
		
		//case1 :Customer ������ �� / car ������ ���� �ƴ�
		//cust1.setCar(new Car("a",77));
		
		//case2 :Customer ������ �� / car ������ ��
		//scope="prototype" Car�� ���� ��� Customer�� car������ ����(����) �ϳ�? ����� ??
		
		
		
		//step01 - @Component�� @Scope ������ ����
//		Car c1 = context.getBean("car",Car.class);//@component
//		Car c1 = context.getBean("c",Car.class); //@component("c")
//		System.out.println(c1); 
//		
//		Car c2 = context.getBean("c",Car.class);
//		System.out.println(c2);
	}

}