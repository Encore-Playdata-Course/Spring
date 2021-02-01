package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
	private String id;
	private int age;
	
	public Customer() {
		System.out.println("Customer()");
	}
}
