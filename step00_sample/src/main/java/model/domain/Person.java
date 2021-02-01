package model.domain;

public class Person {
	private String name;
	private int age;
	public Person() {
		System.out.println("기본생성자");
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("생성자");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName()");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("setAge()");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
