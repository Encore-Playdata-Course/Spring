package model.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//step01 - lombok 사용으로 Customer의 car 타입의 변수엔 대입 불가
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

//step02 - Car 스프링 빈을 Customer 스프링 빈에게 주입하는 애노테이션
// 스프링 빈 등록 기술 : 생성자 주입 또는 프로퍼티 주입



@Component
@Scope("prototype")
public class Customer {
	private String name;
	private int age;
	@Autowired
	private Car car;
	@Autowired
	private Car2 car2;
	
	//parameter 타입과 일치되는 spring bean을 스프링 framework가 찾아서 자동 주입
	//@Autowired //오류 왜? Car만 스프링 빈으로 등록되어 있는 설정으로 String name, int age 값을 미흡하게 처리했기 떄문
	public Customer(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
		
	
}
