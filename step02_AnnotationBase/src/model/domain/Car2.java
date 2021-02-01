package model.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

//@Component //<bean id="car" class="model.domain.car"/>
@Component("c2") //<bean id="c" class="model.domain.car"/>
@Scope("prototype") //<bean id="car" class="model.domain.car" scope="prototype"/>
public class Car2 {
	private String carName;
	private int carNumber;
	
	
}