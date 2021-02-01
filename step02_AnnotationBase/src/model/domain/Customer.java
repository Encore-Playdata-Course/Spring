package model.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//step01 - lombok ������� Customer�� car Ÿ���� ������ ���� �Ұ�
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

//step02 - Car ������ ���� Customer ������ �󿡰� �����ϴ� �ֳ����̼�
// ������ �� ��� ��� : ������ ���� �Ǵ� ������Ƽ ����



@Component
@Scope("prototype")
public class Customer {
	private String name;
	private int age;
	@Autowired
	private Car car;
	@Autowired
	private Car2 car2;
	
	//parameter Ÿ�԰� ��ġ�Ǵ� spring bean�� ������ framework�� ã�Ƽ� �ڵ� ����
	//@Autowired //���� ��? Car�� ������ ������ ��ϵǾ� �ִ� �������� String name, int age ���� �����ϰ� ó���߱� ����
	public Customer(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
		
	
}