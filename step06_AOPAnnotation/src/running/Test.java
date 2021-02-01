package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step01.biz.annotation.Car;

public class Test {

	public static void main(String[] args) {
		//? 컨테이너 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		
		//? Car 빈객체
		Car car = context.getBean("biz",Car.class);
		System.out.println("== before ==");
		System.out.println("== after ==");
		car.buy();
		
		try {
			car.saleMoney(500);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		System.out.println("==========");
		String v = car.buyReturn();
		System.out.println("반환된 데이터 값 : " + v);
	}

}
